/**
 * ReverseLinkedList206
 */
public class ReverseLinkedList206 {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


     public static void printLinkedList(ListNode headNode){
        while (headNode != null) {
          System.out.printf("%d", headNode.val);
          headNode = headNode.next;
        }
        System.out.println();
     }

     public static ListNode reverseList(ListNode head) {

      ListNode currNode = head;
      
      while (currNode != null && currNode.next != null) {
        ListNode nextNode = currNode.next;
        currNode.next = nextNode.next;
        nextNode.next = head;
        head = nextNode;
      }

        return head;
     }   
     // Reverse đệ quy
     public static ListNode reverseList2(ListNode head){

      // TH cơ sở
      if (head == null) {
        return null;
      }
      // TH 1 node
      ListNode nextNode = head.next;
      if (nextNode == null) {
        return head;
      }
  
       // TH tổng quát
     ListNode newHead = reverseList2(nextNode);
     nextNode.next = head;
     head.next = null;

     return newHead;
     }
    

  public static void main(String[] args) {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    a1.next = a2;
    a2.next = a3;

    printLinkedList(a1);
    a1 =reverseList2(a1);
    printLinkedList(a1);
  }
}