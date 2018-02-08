
public abstract class PlayableMedium extends WholeItem
{
	private int playtime;
	public PlayableMedium(String referenceID, String title, String description, int playtime, int price, double vat)
	{
		super(referenceID, title, description, price, vat);
		this.playtime = playtime;
	}
	
	public int getPlayTime()
	{
		return playtime;
	}
	
	public void print()
	{
		super.print();
		System.out.println("play time: " + playtime + " mins");
	}


}
