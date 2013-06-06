package deborah.tjin.imtpmd_eindopdracht1;

<<<<<<< HEAD
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * 
 * @author Deborah Tjin
 *
 */
public class OpdrachtenFragment extends Fragment 
{
	//Declaraties
	public static final String ARG_SECTION_NUMBER = "section_number";
	private JSONObject jsonObject;

	//constructor
	public OpdrachtenFragment(){	
	}
	
	
=======
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OpdrachtenFragment extends Fragment 
{
	

	public OpdrachtenFragment(){	
	}
	
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
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
		View rootView = inflater.inflate(R.layout.opdrachten_tab,
				container, false);
<<<<<<< HEAD
		
		ListView listView = (ListView) rootView.findViewById( R.id.listView1 );
		
		Log.d("deborah", rootView.findViewById(R.id.listView1)+"" );
		
		//Arraylist wordt aangemaakt
        ArrayList<ListViewItem> itemList = new ArrayList<ListViewItem>();
        
        //De arraylist wordt gevuld met items
        itemList.add(new ListViewItem(1, "Week 2: ListView"));
        itemList.add(new ListViewItem(2, "Week 3: Drag-n-Drop"));
        itemList.add(new ListViewItem(3, "Week 4: Tabblad widget"));
        itemList.add(new ListViewItem(4, "Week 5: SharedPreferences"));
        itemList.add(new ListViewItem(5, "Week 5: SQLite"));
        itemList.add(new ListViewItem(6, "Week 6: WebView browser"));
        
        //Adapter wordt aangemaakt
        ListViewAdapter arrayAdapter = new ListViewAdapter(itemList);
        
        arrayAdapter.notifyDataSetChanged();
        
        listView.setAdapter(arrayAdapter);
=======
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6

		return rootView;
	}


<<<<<<< HEAD
	public void shareData(String string) 
	{
		
		Log.d("data", string);
		jsonObject = null;

		try {
			jsonObject = new JSONObject(string);
			JSONArray opdracht = jsonObject.getJSONArray("opdracht");
			Log.d("json",opdracht.toString());
			
		} catch (JSONException e) {
			Log.d("debug", "try gaat fout");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}


=======
>>>>>>> b3a7a9e8eae374480cbdfb20d739ed5b23f0bfb6
}


