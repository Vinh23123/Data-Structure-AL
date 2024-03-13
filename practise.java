public class practise {

  public static void printArray(int no, int[] a){
    System.out.printf("%d:", no);

    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d", a[i]);
    }
    System.out.println();
  }

  public  static void bubbleSort(int[] a){
    int n = a.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i -1; j++) {
        if (a[j] > a[j+1]) {
          int m = a[j];
          a[j] = a[j+1];
          a[j+1] = m; 
        }
      }
      printArray(i, a );
    }
  }

  public static void insertionSort(int[] a){
     int n = a.length;


    
    for (int i = 0; i < n; i++) {
          
    int j = i - 1;
    int ai = a[i];
      while (j >= 0 && a[j] > a[i]) {
        a[j+1] = a[j];
        j--;
       }
       
        a[j+1] = ai;

       printArray(i, a );
    }

    
  }  

  public static void selectionSort(int[]a){

    int n = a.length;

    for (int i = 0; i < n; i++) {

       int minIndex = i;
      int j = i + 1;
      if (a[j] < a[minIndex]) {
        minIndex = j;
      }

      if (minIndex != 0) {
        int t = a[i];
        a[i] = a[minIndex];
        a[minIndex] = t; 
      }
      printArray(i, a );
    }

  }

  public static  int[] sortedSquares(int[] a){
    int n = a.length;
     
    int[] sq= new int[n];


    int i = -1;
    while (i + 1 < n && a[i+1] < 0) {
      i++;
    }
    int j = n;
    int k = 0;
    while (j - 1 >= 0 && a[j-1] >= 0) {
      j--;
    }


    while (i >= 0 || j < n) {
      if (i >= 0 && j < n) {
      int ii = a[i] * a[i];
      int jj = a[j] *  a[j];
        if (ii < jj) {
          
          sq[k] = ii;
          i--; k++;
        } else {
          sq[k] = jj;
          j++; k++;
        }
      } else if (i >= 0){ // i valid
        sq[k] = a[i] * a[i];
        i--; k++;
      } else { // j valid
        sq[k] = a[j] * a[j];
        j++; k++;
      } 
      
    }
    return sq;
  }

  public static void duplicateZeros(int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      if (a[i] == 0) {
        for (int j = n - 2 ; j < i + 1; j++) {
          a[j+1] = a[i];
        }
        a[i+1] = 0;
        i++;
      }
    }
  }

  public static void numbers(int[] a){

    int n = a.length;
    for (int i = 0; i < n-1; i++) {
      System.out.println(a[i]);
    }
    
  }

  public static void printElement(int[] a, int index){

    //bai toan co so
    if (index < 0 || index >= a.length) {
      return;
    }
    // quy nap
     // (-2) => (-1) => 5 => 3 => 8 => 6
    printElement(a, index+1);
    System.out.println(a[index]);
  }

  public static void main(String[] args) {
    
    int[] a = new int[]{-2, -1, 5, 3, 8, 6};

 

    printElement(a, 0);

  }


}
