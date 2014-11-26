import MyClasses.*;

// import HashExtension.UniqueHashMap;

public class IonTest2 {
  static public void main (String[] arguments) {
    String test1 = "An Dr    ee";
    String test2 = "andree    ";
    
    System.out.println(Anagram.anagram(test1, test2));
  }
}
