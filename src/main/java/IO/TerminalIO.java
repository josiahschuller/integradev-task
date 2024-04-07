package IO;

import IO.MenuOptions.AddItemOption;
import IO.MenuOptions.MenuOption;
import Library.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminalIO {
    private static TerminalIO instance; // Singleton instance
    private final ArrayList<MenuOption> menuOptions; // List of menu options
    private final Library library; // Library

    private TerminalIO(Library library, ArrayList<MenuOption> menuOptions) {
        this.library = library;
        this.menuOptions = menuOptions;
    }

    public static TerminalIO getInstance(Library library, ArrayList<MenuOption> menuOptions) {
        // Get the singleton instance of TerminalIO
        if (instance == null) {
            instance = new TerminalIO(library, menuOptions);
        }
        return instance;
    }

    private void displayMenu() {
        // Display the main menu
        System.out.println("\nWelcome to the Library Management System!");
        System.out.println("Please select an option:");
        for (int i = 0; i < this.menuOptions.size(); i++) {
            System.out.println((i + 1) + ". " + this.menuOptions.get(i).getDescription());
        }
    }

    public void run() {
        // Run the IO interface with main menu
        boolean isRunning = true;

        while (isRunning) {
            // Display the main menu
            this.displayMenu();

            // Ask the user to select an option
            Scanner scanner = new Scanner(System.in);
            int selectedOption = Integer.parseInt(scanner.nextLine()) - 1;

            // Execute the selected option
            isRunning = this.menuOptions.get(selectedOption).execute(this.library);
        }
    }
}
