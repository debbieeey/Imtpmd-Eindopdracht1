package deborah.tjin.imtpmd_eindopdracht1;

public class ListViewItem 
{

	private int id;
	private String naam;
	
	public ListViewItem(int id, String naam)
	{
		this.id = id;
		this.naam = naam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
}
