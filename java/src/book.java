public class book {
    
     static int totalBooks = 0;
    

    
    String title, author, isbn;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    book(String isbn, String title, String author){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    book(String isbn){
        this.isbn = isbn;
        this.title =  "unknown";
        this.author = "unknown";
    }
    
    public void borrowBook(){
        System.out.println("the book is borrowed");
        totalBooks--;

    }
    public void returnBook(){
        System.out.println("the book is returned");
        totalBooks++;
    }

    static void getTotalBooks(){
        System.out.println("total number of books: "+ totalBooks);
    }




    
}
