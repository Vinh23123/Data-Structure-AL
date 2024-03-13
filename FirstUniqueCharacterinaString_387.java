public class FirstUniqueCharacterinaString_387 {
  
//   public static int firstUniqChar(String s) {
    
//     char[] arr = s.toCharArray();

//     int[] count = new int[123];

//     for (int i = 0; i < arr.length; i++) {
//       char c = arr[i]; 
// tại ký tự tại vị trí thứ i ta có char c, arr sẽ chứa các ký tự ['l', 'e', 'e', 't', 'c', 'o', 'd', 'e']. Với mỗi vòng lặp, biến c sẽ chứa một ký tự trong danh sách này.
//       int index = (int)c;  // phép ép kiểu trực tiếp từ char sang int để lấy mã Unicode của ký tự đó
//       count[index]++; // Mỗi lần gặp một ký tự, ta tăng giá trị tại vị trí tương ứng trong mảng count lên 1
//     }

//     for (int i = 0; i < arr.length; i++) {
//       char c = arr[i]; // tại vị trí thứ i ta có char c
//       int index = (int)c;  // covert sang index
//       if (count[index] == 1) {
//         return i;
//     }
   
//   }
//   return -1;
// }

public static int firstUniqChar(String s) {

  char[] arr = s.toCharArray();
  int[] count = new int[123];

  for (int i = 0; i < arr.length; i++) {
    char c = arr[i]; //
    int index = (int)c;
    count[index]++;
  }

  for (int i = 0; i < arr.length; i++) {
    char c = arr[i];
    int index = (int)c;
    if (count[index] == 1) {
      return i;
    }
  }
  return -1;
}

 public static void main(String[] args) {
    String s = "leetcode";

    firstUniqChar(s);
 }
}
