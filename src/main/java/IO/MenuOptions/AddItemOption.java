package IO.MenuOptions;

import Library.Library;
import Library.Item;
import Library.Book;
import Library.DVD;
import Library.Rating;
import Util.CatalogueIDSequence;
import Util.Describable;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AddItemOption extends MenuOption {
    @Override
    public boolean execute(Library library) {
        // Get the type of item to add
        String itemType = this.getUserInputStringOptions("What type of item:",
                new ArrayList<String>() {{
                    add("book");
                    add("dvd");
                }}
        );
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
            ArrayList<Describable> ratingOptions = new ArrayList<>(Arrays.asList(Rating.values()));
            Rating rating = (Rating) this.getUserInputDescribableOptions("Enter the rating of the DVD:",
                    ratingOptions
            );

            itemToAdd = new DVD(CatalogueIDSequence.getInstance().getNextID(), title, director, rating);
        } else {
            throw new IllegalArgumentException("Invalid item type");
        }

        // Add the item to the library catalogue
        library.getCatalogue().addItem(itemToAdd);

        System.out.println("Successfully added the following item: " + itemToAdd.describe());

        return true;
    }

    @Override
    public String describe() {
        return "Add an item to the library";
    }
}
