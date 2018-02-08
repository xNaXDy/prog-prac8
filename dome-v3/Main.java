
public class Main
{
	
	public static void main(String[] args)
	{
		Database db = new Database();
		db.createDatabase();
		db.list();
		
		Basket b = new Basket();
		
		for(int i = 0; i < db.getItems().size(); i++)
		{
			b.addItem(db.getItems().get(i));
		}
		
		b.printBasket();
	}

}
