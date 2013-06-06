package deborah.tjin.imtpmd_eindopdracht1;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
/**
 * 
 * @author Deborah Tjin
 *
 */

public class VerzendenFragment extends Fragment
{
	//constructor
=======

public class VerzendenFragment extends Fragment
{
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	public VerzendenFragment(){	
	}
	
	
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

	}
	
	
<<<<<<< HEAD
	//Deze methode zorgt er voor dat de inhoud van de xml zichtbaar 
	//wordt in de app
=======
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.verzenden_tab,
				container, false);

		return rootView;
	}

<<<<<<< HEAD

	public void setReceivedServerMessage(String string) 
	{
		((MainActivity) getActivity()).shareData(string);
		// TODO Auto-generated method stub
		
	}

=======
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	

	
	

}
