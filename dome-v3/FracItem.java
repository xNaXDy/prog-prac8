
public abstract class FracItem extends Item
{
	private String unitMeasure;
	public FracItem(String referenceID, String title, String description, int price, String unitMeasure, double vat)
	{
		super(referenceID, title, description, price, vat);
		this.unitMeasure = unitMeasure;
	}
	
	public String getUnitMeasure()
	{
		return unitMeasure;
	}
	
	public void print()
	{
		super.print();
		System.out.print("unit measure: " + unitMeasure);
	}

}
