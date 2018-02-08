/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends PlayableMedium
{
	private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String referenceID,  String title, String artist, String description, int playtime, int numberOfTracks, int price, double vat)
    {
  		super(referenceID, title, description, playtime, price, vat);
  		this.numberOfTracks = numberOfTracks;
  		this.artist = artist;
  	}
    
    /**
     * @return The artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        super.print() ;
        System.out.println("artist: " + artist );
        System.out.println("tracks: " + numberOfTracks );
    }
   
}
