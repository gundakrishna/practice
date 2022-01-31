public class Person {
  
  // instance variable / properties
  private int age;

  // static constant variable / class constant variable
  static final int TYPEOFPEOPLE = 2; //constant because final

  // static method/function / class method/function
  public static void walking(){
    System.out.println("walking");
  }

// instance method
  public String eating(String food){
    String vegies = food;
    
    String dish = String.format("My food is delicious and it has so many flavours in it, guess what am I eating? %s", food);

    return dish; // you are returning String data 
  }

}
