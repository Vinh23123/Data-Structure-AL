public class remove_27{



  public static int removeElement(int[] a, int val) {
         
    int n = a.length; // Độ dài của mảng


    for (int i = 0; i < n;) {
      if (a[i] == val) {
        // xóa phần tử muốn xóa a[i]
        for (int j = i; j < n - 1; j++) {
          a[j] = a[j + 1];
        }
        n--;
      } else { // khong phai xoa
        i++;
      }
    }
  return n;
      };

      // ky thuat 2 con tro
      public static int removeElement2(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
          if (a[i] != x) {
              a[k] = a[i];
              k++;
          } else {
           // khong lam gi
          }
        }

        return k;
      };


  public static void main(String[] args) {
    int[] a = {3, 2, 2, 3};
    System.out.println(removeElement2(a,2));
    System.out.println("DONE");
  }
}

// public class remove {

//   public static int removeElement(int[] a, int val) {
//     int n = a.length;
//     int i = 0;
//     while (i < n) {
//       if (a[i] == val) {
//         for (int j = i; j < n - 1; j++) {
//           a[j] = a[j + 1];
//         }
//         n--; // Cập nhật số lượng phần tử sau khi loại bỏ
//       } else { // Không cần xóa
//         i++;
//       }
//     }
//     return n;
//   }

//   public static void main(String[] args) {
//     int[] a = {3, 2, 2, 3};
//     System.out.println(removeElement(a, 2));
//     System.out.println("DONE");
//   }
// }
