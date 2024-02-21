package Commands;

import Main.AccountManager;
import Main.Program;

import java.util.List;

/**
 * User can return to the previous song in the current playlist
 */

public class SkipBackwards extends Command{

    public SkipBackwards(){
        super(0,2);
    }

    /**
     * Returns to previous song in current playlist
     *
     * @param AM account manager
     * @param p program
     * @param args provided arguments and command
     * @throws CommandException if invalid argument or location
     */
    public void executeCommand(AccountManager AM, Program p, List<String> args) throws CommandException {
        checkArguments(args);
        checkLocation(p);
        p.skipBackwards();
    }
}
