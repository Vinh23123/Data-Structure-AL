
public class Merge_Sorted_Array88 {

  

    // public static void merge(int[] n1, int m, int[] n2, int n){
  
    //   for(int ai : n2){
    //     chenPhanTuVaoMang(ai, n2, m);
    //     m++;
    //   }
    // }
  
    // private static void chenPhanTuVaoMang(int x, int[] a, int m) {
    //   boolean timDuocK = false;
    //   for (int k = 0; k < a.length; k++) {
    //     if (a[k] > x) {
    //       timDuocK = true;
  
    //       for (int i = m - 1; i >= k; i--) {
    //         a[i+1] = a[i];
    //       }
    //       a[k] = x;
    //       break;
    //     }
    //   }
    //   if (timDuocK == false) {
    //     a[m] = x ;
    //   }
    // }
  
  
    // //ky thuat 2 con tro
  
    // public static void merge2(int[] n1, int m, int[] n2, int n){
  
  
    //   int i = m - 1;
    //   int j = m - 1;
    //   int k = (m + n - 1); // tổng 2 mảng cộng lại, và là vị trí cuối cùng trong mảng nên là -1
  
    //   while (k >= 0) {
    //     if (j < 0) {
    //         n1[k] = n1[i];
    //         i--;
    //     } else if (i < 0) {
    //       n1[k] = n2[j];
    //       j--;
    //     } else if (n1[i] > n2[j]) {
    //       n1[k] = n1[i];
    //       i--;
    //     } else if (n1[i] <= n2[j]) {
    //       n1[k] = n2[j];
    //       j--;
    //     }
    //     k--;
    //   }
  
      
    // }
  
  
    public static void merge(int[] ai, int ni, int[] aj, int nj) {
       int i =  ni -1;
       int j = nj - 1;
        int k = ni + nj - 1;

        while (i >= 0 || j >= 0 ) {
          if (i >= 0 && j >= 0) {
            // tìm phần tử lớn hơn nhét vào mảng ai
            if (ai[i] >= aj[j]) {
              ai[k] = ai[i];
              i--;
              k--;
            } else {
              ai[k] = aj[j];
              j--;
              k--;
            }
          } else if (i >= 0){ // chỉ có i hợp lệ
            ai[k] = ai[i];
            i--;
            k--;
          } else { // chỉ có j hợp lệ
            ai[k] = aj[j];
            j--;
            k--;  
          }
        }


    }
  
    public static void main(String[] args) {
      int[] n1= {2,3,4,5,0,0,0};
      int[] n2= {0,3,6};
  
      merge(n1, 4, n2, 3);
      System.out.println("Done");
    }
   
} 