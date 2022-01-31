public class Main {
  static String[] books = new String[10];
  public static void main(String[] args){  
    System.out.println("Collection of Books"); 
    System.out.println("Books Length = " + books.length);
    if(args.length != 0){
      for(String arg :args){
        addBook(arg);
      }
    }
    for(String book : books) {
      if(book != null)
        System.out.println(book);
    }
  }

  static void addBook(String bookName){
    for(int i = 0; i < books.length; i++){
     if(books[i] == null){
       books[i] = bookName;
       return;
     }
    }
  }
  
}