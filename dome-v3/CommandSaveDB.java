import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CommandSaveDB extends Command
{
	private Database db;
	
	public CommandSaveDB(Database db)
	{
		super("savedb");
		this.db = db;
	}

	@Override
	public void execute(String[] args)
	{
		ObjectOutputStream os;
		try
		{
			os = new ObjectOutputStream(new FileOutputStream("database.dat"));
			os.writeObject(Main.db);
			os.close();
			System.out.println("Saved to database.dat!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
