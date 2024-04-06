package Library;

import java.util.ArrayList;

public class Member {
    private String name; // Name of the member
    private int memberID; // Unique ID of the member in the library system
    private ArrayList<Item> borrowedItems = new ArrayList<>(); // Items borrowed by the member

    public Member(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void borrowItem(Item item) {
        if (item instanceof Borrowable && item.isAvailable()) {
            ((Borrowable) item).borrowItem(this);
        }
        borrowedItems.add(item);
        item.checkOut();
    }

}
