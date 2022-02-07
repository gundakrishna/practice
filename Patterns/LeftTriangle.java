class LeftTriangle{

  public static void main(String[] args){

    int rowLimit = 4, colLimit = 4;
    for(int row = 0; row < rowLimit; row++){
      for(int col = 0; col < colLimit - row - 1; col++){
        System.out.print("  ");

      }
      for(int col = 0; col <= row; col++){
        System.out.print(" *");
      }
      System.out.println();
    }

  }
}
