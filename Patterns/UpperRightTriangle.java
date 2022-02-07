class UpperRightTriangle {
  public static void main(String[] args){
    int rowLimit = 4, colLimit = 4;
    for(int row = 0; row < rowLimit; row++){
      for(int col = 0; col < colLimit - row; col++){
        System.out.print(" *");
      }
      System.out.println();
    }

  }

}