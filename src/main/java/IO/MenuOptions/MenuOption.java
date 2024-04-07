package IO.MenuOptions;

import Library.Library;
import Util.Describable;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuOption implements Describable {
    protected Scanner scanner; // Scanner to get user input

    protected MenuOption() {
        this.scanner = new Scanner(System.in);
    }

    public abstract String describe();

    public String getUserInput(String prompt) {
        // Get the user input, given a prompt
        String response;
        do {
            System.out.println(prompt);
            response = this.scanner.nextLine();
        } while (response == null || response.isEmpty());
        return response;
    }

    public String getUserInputStringOptions(String prompt, ArrayList<String> options) {
        // Given a prompt and a list of String options, get the user's chosen option
        boolean validResponse = false;
        int itemNum = -1;

        while (!validResponse) {
            // Print the options
            for (int i = 0; i < options.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + options.get(i));
            }
            // Get the number of the element in the arraylist
            String userInput = getUserInput(prompt);
            // Check if the user input is a number
            if (!userInput.matches("\\d+")) {
                System.out.println("Invalid option. If you entered the name of the option, please instead enter the option number.");
                continue;
            }
            itemNum = Integer.parseInt(userInput);

            if (itemNum < 1 || itemNum > options.size()) {
                System.out.println("Invalid option. Please try again.");
            } else {
                validResponse = true;
            }
        }

        return options.get(itemNum - 1);
    }


    public Describable getUserInputDescribableOptions(String prompt, ArrayList<Describable> options) {
        // Given a prompt and a list of Describable options, get the user's chosen option
        boolean validResponse = false;
        int itemNum = -1;

        while (!validResponse) {
            // Print the options
            for (int i = 0; i < options.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + options.get(i).describe());
            }
            // Get the number of the element in the arraylist
            String userInput = getUserInput(prompt);
            // Check if the user input is a number
            if (!userInput.matches("\\d+")) {
                System.out.println("Invalid option. If you entered the name of the option, please instead enter the option number.");
                continue;
            }
            itemNum = Integer.parseInt(userInput);

            if (itemNum < 1 || itemNum > options.size()) {
                System.out.println("Invalid option. Please try again.");
            } else {
                validResponse = true;
            }
        }

        return options.get(itemNum - 1);
    }

    public abstract boolean execute(Library library);
}
