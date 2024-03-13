/**
 * RichestCostumerWealth_1672
 */
public class RichestCostumerWealth_1672 {
  public static int maximumWealth(int[][] a) {

    int soKhanhHang = a.length;
    int soNganHang = a[0].length;
    int max = 0;

    for (int i = 0; i < soKhanhHang; i++) {
       int totalI = 0;
      for (int j = 0; j < soNganHang; j++) {
        totalI += a[i][j]; // totalI = totalI + a[i][j]
      }
      if (totalI > max ) {
        max = totalI;
      }
     
    } 
    // Kiếm nhà giàu nhất trong array tongTaiSan
    
    // for (int i = 0; i < soKhanhHang; i++) {
    //   // System.out.println("Tong tai san khach hang" + ":" + tongTaiSan[i]);
   
    // }

        return max;
  }
  public static void main(String[] args) {
    int[][] a = {{1,2,3},{5,2,1}};
    // int[][] b = new int[2][3];

    // int soHang = a.length; // 2 - số hàng của mỗi mảng
    // int soCot = a[0].length; // 3 - số cột bằng với số giá trị của mảng

    // System.out.println("So hang " + soHang);
    // System.out.println("So cot " + soCot);


    // for (int i = 0; i < soHang; i++) {
      


    //   for (int j = 0; j < soCot; j++) {
    //     System.out.println(a[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    System.out.println(maximumWealth(a)); 
  }

  
}