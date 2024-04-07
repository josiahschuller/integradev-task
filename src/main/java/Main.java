import IO.MenuOptions.AddItemOption;
import IO.MenuOptions.AddMemberOption;
import IO.MenuOptions.BorrowItemOption;
import IO.MenuOptions.ReturnItemOption;
import IO.MenuOptions.ExitOption;
import IO.MenuOptions.MenuOption;
import Library.Library;
import IO.TerminalIO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create terminal IO
        TerminalIO terminalIO = TerminalIO.getInstance(library, new ArrayList<MenuOption>() {{
            add(new AddItemOption());
            add(new AddMemberOption());
            add(new BorrowItemOption());
            add(new ReturnItemOption());
            add(new ExitOption());
        }});

        // Run the terminal IO interface
        terminalIO.run();
    }
}
