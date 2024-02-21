package Commands;

import Main.AccountManager;
import Main.Program;

import java.util.List;

/**
 * User can play the currently displayed playlist from beginning to end
 */

public class Play extends Command{

    public Play(){
        super(0,2);
    }

    /**
     * Plays playlist
     *
     * @param AM account manager
     * @param p program
     * @param args provided arguments and command
     * @throws CommandException if invalid argument or location
     */
    public void executeCommand(AccountManager AM, Program p, List<String> args) throws CommandException {
        checkArguments(args);
        checkLocation(p);
        p.play();
    }
}
