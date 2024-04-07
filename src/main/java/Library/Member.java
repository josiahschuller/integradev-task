package Library;

import java.util.ArrayList;

public class Member {
    private String name; // Name of the member

    private int age; // Age of the member
    private final int memberID; // Unique ID of the member in the library system
    private ArrayList<Borrowable> borrowedItems = new ArrayList<>(); // Items borrowed by the member

    public Member(int memberID, String name, int age) {
        this.memberID = memberID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMemberID() {
        return memberID;
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
