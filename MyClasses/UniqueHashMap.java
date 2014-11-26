package MyClasses;

import java.util.*; 

public class UniqueHashMap<K, V> extends HashMap<K,V> {
  // This part overrides the put part. Whenever the put 
  // method is called, it will first check whether the 
  // value has already existed within the hashMap, if 
  // so, it will then proceed to remove the mapping 
  // and just call HashMap.put() to insert the value onto 
  // the hash table. 
  
  // While values().removeAll would work just fine as well, 
  // since HashMap initialization can only be done by calling 
  // the put() method, it guarantees that there will be only 
  // one entry at a time, thus no need to check for others 
  // once a value is found. 
  
  @Override public V put (K key, V value) {
    if (containsValue(value)) {
      //values().removeAll(Collections.singleton(value));
      values().remove(value);
    }
    return super.put(key, value);
  }
  
  // the putAll method is meant to do nothing, so I left the 
  // content empty. I have tested it, and it really does nothing 
  // to the instance of UniqueHashMap. 
  @Override public void putAll(Map<? extends K,? extends V> m) {
    
  }
}
