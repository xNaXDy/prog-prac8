
public abstract class Command
{
	private String name;
	
	public Command(String name)
	{
		this.name = name;
		
		CommandHandler.getInstance().addCommand(this);
	}
	
	public final String getName()
	{
		return name;
	}
	
	public abstract void execute(String[] args);

}
