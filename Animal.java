public class Animal{

  final int eyes = 2;     // Properties
  final int hands = 2;
  final int nose = 1;
  final int ears = 2;
  final int legs = 2;
  String eyesColor;
  static boolean dinnerPrepared = false;
   
  public static void main(String[] args){
    System.out.println("Krishna entry point of application");
    eating();
    walking();
  }

  static void walking(){
      System.out.println("Animal is walking");
  }
  static void eating(){
    if(dinnerPrepared == true){
      System.out.println("Dinner is prepared and i am eating");
    } else {
       cooking();
       System.out.println("Dinner is prepared and i am eating...");
    } 
  } 
  static void cooking(){
    System.out.println("Go to market and fetch vegetables");
    System.out.println("Wash the vegetables");
    System.out.println("Cook the vegetables");
    dinnerPrepared = true;
  }
}
