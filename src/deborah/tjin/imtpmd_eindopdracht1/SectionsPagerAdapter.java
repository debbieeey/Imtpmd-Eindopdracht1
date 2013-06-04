package deborah.tjin.imtpmd_eindopdracht1;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter
{
	private ArrayList<Fragment>fragmentLijst;

	public SectionsPagerAdapter(FragmentManager fm, List<Fragment>fragmentLijst) 
	{ 
		super(fm);
		
		this.fragmentLijst = (ArrayList<Fragment>) fragmentLijst;
	}


	@Override
	public Fragment getItem(int index) 
	{
		return fragmentLijst.get(index);
	}

	
	@Override
	public int getCount()
	{

		return fragmentLijst.size();
	}

}
