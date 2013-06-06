package deborah.tjin.imtpmd_eindopdracht1;

import java.util.ArrayList;
import java.util.List;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

/**
 * 
 * @author Deborah Tjin
 *
 */
public class MainActivity extends FragmentActivity implements ActionBar.TabListener 
{

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	//Declaratie
	SectionsPagerAdapter sectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	//Declaraties
	ViewPager viewPager;
	VerzendenFragment verzendTab;
	OpdrachtenFragment opdrachtTab;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//Laat de xml activity_main zien
		
		// De actionbar wordt aangemaakt
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		
		//ArraList wordt aangemaakt
		List<Fragment> fragmentLijst = new ArrayList<Fragment>();
		
		
		//Objecten worden aangemaakt
		this.verzendTab = new VerzendenFragment();
		this.opdrachtTab = new OpdrachtenFragment();
		
		
		//Klasse VerzendenFragment wordt aan de arraylist toegevoegd
		//Klasse OpdrachtenFragment wordt aan de arraylist toegevoegd
		fragmentLijst.add(verzendTab);
		fragmentLijst.add(opdrachtTab);
	
		
		//Er wordt een adapter aangemaakt.
		//Deze zal steeds een fragment terughalen 
		sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), fragmentLijst);

		
		//Viewpager wordt aangemaakt. 
		//Deze zal er voor zorgen dat de gebruiker 
		//door de pagina's kan swipen
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(sectionsPagerAdapter);

		
		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		viewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() 
				{
					@Override
					public void onPageSelected(int position) 
					{
						actionBar.setSelectedNavigationItem(position);
					}
				});
		
		
		//Tab verzendTab wordt aangemaakt in de actionBar
		//Deze bevat een tablistener, zodat je er ook op kan klikken
		//De tab wordt toegevoegd aan de actionBar
		Tab verzendTab = actionBar.newTab();
		verzendTab.setText("Verzenden");
		verzendTab.setTabListener(this);
		actionBar.addTab(verzendTab);
		
		//Tab opdrachtTab wordt aangemaakt in de actionBar
		//Deze bevat een tablistener, zodat je er ook op kan klikken
		//De tab wordt toegevoegd aan de actionBar
		Tab opdrachtTab = actionBar.newTab();
		opdrachtTab.setText("Opdrachten");
		opdrachtTab.setTabListener(this);
		actionBar.addTab(opdrachtTab);
	}


	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) 
	{
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	//Haalt data op van OpdrachtenFragment
	public void shareData(String string)
	{
		opdrachtTab.shareData(string);
		// TODO Auto-generated method stub
		
	}

}
