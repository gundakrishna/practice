/* 
  Insert a new course
 */
class Courses {
    String[] courses = new String[10]; //{"BScIt", "Bsccc", "BA"}
   
    public void insertCourse(String course){
      // courses[3] = course;
      for(int index = 0; index < courses.length; index++){
        if(courses[index] == null){
          courses[index] = course;
          break;
        }
      }

      for(String ele:courses){
        if(ele != null){
          System.out.println(ele);
        }
      }
      System.out.println("__________________");
    }

}
class Rough {

  // public static String name = "Kavita";
  public static void main(String[] args){
    // System.out.println(name);
    Courses coursesInstanceObj = new Courses();
    // insertCourse("BCom");
// {"BScIt", "Bsccc", "BA"}
    coursesInstanceObj.insertCourse("BCom");
    coursesInstanceObj.insertCourse("BScIt");
    coursesInstanceObj.insertCourse("BSc");

  }
}


/* Folder/Project =>
  class A {} A.java
  class B {} B.java
  class C {} C.java
  class D {
    ..main()....
  } D.java
  Subject => ...
            ...
            ..
            Sub => ...
                  ...
                  ...


 */