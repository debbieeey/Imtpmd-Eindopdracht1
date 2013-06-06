package deborah.tjin.imtpmd_eindopdracht1;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

<<<<<<< HEAD
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
=======
public class SectionsPagerAdapter extends FragmentPagerAdapter
{
	private ArrayList<Fragment>fragmentLijst;

>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	public SectionsPagerAdapter(FragmentManager fm, List<Fragment>fragmentLijst) 
	{ 
		super(fm);
		
<<<<<<< HEAD
		//Arraylist wordt aangemaakt
=======
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
		this.fragmentLijst = (ArrayList<Fragment>) fragmentLijst;
	}


<<<<<<< HEAD
	//Haalt positie van fragment terug
=======
	@Override
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	public Fragment getItem(int index) 
	{
		return fragmentLijst.get(index);
	}

	
<<<<<<< HEAD
	//Haalt het aantal fragments dat in de arraylist zit terug
=======
	@Override
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
	public int getCount()
	{

		return fragmentLijst.size();
	}

}
