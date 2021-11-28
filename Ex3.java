package uk.ac.cam.ahk44.oop.supo3;

public class Ex3{

  public static void main(String args[]) {
      String s1 = new String("Hi");
      String s2 = new String("Hi");
      System.out.println((s1 == s2));
      String s3 = "Hi";
      String s4 = "Hi";
      System.out.println((s3 == s4));
  }



}

public class Car{
  private String manufacturer;
  private int age;
}

public class Car implements Comparable<Car>{
  private final String m;
  private final int a;
  public Car(String manufacturer, int age){
    m = manufacturer;
    a = age;
  }

  // sort by manufacturer, then age
  public int compareTo(Car c){
    if(m > c.m) return 1;
    else if(m < c.m) return -1;
    else{
      if(a > c.a) return 1;
      else if(a < c.a) return -1;
      else return 0;
    }
  }
}
