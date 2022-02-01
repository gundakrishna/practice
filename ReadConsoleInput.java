import java.util.Scanner;

class ReadConsoleInput{

  public static void main(String[] args){

    Scanner scannerObj = new Scanner(System.in);
    System.out.println("To calculate the sum of two numbers,");
    System.out.println("Please Enter number 1 :");
    int no1 = Integer.parseInt(scannerObj.nextLine());
    System.out.println("You entered number 1 : "+ no1);
    System.out.println("Please Enter number 2 :");
    int no2 = Integer.parseInt(scannerObj.nextLine());
    System.out.println("You entered number 2 : "+ no2);
    int result = no1 + no2;

    String s = String.format("%d + %d = %d", no1, no2, result);
    System.out.println(s);


// 57 + 74 = 131

    // String[] name = scannerObj.nextLine();
    // for(int i = 0; i < name.length; i++){
    //   System.out.println(name[i]);
    // }
  }
}