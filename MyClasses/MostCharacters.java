package MyClasses;

import java.util.*;

public class MostCharacters {
  public static final HashMap<Character, Integer> CharCounter = 
    new HashMap<Character, Integer>();
  
  public static ArrayList<Character> FindMostCharacterInString(String str){
    char[] CharArray = ((str.replaceAll(" ", ""))).toCharArray();
    int MaxOccurences = 0;
    ArrayList<Character> occurences = new ArrayList<Character>();
    
    if (CharArray.length == 0) {
      return null;
    }
    
    for (int k = 0; k < CharArray.length; ++k) {
      if (CharCounter.containsKey(CharArray[k])) {
	CharCounter.put(CharArray[k], CharCounter.get(CharArray[k])+1 );
      } else {
	CharCounter.put(CharArray[k],1);
      }
      
      if (MaxOccurences < CharCounter.get(CharArray[k])) {
	MaxOccurences = CharCounter.get(CharArray[k]);
      }
    }
    
    for (Map.Entry<Character, Integer> entry : CharCounter.entrySet()) {
      if (entry.getValue() == MaxOccurences) {
	occurences.add(entry.getKey());
      }
    }
    
    return occurences;
  }
  
  public static void main(String[] arguments) {
    String TestString = "My name is Dr. Susanto";
    
    ArrayList<Character> MostOccurringCharacters = new ArrayList<Character>();
    FindMostCharacterInString(TestString);
    
    try {
      FindMostCharacterInString(TestString).size();
    } catch (Exception e) {
      System.out.println("Maybe you should pick better string");
      System.exit(0);
    }
    System.out.println(FindMostCharacterInString(TestString));
  }
  
}
