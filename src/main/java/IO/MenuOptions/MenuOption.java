package IO.MenuOptions;

import Library.Library;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuOption {
    private String description; // Description of the menu option

    protected MenuOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getUserInput(String prompt) {
        // Get the user input, given a prompt
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println(prompt);
            response = scanner.nextLine();
        } while (response == null || response.isEmpty());
        return response;
    }

    public String getUserInput(String prompt, ArrayList<String> validResponses) {
        // Get the user input, given a prompt and optionally a list of valid responses
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println(prompt);
            response = scanner.nextLine();
        } while (response == null || !validResponses.contains(response.toLowerCase()));
        return response;
    }

    public abstract boolean execute(Library library);
}
