package deborah.tjin.imtpmd_eindopdracht1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OpdrachtenFragment extends Fragment 
{
	

	public OpdrachtenFragment(){	
	}
	
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.opdrachten_tab,
				container, false);

		return rootView;
	}


}


