import java.util.HashMap;
import java.util.Map;

public class CommandHandler
{
	private static CommandHandler instance;
	
	public static CommandHandler getInstance()
	{
		return instance;
	}
	
	static
	{
		if(instance == null)
			instance = new CommandHandler();
	}
	
	private Map<String, Command> commands;
	
	public CommandHandler()
	{
		commands = new HashMap<String, Command>();
	}
	
	public void addCommand(Command cmd)
	{
		if(commands.containsKey(cmd.getName().toLowerCase()))
			return;
		
		commands.put(cmd.getName().toLowerCase(), cmd);
	}
	
	public boolean isCommand(String cmd)
	{
		return commands.containsKey(cmd.toLowerCase());
	}
	
	public void executeCommand(String cmd, String[] args)
	{
		if(isCommand(cmd))
		{
			commands.get(cmd.toLowerCase()).execute(args);
		}
	}
	
	public Map<String, Command> getAllCommands()
	{
		return commands;
	}
}
