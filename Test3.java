import MyClasses.*;
import java.util.*;

public class Test3 {
  public static void main(String[] arguments) {
    String TestString = "My name is Dr. Susanto";
    
    ArrayList<Character> MostOccurringCharacters = new ArrayList<Character>();
    
    try {
      MostCharacters.FindMostCharacterInString(TestString).size();
    } catch (Exception e) {
      System.out.println("Maybe you should pick better string");
      System.exit(0);
    }
    System.out.println(MostCharacters.FindMostCharacterInString(TestString));

  }
}

