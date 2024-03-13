/**
 * CheckIfTwoStringArraysareEquivalent_1662
 */
public class CheckIfTwoStringArraysareEquivalent_1662 {

  public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {

    String r1 = "";
    String r2 = "";

    for (String s : arr1) {
      r1 += s;
    }

    for (String s : arr2) {
      r2 += s;
    }
        
    return r1.equals(r2);
   }

  public static void main(String[] args) {
    
  }
}