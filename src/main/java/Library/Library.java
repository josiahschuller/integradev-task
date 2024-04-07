package Library;

import java.util.ArrayList;

public class Library {
    private Catalogue catalogue; // Library catalogue
    private ArrayList<Member> members; // List of library members

    public Library() {
        catalogue = new Catalogue();
        members = new ArrayList<>();
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addMember(Member member) {
        // Add a member to the library
        members.add(member);
    }

    public void removeMember(Member member) {
        // Remove a member from the library
        members.remove(member);
    }
}
