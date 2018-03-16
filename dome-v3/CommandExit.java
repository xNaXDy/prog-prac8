
public class CommandExit extends Command
{

	public CommandExit()
	{
		super("exit");
	}

	@Override
	public void execute(String[] args)
	{
		System.exit(0);

	}

}
