
public class CommandClearDB extends Command
{
	private Database db;
	
	public CommandClearDB(Database db)
	{
		super("cleardb");
		this.db = db;
	}

	@Override
	public void execute(String[] args)
	{
		Main.db = new Database();
		System.out.println("Cleared!");
	}

}
