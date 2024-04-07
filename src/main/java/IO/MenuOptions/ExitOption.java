package IO.MenuOptions;

import Library.Library;

import java.awt.*;

public class ExitOption extends MenuOption {

    public ExitOption() {
        super("Exit");
    }
    @Override
    public boolean execute(Library library) {
        return false;
    }
}
