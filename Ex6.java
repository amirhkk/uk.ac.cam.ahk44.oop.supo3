package uk.ac.cam.ahk44.oop.supo3;

public class Ex6{

  public static void main(String args[]) {

  }
}


public class LazySingleton {

  private static LazySingleton instance = null;

  private LazySingleton() {}

  public static DebitCardProcessor getInstance() {
    if(instance == null) instance = new DebitCardProcessor();

    return instance;
  }
}
