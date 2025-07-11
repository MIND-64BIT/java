
class Book{

  String title;
  String authorName;

  Book(String title, String author){
      this.title=title;
      this.authorName=author;
  }

  void displayDetails(){
      System.out.println("Book: "+this.title+"\nAuthor: "+this.authorName);
  }

}





public class BookData{
  public static void main( String[] args){
        
        Book b = new Book("Bhagvad Gita", "Vedvyas");
        
        b.displayDetails();
  }
}
