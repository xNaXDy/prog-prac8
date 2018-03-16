import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CommandLoadDB extends Command
{
	private Database db;
	
	public CommandLoadDB(Database db)
	{
		super("loaddb");
		this.db = db;
	}

	@Override
	public void execute(String[] args)
	{
		try
		{
			File f = new File("database.dat");
			if(f.exists())
			{
				ObjectInputStream os = new ObjectInputStream(new FileInputStream("database.dat"));
				Main.db = (Database)os.readObject();
				os.close();
				System.out.println("Loaded!");
			}
			else
			{
				System.out.print("No database file exists.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
