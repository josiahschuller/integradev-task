package IO.MenuOptions;

import Library.Library;
import Library.Item;
import Library.Book;
import Library.DVD;
import Library.Rating;
import Util.CatalogueIDSequence;

import java.util.Arrays;
import java.util.ArrayList;

public class AddItemOption extends MenuOption {

    public AddItemOption() {
        super("Add an item to the library");
    }

    @Override
    public boolean execute(Library library) {
        // Get the type of item to add
        String itemType = this.getUserInput("What type of item? (book, dvd):", new ArrayList<String>() {{
            add("book");
            add("dvd");
        }});
        // Get the title of the item
        String title = this.getUserInput("Enter the title of the item:");

        Item itemToAdd;

        if (itemType.equals("book")) {
            // Get the author of the book
            String author = this.getUserInput("Enter the author of the book:");

            itemToAdd = new Book(CatalogueIDSequence.getInstance().getNextID(), title, author);
        } else if (itemType.equals("dvd")) {
            // Get the director of the DVD
            String director = this.getUserInput("Enter the director of the DVD:");
            // Get the rating of the DVD
            Rating rating = Rating.valueOf(this.getUserInput("Enter the rating of the DVD (G, PG, M, MA, R):",
                    new ArrayList<>(Arrays.asList(Arrays.stream(Rating.values()).map(Enum::name).toArray(String[]::new))
                    )));

            itemToAdd = new DVD(CatalogueIDSequence.getInstance().getNextID(), title, director, rating);
        } else {
            throw new IllegalArgumentException("Invalid item type");
        }

        // Add the item to the library catalogue
        library.getCatalogue().addItem(itemToAdd);

        System.out.println("Successfully added the following item: " + itemToAdd.getDescription());

        return true;
    }
}
