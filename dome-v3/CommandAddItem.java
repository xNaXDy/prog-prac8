
public class CommandAddItem extends Command
{

	public CommandAddItem()
	{
		super("addwholeitem");
	}

	@Override
	public void execute(String[] args)
	{
		if(args == null || args.length < 5)
		{
			System.out.println("Proper usage: addwholeitem $id $name $price $vat $description");
		}
		else
		{
			try
			{
				String description = "";
				for(int i = 4; i < args.length; i++)
				{
					description += args[i] + (i == args.length-1 ? "" : " ");
				}
				Main.db.addItem(new WholeItem(args[0], args[1], description, Integer.parseInt(args[2]), Double.parseDouble(args[3])));
			}
			catch (Exception e)
			{
				System.out.print("Invalid arguments supplied.");
			}
		}
	}

}
