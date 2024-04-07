package IO.MenuOptions;

import Library.Library;
import Library.Member;
import Library.Item;
import Library.Borrowable;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReturnItemOption extends MenuOption {
    @Override
    public boolean execute(Library library) {
        // List the members in the library
        if (library.getMembers().size() == 0) {
            System.out.println("There are no members in the library");
            return true;
        }
        // Get the member to borrow the item
        Member memberToReturn = (Member) this.getUserInputDescribableOptions("Which member is borrowing the item:",
                // Cast the Members to Describable
                library.getMembers().stream().collect(Collectors.toCollection(ArrayList::new))
        );

        // List the items borrowed by the member
        if (memberToReturn.getBorrowedItems().size() == 0) {
            System.out.println(memberToReturn.describe() + " has no borrowed items to return");
            return true;
        }

        // Get the item to return
        Item itemToReturn = (Item) this.getUserInputDescribableOptions("Which item is being returned:",
                // Cast the Items to Describable
                library.getCatalogue().getItems().stream().collect(Collectors.toCollection(ArrayList::new))
        );

        // Return the item
        ((Borrowable) itemToReturn).returnItem(memberToReturn);
        System.out.println(memberToReturn.describe() + " successfully returned the following item: " + itemToReturn.describe());

        return true;
    }

    @Override
    public String describe() {
        return "Return an item to the library";
    }
}
