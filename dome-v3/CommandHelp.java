import java.util.Iterator;
import java.util.Map;

public class CommandHelp extends Command
{
	
	public CommandHelp()
	{
		super("help");
	}

	@Override
	public void execute(String[] args)
	{
		Map<String, Command> mp = CommandHandler.getInstance().getAllCommands();
		Iterator it = mp.entrySet().iterator();
		System.out.print("Available Commands: ");
	    while (it.hasNext())
	    {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print(pair.getKey() + " ");
	    }
	    System.out.print("\n");
	}

}
