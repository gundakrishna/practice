class LowerTriangle {
  public static void main(String[] args){
    int rowLimit = 5, colLimit = 5;
    for(int row = 0; row < rowLimit; row++){
      for(int col = 0; col < colLimit - row; col++){
        System.out.print("  ");
      }
      for(int col = 0; col < colLimit - 2 * (rowLimit - 1 - row); col++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}