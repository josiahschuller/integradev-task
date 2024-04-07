package Library;

import Util.Describable;

import java.util.ArrayList;

public class Member implements Describable {
    private String name; // Name of the member

    private int age; // Age of the member
    private ArrayList<Borrowable> borrowedItems = new ArrayList<>(); // Items borrowed by the member

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String describe() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Borrowable> getBorrowedItems() {
        return borrowedItems;
    }

    public void addBorrowedItem(Borrowable item) {
        // Add an item to the list of borrowed items
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(Borrowable item) {
        // Remove an item from the list of borrowed items
        borrowedItems.remove(item);
    }
}
