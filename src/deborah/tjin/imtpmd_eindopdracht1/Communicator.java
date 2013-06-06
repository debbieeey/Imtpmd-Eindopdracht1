package deborah.tjin.imtpmd_eindopdracht1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import android.util.Log;


public class Communicator implements Runnable 
{
	//Declaraties
	private VerzendenFragment activity;
	private Thread thread;
	private String reponse = null;
	private String naam;
	private String vraag;
	private String ip;
	private int poort;

	//Constructor
	public Communicator(VerzendenFragment activity, String naam, String vraag, 
			String ip, int poort)
	{
		//VerzendenFragment
		this.activity = activity;

		//Dit zijn de gegevens om naar de server te verbinden
		this.naam = naam;
		this.vraag = vraag;
		this.ip = ip;
		this.poort = poort;

		//De thread zorgt ervoor dat je gegevens kan sturen en ontvangen 
		//van en naar de server
		this.thread = new Thread(this);
		this.thread.start();
	}


	//In deze methode wordt de thread gerund
	@Override
	public void run() 
	{
		Log.d("debug", "In de thread");
		try {
			Socket serverSocket = new Socket();
			serverSocket.connect(new InetSocketAddress(this.ip, this.poort),
					4000);

			// Verzend bericht naar server
			this.sendMessage(this.vraag, serverSocket);

			this.reponse = waitForResponse(serverSocket);

			Log.d("debug", "In de try run");

		}

		catch (UnknownHostException e) 
		{
			Log.d("debug", "can't find host");
		}

		catch (SocketTimeoutException e) 
		{
			Log.d("debug", "time-out");
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		// catch (InterruptedException e)
		// {
		// e.printStackTrace();
		// }
		
		this.activity.setReceivedServerMessage(reponse);

	}

	//In deze methode wordt bericht verstuurd naar de server
	private void sendMessage(String message, Socket serverSocket) 
	{
		OutputStreamWriter outputStreamWriter = null;

		Log.d("debug", "in de sendMessage");
		try {
			outputStreamWriter = new OutputStreamWriter(
					serverSocket.getOutputStream());
			Log.d("debug", "in de sendMessage try");
		}

		catch (IOException e2) {
			e2.printStackTrace();
		}

		if (outputStreamWriter != null) 
		{
			BufferedWriter bufferedWriter = new BufferedWriter(
					outputStreamWriter);
			PrintWriter writer = new PrintWriter(bufferedWriter, true);

			writer.println(message);

			Log.d("debug", "in de sendMessage en write message aangeroepen + "
					+ message);
		}
	}

	// Wachten op antwoord
	private String waitForResponse(Socket serverSocket) 
	{
		String serverMessage = null;
		BufferedReader bufferedReader = null;

		try {
			InputStream inputStream = serverSocket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (bufferedReader != null) {
			try {
				serverMessage = bufferedReader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Log.d("debug", serverMessage);
		return serverMessage;
	}

}

