class LeftTriangleStarPattern {
  public static void main(String[] args){
    int rowLimit = 6, colLimit = 6;
    for(int row = 0; row < rowLimit; row++){
      // for space printing
      // for(int col = 0; col < (colLimit - rowLimit)-1; col++){
      for(int col = 2 * (rowLimit - row); col >= 0; col--){
        System.out.print(" ");
      }
      // for * printing
      for(int col = 0; col <= row; col++){
        System.out.print(" *");
      }
      System.out.println();
/* 

    0 .....6
    0 .....6 
    
         *   5 space 1 *  6-1  (rowLimt - 0)-1        6-5
        **   4 space 2 *  6-2  (rowLimit - 1)-1
       ***   3 space 3 *  6-3  (rowLimit - 2)-1
      ****   2 space 4 *  6-4  (rowLimit - 3)-1
     *****   1 space 5 *  6-5  (rowLimit - 4)-1
    ******   0 space 6 *  6-6  (rowLimit - 5)-1
    

    
    */


    }

  }
}
