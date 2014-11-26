package MyClasses;

import java.util.*;
// the function anagram will return true if str1 and str2 are 
// anagrams. It assumes that str1 and str2 will contain only 
// letters and white spaces. 

// 1. We first stripped the two strings of the white spaces, and 
// convert everything onto lower case letters
// 2. We converted the two resulting strings onto an array of 
// characters
// 3. Then we sort both char1 and char2
// 4. Lastly, if str1 and str2 are anagrams, then char1 and char2
// should be exactly identical; and vice versa. 
public class Anagram {
  public static boolean anagram(String str1, String str2) {
    
    char[] char1 = ((str1.replaceAll(" ", "")).toLowerCase()).toCharArray();
    char[] char2 = ((str2.replaceAll(" ", "")).toLowerCase()).toCharArray();
    
    if (char1.length != char2.length) 
      return false;
    
    Arrays.sort(char1);
    Arrays.sort(char2);
    
    String str1ToCompare = new String(char1);
    String str2ToCompare = new String(char2);

    if (str1ToCompare.equals(str2ToCompare)) 
      return true;
    else 
      return false; 
  }
}
