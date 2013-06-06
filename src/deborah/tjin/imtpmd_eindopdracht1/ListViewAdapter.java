package deborah.tjin.imtpmd_eindopdracht1;

import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * 
 * @author Deborah
 *
 */
public class ListViewAdapter extends BaseAdapter
{
	
		//Declaratie arraylist
		//Deze wordt gevuld in de klasse OpdrachtenFragment
		private ArrayList<ListViewItem> itemList;

		//Constructor
		public ListViewAdapter(ArrayList<ListViewItem> itemList)
		{
			// Arraylist wordt aangemaakt
			this.itemList = itemList;
		}

		public int getCount() 
		{
			// Geeft het aantal objecten terug dat in de 
			//arraylist zit
			return itemList.size();
		}

		public Object getItem(int position) 
		{
			// Geeft het item dat op gevraagde positie staat
			return itemList.get(position);
		}

		public long getItemId(int position) 
		{
			//Geeft positie terug
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) 
		{
			//Convertview laat xml pagina item zien op het scherm
			if (convertView == null) 
			{
				LayoutInflater inflater = LayoutInflater.from(parent.getContext());
				convertView = inflater.inflate(R.layout.item, parent,
						false);
			}

			//Haalt item uit ListViewItem en die wordt op de gevraagde 
			//positei gezet
			ListViewItem item = (ListViewItem) getItem(position);

			// Naam van Textview 
			TextView itemNaam = (TextView) convertView.findViewById(R.id.textView1);

			// Textview wordt gevuld met naam van item
			itemNaam.setText(item.getNaam());

			return convertView;
		}

	

}
