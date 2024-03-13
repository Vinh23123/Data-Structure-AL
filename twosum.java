public class twosum {
  public static int[] twoSum(int[] a, int target) {
    int n = a.length;



    for(int i = 0; i < n; i++){
         for(int j = 1; j < n; j++){
             if(a[i] + a[j] == target){
                 return new int[]{i, j};
             }
    }
}
return new int[]{};
}

public static void main(String[] args) {
  
}
}
