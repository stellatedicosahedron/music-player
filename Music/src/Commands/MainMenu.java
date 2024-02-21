package Commands;

import Main.AccountManager;
import Main.Program;

import java.util.List;

/**
 * User can return to main menu
 */

public class MainMenu extends Command{

    public MainMenu(){
        super(0,0);
    }

    /**
     * Display the main menu of program
     *
     * @param AM account manager
     * @param p program
     * @param args provided arguments and command
     * @throws CommandException if invalid argument or command location (login menu)
     */
    public void executeCommand(AccountManager AM, Program p, List<String> args) throws CommandException {
        checkArguments(args);
        checkLocationMainMenu(p);
        p.mainMenu();
    }
}
