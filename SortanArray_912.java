import java.util.Arrays;

public class SortanArray_912 {

  public static int[] merge(int[] a1, int[] a2){
    // TRon Vao: a2 và a1 là các mảng đã được sắp xếp. Vì nó từng phần tử một
    int  n = a1.length + a2.length;
    int[] result = new int[n];


    int i = 0; int i1 = 0; int i2 = 0;
    while (i < n) {
      if (i1 < a1.length && i2 < a2.length) { // a1 & a2 != Rỗng, thì chúng ta chèn phần tử nhỏ hơn vào

        if (a1[i1] <= a2[i2]) {
          result[i] = a1[i1];
          i++; i1++;
        } else {
          result[i] = a2[i2];
          i++; i2++;
        }
      } else {
        if (i1 < a1.length){
        result[i] = a1[i1];
        i++; i1++;
      } else {
        result[i] = a2[i2];
        i++; i2++;
      }} 
    }

    return result;

  }

  public static int[] mergeSort(int[] a, int L, int R){
    // THDB

    if (L > R) return new int[0];
      if (L == R) { // là chia từng số ra thành mảng nhỏ
        int[] singleElement = {a[L]};
        return singleElement;
        
      }
    // THTQ
    // Chia ra
      System.out.println("Chia " + L + " - " + R); // log
    int k = (L + R)/ 2; // k = 3 là vị trí cuối của mảng đầu
    int[] a1 = mergeSort(a, L, k); // chia nhỏ ra tiếp phía bên trái 
    int[] a2 = mergeSort(a, k+1, R); // chia nhỏ ra tiếp phía bên phải


    int[] result = merge(a1, a2);
    System.out.println("Ket qua Merge: " + Arrays.toString(result));
      return result;
  }


  public int[] sortArray(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
  }
 
  public static void main(String[] args) {
    SortanArray_912 s = new SortanArray_912();
    int[] a = {1, 3, 5, 7, 9};
    int[] b = {2, 3, 6, 8, 10};
    int[] c = {1, 5, 3, 2, 8, 7, 6, 4};


    System.out.println(Arrays.toString(s.mergeSort(c, 0, c.length - 1)));
  }

}
