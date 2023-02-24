

public class book {
    String isbn;
    String name;
    String[] Author;
    boolean isHardcover;


    public void getDescription() {
        System.out.println("Check Amazon for " + this.name + " with "+this.isbn+" ISBN number.");
    }
}
