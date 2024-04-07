package Library;

public interface Borrowable {
    public boolean borrowItem(Member member);

    public boolean returnItem(Member member);
}
