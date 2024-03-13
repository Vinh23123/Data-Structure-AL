package HashTable;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
  public boolean containsDuplicate(int[] nums) {
        
    Set<Integer> mySet = new HashSet<>();
    for (int n : nums) {
      if (mySet.contains(mySet) == true) { // Đã tồn tại trong mySet
          return true;        
      } else { // chưa tồn tại
        mySet.add(n);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    
  }
}
