import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database implements Serializable
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
        
        System.out.println("-------------------\n");
    }
    
    public List<Item> getItems()
    {
    	return items;
    }
    
    
    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void createDatabase()
    {
        Item item ;
        
        item = new CD( "F100", "Lungs", "Florence", "", 10, 100, 10, 0.19 ) ;
        item.setComment("Breathes easily" ) ;
        this.addItem( item ) ;
        
        item = new CD( "F101", "My Worlds", "Justin", "", 10, 100, 10, 0.19 ) ;
        item.setComment("Why ???" ) ;
        this.addItem( item ) ;
        
        item = new DVD("F102", "Explosions", "Michael Bay", "",  120, 49, 0.19);
        item.setComment("Lots of them.");
        this.addItem(item);
        
        item = new VideoGame("F103", "Banjo Tooie", "Nintendo", "", 120, 19, 0.19);
        item.setComment("Part 3 coming soon.");
        this.addItem(item);
        
        
    }
    
    public boolean removeItem(int id)
    {
    	if(id < items.size())
    	{
    		items.remove(id);
    		return true;
    	}
    	
    	return false;
    }
}
