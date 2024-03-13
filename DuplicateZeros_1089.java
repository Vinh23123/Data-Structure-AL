public class DuplicateZeros_1089 {
  
  public static void duplicateZeros(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
         if (a[i] == 0)
          {
            // Dich a[i+1] -> a[n-2] sang phai 1 don vi
          for (int j = n - 2 ; j >= i + 1; j--)
          {
           a[j+1] = a[j]; // Có nghĩa là dịch từ n - 2 sang n - 1
          }
          // Gan a[i+1] = 0
          a[i+1] = 0; 
          i++;
         } 
        }
  }

//   public static void duplicateZeros(int[] a) {
//     int n = a.length;

//     for (int i = 0; i < n; i++) {
//         if (a[i] == 0) {
//             // Dich a[i+1] -> a[n-2] sang phai 1 don vi
//             for (int j = n - 2; j > i; j--) {
//                 a[j + 1] = a[j]; // Dịch phần tử sang phải
//             }
//             // Gan a[i+1] = 0
//             if (i + 1 < n) {
//                 a[i + 1] = 0; // Sau khi dịch, thêm số 0 vào sau số 0 ban đầu
//             }
//             i++; // Bỏ qua phần tử tiếp theo, vì đã xử lý ở trên
//         }
//     }
// }

 public static void main(String[] args) {
    int[] a = new int[]{1,0,2,3,0,4,5,0};

    duplicateZeros(a);
 }
}
