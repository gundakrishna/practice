public class Employee{

  int id;
  static float salary;
  String name;
  String address;
  String department;
  String role;  //designation = role = position
  int noOfWorkingDays;
  float perDaySalaryAmt;

  public static void main(String[] args){
    System.out.println("No. of Employees");
    calculateSalary(28, 1000);
    System.out.println("Employees salary = " + salary);
  }
  static void calculateSalary(int noOfWorkingDays, float perDaySalaryAmt){
    salary = noOfWorkingDays * perDaySalaryAmt; 
    
    // return salary;
  }


}
