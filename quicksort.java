import java.util.Arrays;

public class quicksort {

  public static void quickSort(int[] a, int L, int R){
    
    // Điều kiện dừng
    if (L >= R) return;
      
  
    //B1: Chọn Khóa
    int key = a[(L+R)/2];
    //B2: Phân bố lại mảng theo khóa
    int k = partition(a, L, R, key);
    System.out.println("L= " + L + "R= " + R);
    //B3: Chia đôi mảng => lặp lại

    quickSort(a, L, k-1);
    quickSort(a, k, R);
  }
  // return pivot value
  public static int partition(int[] a, int L, int R, int Key){
    
    int iL = L;
    int iR = R;
    while (iL <= iR) {
      // Với iL, đi tìm phần tử >= key để đổi chỗ
      while (a[iL] < Key) iL++;
      // Với iR, đi tìm phần tử <= key để đổi chỗ
      while (a[iR] > Key) iR--;
      // Đổi chỗ 2 phần tử đang đứng không vị trí
      if (iL <= iR) {
        int temp = a[iL];
        a[iL] = a[iR];
        a[iR] = temp;
        iL++; iR--;
      }
    }
 
    return iL;
  }

  public static void main(String[] args) {
    int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
    
    quickSort(a, 0, a.length - 1);
    System.err.println(Arrays.toString(a));
  }
}
