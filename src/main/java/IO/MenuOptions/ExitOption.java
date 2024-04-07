package IO.MenuOptions;

import Library.Library;

import java.awt.*;

public class ExitOption extends MenuOption {
    @Override
    public boolean execute(Library library) {
        // Return false so that the program exits
        return false;
    }

    @Override
    public String describe() {
        return "Exit the program";
    }
}
