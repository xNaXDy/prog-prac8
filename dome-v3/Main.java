import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static Database db;
	private static Basket b;
	
	public static void main(String[] args)
	{
		db = new Database();
		db.createDatabase();
		
		b = new Basket();
		
		for(int i = 0; i < db.getItems().size(); i++)
		{
			b.addItem(db.getItems().get(i));
		}
		
		BufferedReader br = null;
		
		// initializing commands
		new CommandPrintDatabase(db);
		new CommandHelp();
		new CommandExit();
		new CommandPrintBasket(b);
		new CommandSaveDB(db);
		new CommandLoadDB(db);
		new CommandClearDB(db);
		new CommandAddItem();
		new CommandRemoveItem();
		
		try
		{

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true)
            {

                System.out.print("Input: ");
                String input = br.readLine();
                String[] filteredInput = input.split(" ");

                if(filteredInput.length == 1 && CommandHandler.getInstance().isCommand(filteredInput[0]))
                {
                	CommandHandler.getInstance().executeCommand(filteredInput[0], null);
                }
                else if(filteredInput.length > 1 && CommandHandler.getInstance().isCommand(filteredInput[0]))
                {
                	String[] argus = new String[filteredInput.length-1];
                	for(int i = 1; i < filteredInput.length; i++)
                	{
                		argus[i-1] = filteredInput[i];
                	}
                	CommandHandler.getInstance().executeCommand(filteredInput[0], argus);
                }
                else
                {
                	System.out.println("Unrecognized command. (" + input + ")");
                	System.out.println(CommandHandler.getInstance().getAllCommands().size() + "");
                }
            }

        }
		catch (IOException e)
		{
            e.printStackTrace();
        }
		finally
		{
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
	}

}
