
public class VideoGame extends Item
{
	private String publisher;
	
	public VideoGame(String theTitle, String publisher, int time)
	{
		super(theTitle, time);
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
