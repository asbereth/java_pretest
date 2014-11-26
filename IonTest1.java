import MyClasses.*;

// import HashExtension.UniqueHashMap;

public class IonTest1 {
  static public void main (String[] arguments) {
    UniqueHashMap<Integer, String> testHM = 
      new UniqueHashMap<Integer,String>() {
      {
    	put(61, "January");
	put(18, "January");
    	put(3, "February");
    	put(2, "February");
    	put(3, "January");
      }
    };
    
    testHM.put(1, "January");
    
    UniqueHashMap<Integer, String> putAllTest = 
      new UniqueHashMap<Integer, String>();
    
    putAllTest.put(10, "October");
    
    putAllTest.putAll(testHM);
    System.out.println(putAllTest);
    System.out.println(testHM);
    
    // testHM.put(1, "January");
    
    // System.out.println(testHM);
    
    // testHM.put(new Integer(1), "Java");
    // testHM.put(new Integer(2), "C++");
    // testHM.put(new Double(15.05), new Integer(15));
    // System.out.println(testHM.get("December"));
  }
}
