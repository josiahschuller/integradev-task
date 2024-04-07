import IO.MenuOptions.AddItemOption;
import IO.MenuOptions.ExitOption;
import IO.MenuOptions.MenuOption;
import Library.Library;
import IO.TerminalIO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        TerminalIO terminalIO = TerminalIO.getInstance(library, new ArrayList<MenuOption>() {{
            add(new AddItemOption());
            add(new ExitOption());
        }});

        // Display the main menu
        terminalIO.run();
    }
}
