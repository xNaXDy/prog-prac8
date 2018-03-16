
public class CommandPrintBasket extends Command
{
	private Basket b;
	
	public CommandPrintBasket(Basket b)
	{
		super("printbasket");
		this.b = b;
	}

	@Override
	public void execute(String[] args)
	{
		b.printBasket();
	}

}
