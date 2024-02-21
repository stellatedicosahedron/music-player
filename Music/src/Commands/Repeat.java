package Commands;

import Main.AccountManager;
import Main.Program;

import java.util.List;

/**
 * User can toggle music player's repeat status between on and off
 */

public class Repeat extends Command{

    public Repeat(){
        super(0,2);
    }

    /**
     * Turns the repeat function on and off
     *
     * @param AM account manager
     * @param p program
     * @param args provided arguments and command
     * @throws CommandException if invalid argument or location
     */
    public void executeCommand(AccountManager AM, Program p, List<String> args) throws CommandException {
        checkArguments(args);
        checkLocation(p);
        p.repeat();
    }
}
