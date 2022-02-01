

class CheckPrime{

  public static void main(String[] args){
    int noToCheck = Integer.parseInt(args[0]);
    boolean flag = true; 
    int half = (int) (noToCheck/2);
    for(int i = 2; i <= half; i++){
      if(noToCheck%i == 0){
        // System.out.println("It is not a Prime Number");
         flag = false;
      }
    }
    if(flag == true){
        System.out.println("It is a Prime Number");
    }else{
        System.out.println("It is not a Prime Number");
    }
  }
}





