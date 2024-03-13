/**
 * 1295-FindNumberswithEvenNumberofDigits
 */
public class FindNumberswithEvenNumberofDigits_1295 {

  public static int countNumberofDigits(int n) {

    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }


  public static int findNumbers(int[] a) {

    int count = 0;

    for (int i = 0; i < a.length; i++) {
      if (countNumberofDigits(a[i]) % 2 == 0) {
        count++;
      }
    }
    return count;
 
  }

  public static void main(String[] args) {

    int[] a = new int[]{1, 22, 333, 4444};

    System.out.println(findNumbers(a));

}
}