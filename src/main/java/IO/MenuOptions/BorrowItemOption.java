package IO.MenuOptions;

import Library.Library;
import Library.Member;
import Library.Item;
import Library.Borrowable;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BorrowItemOption extends MenuOption {
    @Override
    public boolean execute(Library library) {
        // List the items in the library
        Item itemToBorrow = (Item) this.getUserInputDescribableOptions("Which item would you like to borrow:",
                // Cast the Items to Describable
                library.getCatalogue().getItems().stream().collect(Collectors.toCollection(ArrayList::new))
        );

        if (!(itemToBorrow instanceof Borrowable)) {
            System.out.println("This item cannot be borrowed");
            return true;
        }

        if (!itemToBorrow.isAvailable()) {
            System.out.println("This item is not available to be borrowed");
            return true;
        }

        // List the members in the library
        if (library.getMembers().size() == 0) {
            System.out.println("There are no members in the library");
            return true;
        }
        // Get the member to borrow the item
        Member memberToBorrow = (Member) this.getUserInputDescribableOptions("Which member is borrowing the item:",
                // Cast the Members to Describable
                library.getMembers().stream().collect(Collectors.toCollection(ArrayList::new))
        );

        // Borrow the item
        ((Borrowable) itemToBorrow).borrowItem(memberToBorrow);

        System.out.println(memberToBorrow.describe() + " successfully borrowed the following item: " + itemToBorrow.describe());

        return true;
    }

    @Override
    public String describe() {
        return "Borrow an item from the library";
    }
}
