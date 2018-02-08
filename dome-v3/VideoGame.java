
public class VideoGame extends PlayableMedium
{
	private String publisher;
	
	public VideoGame(String referenceID, String theTitle, String publisher, String description, int playtime, int price, double vat)
	{
		super(referenceID, theTitle, description, playtime, price, vat);
		this.publisher = publisher;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void print()
	{
		super.print();
		System.out.println("publisher: " + publisher);
	}

}
