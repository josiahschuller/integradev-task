package IO.MenuOptions;

import Library.Library;
import Library.Member;

public class AddMemberOption extends MenuOption {
    @Override
    public boolean execute(Library library) {
        // Get the name of the member
        String name = this.getUserInput("Enter the name of the member:");
        // Get the age of the member
        int age = Integer.parseInt(this.getUserInput("Enter the age of the member:"));

        // Add the member to the library
        library.addMember(new Member(name, age));

        System.out.println("Successfully added the following member: " + name);

        return true;
    }

    @Override
    public String describe() {
        return "Add a member to the library";
    }
}
