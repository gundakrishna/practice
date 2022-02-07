/* It is also called Reversed Pyramid Star Pattern */
class UpperTriangle {
  public static void main(String[] args){
    int rowLimit = 5, colLimit = 5;
    for(int row = 0; row < rowLimit; row++){
      for(int col = 0; col <= row; col++){
        System.out.print("  ");
      }
      for(int col = 0; col < (colLimit - 2 * row); col++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}