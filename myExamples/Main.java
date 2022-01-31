class Person {
  // instance variable / properties
  private String name;
  // instance variable / properties
  private int age;

  private String address;

  // static constant variable / class constant variable
  static final int TYPEOFPEOPLE = 2; //constant because final
  public Person(){}
  // It is a constructor of class Person - constructor takes care of intialization work of properties
  public Person(String personName) {
      this.name = personName;
  }
  // It is a constructor of class Person
  public Person(String personName, int personAge) {
    this.name = personName;
    this.age = personAge;
  }
  // more than one constructors means constructor overloading and overloaded constructors will have different typed parameter list

  // static method/function / class method/function
  public static void walking(){
    System.out.println("walking...");
  }

// instance method
  public String eating(String food){
    String vegies = food;
    
    String dish = String.format("My food is delicious and it has so many flavours in it, guess what am I eating? %s", food);

    return dish; // you are returning String data 
  }

  public String getName(){
    return this.name;
  }

  public void setName(String personName){
    this.name = personName;
  }

  public String getAddress(){
    return this.address;
  }

  public void setAddress(String personAddress){
    this.address = personAddress;
  }

  // public static Person getInstance(){
  //   return new Person();
  // }

}

public class Main {

  // class method/function - it is an entry point of any application/programm
  public static void main(String[] args /*typed-parameter-list */ ){
    System.out.println("My main method");
    // Calling static method walking of Person class
    Person.walking();
    System.out.println(Person.TYPEOFPEOPLE);
    // Creating an instance object to access the Person classes' instance variables and instance methods
    Person kavitaObj = new Person("Kavita", 20);
    String name = kavitaObj.getName();
    // String pName = kavitaObj.name;
    // String pAddress = kavitaObj.address;
    System.out.println(name);
    kavitaObj.setName("Krishna");
    name = kavitaObj.getName();
    System.out.println(name);
    System.out.println(kavitaObj.getAddress());
    kavitaObj.setAddress("T-31, 313, Pratiksha Nagar, Sion east, Mumbai-400022");
    System.out.println(kavitaObj.getAddress());


    
/*

    StringBuilder sb = new StringBuilder(40);
    StringBuilder sb1 = new StringBuilder(40);
    sb.append("This is the result ");
    sb1.append("This is the result ");
    sb.append(20);
    sb1.append(20);
    String str1 = sb.toString(); // This is the result 20
    String str2 = String.format("This is the result %d", 20);*/
    
  }

}
