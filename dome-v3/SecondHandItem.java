
public class SecondHandItem extends WholeItem
{
	private int grade;
	public SecondHandItem(String referenceID, String title, String description, int price, int grade, double vat)
	{
		super(referenceID, title, description, price, vat);
		this.grade = grade;
	}
	
	@Override
	public int getPriceBeforeVAT(int quantity)
	{
		return (int)Math.round((double)super.getPriceBeforeVAT() * (1-getDiscount())) * quantity;
	}
	
	@Override
	public int getPriceAfterVAT(int quantity)
	{
		return (int)Math.round((double)getPriceBeforeVAT(quantity) * super.getVAT());
	}
	
	private double getDiscount()
	{
		return grade <= 3 ? ((double)grade/10D) : grade == 4 ? 0.5 : 0.7;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public void print()
	{
		super.print();
		System.out.println("item grade: " + grade + " (" + (int)(getDiscount() * 100) + "% discount)");
	}

}
