package deborah.tjin.imtpmd_eindopdracht1;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * @author Deborah Tjin
 *
 */

public class VerzendenFragment extends Fragment
{
	//constructor
	public VerzendenFragment(){	
	}
	
	
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

	}
	
	
	//Deze methode zorgt er voor dat de inhoud van de xml zichtbaar 
	//wordt in de app
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.verzenden_tab,
				container, false);

		return rootView;
	}


	public void setReceivedServerMessage(String string) 
	{
		((MainActivity) getActivity()).shareData(string);
		// TODO Auto-generated method stub
		
	}

	

	
	

}
