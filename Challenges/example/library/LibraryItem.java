package Challenges.example.library;

public class LibraryItem {
    private  String itemId;
    private  String title;
    private  String author;

    public void checkout(){
        System.out.println("checkout");
    }
    public void returnItem(){
        System.out.println("returning the item");
    }


}
