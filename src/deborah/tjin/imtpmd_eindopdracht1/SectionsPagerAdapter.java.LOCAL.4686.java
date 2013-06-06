package deborah.tjin.imtpmd_eindopdracht1;

import java.util.ArrayList;
import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *  
 * @author Deborah Tjin
 *
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter
{
	//Declaratie arraylist
	private ArrayList<Fragment>fragmentLijst;

	//constructor
	public SectionsPagerAdapter(FragmentManager fm, List<Fragment>fragmentLijst) 
	{ 
		super(fm);
		
		//Arraylist wordt aangemaakt
		this.fragmentLijst = (ArrayList<Fragment>) fragmentLijst;
	}


	//Haalt positie van fragment terug
	public Fragment getItem(int index) 
	{
		return fragmentLijst.get(index);
	}

	
	//Haalt het aantal fragments dat in de arraylist zit terug
	public int getCount()
	{

		return fragmentLijst.size();
	}

}
