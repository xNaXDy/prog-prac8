
public class CommandPrintDatabase extends Command
{
	private Database db;
	
	public CommandPrintDatabase(Database db)
	{
		super("printdb");
		this.db = db;
	}

	@Override
	public void execute(String[] args)
	{
		Main.db.list();
	}

}
