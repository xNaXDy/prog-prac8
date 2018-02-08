import java.util.ArrayList;
import java.util.List;

public class Basket
{
	private List<Item> items;
	public Basket()
	{
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item it)
	{
		items.add(it);
	}
	
	public void printBasket()
	{
		System.out.println("-------------------");
		System.out.println("  Basket Contents");
		System.out.println("-------------------\n");
		for(int i = 0; i < items.size(); i++)
		{
			items.get(i).print();
			System.out.println();
		}
		System.out.println("-------------------\n");
		System.out.println("Total Price (ex. VAT): $" + getBasketPriceBeforeVAT());
		System.out.println("Total Price (inc. VAT): $" + getBasketPriceAfterVAT());
	}
	
	public void removeItem(Item it)
	{
		if(items.contains(it))
			items.remove(it);
	}
	
	public void removeItemAt(int index)
	{
		if(index > 0 && index < items.size())
			items.remove(index);
	}
	
	public int getBasketPriceBeforeVAT()
	{
		int ret = 0;
		for(int i = 0; i < items.size(); i++)
		{
			ret += items.get(i).getPriceBeforeVAT();
		}
		return ret;
	}
	
	public int getBasketPriceAfterVAT()
	{
		int ret = 0;
		for(int i = 0; i < items.size(); i++)
		{
			ret += items.get(i).getPriceAfterVAT();
		}
		return ret;
	}

}
