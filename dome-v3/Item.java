/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public abstract class Item
{
	private String referenceID;
	private String description;
	private double vat;
	private int price;
	
    private String title;
    private boolean gotIt;
    private String comment;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String referenceID, String title, String description, int price, double vat)
    {
    	this.title = title;
        this.referenceID = referenceID;
        this.description = description;
        this.vat = vat;
        this.price = price;
        gotIt = false;
        comment = "";
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    public String getReferenceID()
    {
    	return referenceID;
    }
    
    public String getDescription()
    {
    	return description;
    }
    
    public double getVAT()
    {
    	return vat;
    }
    
    public int getPriceBeforeVAT()
	{
		return getPriceBeforeVAT(1);
	}
	
	public int getPriceAfterVAT()
	{
		return getPriceAfterVAT(1);
	}
	
	public int getPriceBeforeVAT(int quantity)
	{
		return price * quantity;
	}
	
	public int getPriceAfterVAT(int quantity)
	{
		return getPriceBeforeVAT(quantity) + (int)Math.round((double)getPriceBeforeVAT(quantity) * getVAT());
	}

    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.print("title: " + title + " (ID: " + referenceID + ")");
        if(gotIt) {
            System.out.println("::GotIt");
        } else {
            System.out.println("::NotGotIt");
        }
        System.out.println("Description: " + description);
        System.out.println("Comment: " + comment);
        System.out.println("Price Per Unit (ex. VAT): $" + getPriceBeforeVAT());
        System.out.println("Price Per Unit (inc. VAT): $" + getPriceAfterVAT());
        System.out.println("VAT: " + (int)(getVAT() * 100) + "%");
    }
}
