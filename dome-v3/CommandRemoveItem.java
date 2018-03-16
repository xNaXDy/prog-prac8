
public class CommandRemoveItem extends Command
{
	public CommandRemoveItem()
	{
		super("removeitem");
	}

	@Override
	public void execute(String[] args)
	{
		if(args != null && args.length == 1)
		{
			try
			{
				if(Main.db.removeItem(Integer.parseInt(args[0])))
				{
					System.out.println("Item removed.");
				}
				else
				{
					System.out.println("$id is out of range.");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid parameter.");
			}
		}
		else
		{
			System.out.println("Invalid arguments supplied. Need $id");
		}
	}
}
