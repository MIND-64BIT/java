
class Student{

  String name;
  int rollNo;

  Student(String name, int roll){
      this.name=name;
      this.rollNo=roll;
  }

  void displayDetails(){
      System.out.print("Name: "+this.name+"\nRoll No: "+this.rollNo);
  }

}





public class StudentsData{
  public static void main( String[] args){
        Student s1 = new Student("Riya", 1);
        Student s2 = new Student("Ruhi", 2);

        s1.displayDetails();
        s2.displayDetails();
  }
}
