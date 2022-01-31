class PrimeNumbers{

  public static void main(String[] args){
    if (args.length == 1){
      int noToBeChecked = Integer.parseInt(args[0]);
      //System.out.println(noToBeChecked);
      int half = noToBeChecked/2;
      boolean flag = true;
      for(int i = 2; i <= half; i++){
        if(noToBeChecked%i == 0){
          flag = false;
          System.out.println("It is not a Prime Number");
          break;
        }
      }
      if(flag == true){
        System.out.println("It is a Prime Number");
      }
    } else {
      System.out.println("No Argument Provided");
    } 

  }
}