package Command;

import java.util.List;

/**
 * Stops the console.
 */
public class Exit implements Command {
    @Override
    public String execute(List<String> args) throws CommandFailedException {
        System.out.println("Good bye!");
        return null;
    }

}
