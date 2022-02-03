/* 
Calculate the factorial of a given number.
Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. 
  For example:
  4! = 4*3*2*1 = 24
*/
class Factorial {
  public static void main(String[] args){
    int no = Integer.parseInt(args[0]);
    int result = 1;
    for(int i = 2; i <= no; i++){
      // result = result * i;
      result *= i; // Compound Assignment Operator
    }
    System.out.println(result);
  }
}
