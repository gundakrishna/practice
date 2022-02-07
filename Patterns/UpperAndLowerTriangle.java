/* 
It is also called Sandglass Star Pattern
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */

// Incomplete program
class UpperAndLowerTriangle {

  public static void main(String[] args){
    int rowLimit = 5, colLimit = 5;
    // for(int row = 0; row < rowLimit; row++){
    //   for(int col = 0; col < row; col++){
    //     System.out.print("  ");
    //   }
    //   for(int col = row; col <= (colLimit - 1); col++){
    //     System.out.print(" *");
    //   }
    //   System.out.println();
    // }

    // for(int row = 0; row < rowLimit; row++){
    //   for(int col = 0; col < colLimit - row; col++){
    //     System.out.print("  ");
    //   }
    //   for(int col = 0; col < colLimit - 2 * (rowLimit - 1 - row); col++){
    //     System.out.print(" *");
    //   }
    //   System.out.println();
    // }




int rowsLimit = 5;
for (int row= 0; row<= rowsLimit-1 ; row++) {
  for (int col=0; col <row; col++){
      System.out.print(" ");
  }
  for (int col=row; col<=rowsLimit-1; col++) { 
    System.out.print("*" + " "); 
  } 
    System.out.println(""); 
}

// for (int i= rowsLimit-1; i>= 0; i--) {
//   for (int j=0; j< i ;j++) {
//       System.out.print(" ");
//   }
//   for (int k=i; k<=rowsLimit-1; k++) {
//       System.out.print("*" + " ");
//   }
//   System.out.println("");
// }



  }

}