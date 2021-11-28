package uk.ac.cam.ahk44.oop.supo3;

public class Ex7{

  public static void main(String args[]) {

  }
}

public class Student{
  private final String CRSid; // Mandatory
  private final String Firstname; //Optional
  private final String Lastname; //Optional
  private final int Age; //Optional
  private final String College; //Optional

  private Student(StudentBuilder builder){
    this.CRSid = builder.CRSid;
    this.Firstname = builder.Firstname;
    this.Lastname = builder.Lastname;
    this.Age = builder.Age;
    this.College = builder.College;
  }
  public static class StudentBuilder{
    private final String CRSid; // Mandatory
    private final String Firstname; //Optional
    private final String Lastname; //Optional
    private final int Age; //Optional
    private final String College; //Optional
    public StudentBuilder(String CRSid){
      this.CRSid = CRSid;
    }
    public StudentBuilder Firstname(String Firstname){
      this.Firstname = Firstname;
      return this;
    }
    public StudentBuilder Lastname(String Lastname){
      this.Lastname = Lastname;
      return this;
    }
    public StudentBuilder age(int age){
      this.age = age;
      return this;
    }
    public StudentBuilder College(String College){
      this.College = College;
      return this;
    }
  }
}
