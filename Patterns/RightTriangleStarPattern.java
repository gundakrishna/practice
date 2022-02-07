/* Implementing right angled start pattern */
class RightTriangleStarPattern {
  public static void main(String[] args){

    int rowLimit = 4, colLimit = 4; // (4*4)

    for(int row = 0; row < rowLimit; row++){

      for(int col = 0; col <= row; col++){
        // System.out.println("Row: " + row + ", Column:"+ col);
        System.out.print("* ");
      }
      System.out.println();
    }
    
  }
}
