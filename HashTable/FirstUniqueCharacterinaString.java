package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * 387FirstUniqueCharacterinaString
 */
public class FirstUniqueCharacterinaString {


  public static int firstUniqChar(String s) {
    Map<Character, Integer> myCountMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (myCountMap.containsKey(c) == false) {
        myCountMap.put(c, 1);
      } else {
        myCountMap.put(c, myCountMap.get(c) + 1 );
      }
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (myCountMap.get(c) == 1) {
        return i;
      }
    }

    return -1;
}

  public static void main(String[] args) {
    
  }
}
