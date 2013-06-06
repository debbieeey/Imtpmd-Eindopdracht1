package deborah.tjin.imtpmd_eindopdracht1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * 
 * @author Deborah Tjin
 *
 */

public class VerzendenFragment extends Fragment implements OnClickListener
{
	private View rootView;
	private Communicator communicator;
	
	//constructor
	public VerzendenFragment(){	
		
	}
	
	
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

	}
	
	
	//Deze methode zorgt er voor dat de inhoud van de xml zichtbaar 
	//wordt in de app
	//Button wordt aangemaakt
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		rootView = inflater.inflate(R.layout.verzenden_tab,
				container, false);
		
		Button button = (Button) rootView.findViewById(R.id.button1);
		button.setOnClickListener(this);

		return rootView;
	}


	@Override
	//Wanneer er op de wordt geklikt, worden de gegevens 
	//naar de server verzonden
	public void onClick(View arg0) {
		Log.d("debug", "klik");

		// haal gegevens op uit de UI
		EditText editTextNaam = (EditText) rootView
				.findViewById(R.id.textView1);
		String naam = editTextNaam.getText().toString();

		EditText editTextVraag = (EditText) rootView
				.findViewById(R.id.textView2);
		String vraag = editTextVraag.getText().toString();

		EditText editTextIp = (EditText) rootView.findViewById(R.id.textView3);
		String serverIp = editTextIp.getText().toString();

		EditText editTextPort = (EditText) rootView
				.findViewById(R.id.textView4);
		int serverPoort = Integer.parseInt(editTextPort.getText().toString());

		//Maakt verbinding met server
		this.communicator = new Communicator(this, naam,
				vraag, serverIp, serverPoort);

		
	}

	//Toont bericht/antwoord
	public void setReceivedServerMessage(String string) {
		((MainActivity) getActivity()).shareData(string);
	}

	
	

}
