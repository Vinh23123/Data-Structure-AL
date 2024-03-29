package HashTable;

import java.util.Map;

public class HashMap {
  


  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 1, 2};
    Map<Integer, Integer> myMap = new java.util.HashMap<>();

    // key: Giá trị của phần tử trong mảng
    // value: là số lần xuất hiện của phần tử trong mảng
    for (int i : arr) {
      if (myMap.containsKey(i) == false) {
        // i chưa xuất hiện trong map
        myMap.put(i, 1);
      } else {
        // i đã xuất hiện trước đó
        int soLanXuatHien = myMap.get(i);
        soLanXuatHien++;
        myMap.put(i, soLanXuatHien);
      }
    }

    for (Map.Entry entry : myMap.entrySet()) {
      System.out.println(entry.getKey() + "SỐ LẦN XUẤT HIỆN: " +entry.getValue());
    }
  }
}
