package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSetInJava
 */
public class HashSetInJava {

  


  public static void main(String[] args) {
    
  Set<Integer> mySet = new HashSet<>();

  mySet.add(1);
  mySet.add(2);
  mySet.add(1);
  mySet.add(2);

  for (Integer integer : mySet) {
    System.out.println(integer);
  }
  }
}