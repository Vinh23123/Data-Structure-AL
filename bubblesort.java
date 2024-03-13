/**
 * bubblesort
 */
public class bubblesort {


  public static void printArray(int no, int[] a){
    System.out.printf("%d:", no);

    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d", a[i]);
    }
    System.out.println();
  }

  public static void bubblesortFunction(int[] a){

    // int n = a.length;

    // for (int i = 0; i < n; i++) {
    //   for (int j = 0; j < n-i-1; j++) {
    //     if (a[j] > a[j+1]) {
    //       int m = a[j] ;
    //       a[j] = a[j+1];
    //       a[j+1] = m;
    //   }
    // }

    int n = a.length;
      
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j+1]) {
          int t = a[j];
          a[j] = a[j+1];
          a[j+1] = t;
        }
      }
      printArray(i, a);
    }
    
  }



public static void insertionSort(int[] a){
  int n = a.length;

  for (int i = 0; i < n; i++) {
    // chèn a[i] vào dãy 0 -> i - 1
    
    int ai = a[i]; // 
    int j = i - 1;
    // dời sang bên phải 
    while (j >= 0 && a[j] > ai) {
      a[j+1] = a[j];
      j--;
    }

    a[j+1] = ai;
    printArray(i, a);
  }
  
}


public static void selectionSort(int[] a){
  int n = a.length;

  for (int i = 0; i < n - 1; i++) {
    
    int minIndex = i;
    // Tìm giá trị nhỏ nhất
    for (int j = i + 1; j < n; j++) {
      if (a[j] < a[minIndex]) {
        minIndex = j;
      }
      
    }
    // Đổi cho cho nhau
    if (minIndex != i) {
      int t = a[i];
      a[i] = a[minIndex];
      a[minIndex] = t;
    }
    printArray(i, a);
  }
  
}

  public static void main(String[] args) {
    int[] a = new int[]{3,2,5,4,8,6};
    System.out.println("DONE");
    bubblesortFunction(a);
}}