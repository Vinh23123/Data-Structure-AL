/**
 * SquaresofaSortedArray_977
 */
public class SquaresofaSortedArray_977 {


  public static int[] sortedSquares(int[] a) {
    int n = a.length;
    int[] squares = new int[n];

    // Tìm i và j
    // Tìm i: là chỉ số của số âm cuối cùng trong dãy
    int i = -1;
    while (i + 1 < n && a[i + 1] < 0) {
        i++;
    }

    // Tìm j: là chỉ số của số không âm trái cuối cùng trong dãy
    int j = n;
    while (j - 1 >= 0 && a[j - 1] >= 0) {
        j--;
    }

    // System.out.println("i:" + i +" "+ "j:" + j);

    // index of squares
    int k = 0;
    while (i >= 0 || j < n) {
      if (i >= 0 && j < n) { // both i and j are valid
        int ii = a[i] * a[i];
        int jj = a[j] * a[j];

        if (ii < jj) {
          squares[k] = ii;
        i--; k++;
        } else {
          squares[k] = jj;
        j++; k++;
        }
      }else if (i >= 0) { // only i is valid
        squares[k] = a[i] * a[i];
        i--; k++;
      } else { // only j is valid
        squares[k] = a[j] * a[j];
        j++; k++;
      }
    } 
    return squares;
  }
  public static void main(String[] args) {
      
    int[] a = new int[] {-4,-1,0,3,10};
    sortedSquares(a);
  }
}