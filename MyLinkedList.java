
public class MyLinkedList {
  


  public static class Node {
    
    int value;
    Node next;


    Node(int value){
      this.value = value;
    }
    
  }

  public static void printLinkedList(Node head){
    if (head == null) {
      System.out.println("List is empty");
    } else {
      Node temp = head;
      while (temp != null) {
        
        System.out.println(temp.value);
        temp = temp.next;
        if (temp != null) {
          System.out.println("->");
        } else {
          System.out.println();
        }
      }
    }
  }

  public static Node addToHead(Node headNode, int value){

    Node newNode = new Node(value);
    if (newNode !=  null) {
      newNode.next = headNode;
    }

    return newNode;
  }

  public static Node addToTail(Node headNode, int value){
    Node newNode = new Node(value);

    if (headNode == null) {
      return newNode;
    } else {
      // B1 xác định lastNode
      Node lastNode = headNode;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      // B2 gắn next cho lastNode = newNode
      lastNode.next = newNode;
    }
    return headNode;
  }

  public static Node addToIndex(Node headNode, int value, int index){

    if (index == 0) {
      return addToHead(headNode, value);
    } else {
      Node newNode = new Node(value);
      Node curNode = headNode;
      int count = 0;
      while (curNode != null) {
        count++;
        if (count == index) {
          // Thuc hien add
          newNode.next = curNode.next;
          curNode.next = newNode;
          break;
        }
        curNode = curNode.next;
      }

    }

    return headNode;
  }

  public static Node removeAtHead(Node headNode){
    if (headNode != null) {
      return headNode.next;
    }
    return headNode;
  }

  public static Node removeAtTail(Node headNode){
    if (headNode == null) {
        return null;
    }
    //B1. Xác định last và previous
    Node lastNode = headNode;
    Node prevNode = null;

    while (lastNode.next != null) { // lastNode.next = null
      prevNode = lastNode;
      lastNode = lastNode.next;
    }

    if (prevNode == null) {
      return null;
    } else {
      prevNode.next = lastNode.next;
    }

    return headNode;
  }

  public static Node removeAtIndex(Node headNode, int index){
    if (headNode == null || index < 0) return null;
    if (index == 0) return removeAtHead(headNode);
      
    Node currNode = headNode;
    Node prevNode = null;
    int count = 0;
    boolean bIsFound = false;
 
    while (currNode != null) {
      if (count == index) {
        // Remove currNode
        bIsFound = true;
        break;
      }
      prevNode = currNode;
      currNode = currNode.next;
      count++;

    
    }
    // Remove curr
    if (bIsFound) {
      if (prevNode == null) { //Current Node is Last Node
        return null;
      } else {
        if (currNode != null) {
          prevNode.next = currNode.next;
        }
      }
    }
    return headNode;
  }

  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    
    n1.next = n2;
    n2.next = n3;
    printLinkedList(n1);
    // printLinkedList(n2);
    // printLinkedList(n3);

  // n1 = addToHead(n1, 0);
  //   printLinkedList(n1);

  //   n1 = addToTail(n1, 4);
  //   printLinkedList(n1);

  // n1 = addToIndex(n1, 0, 0);
  // printLinkedList(n1);

  n1 = removeAtIndex(n1, 0);
  printLinkedList(n1);
  n1 = removeAtIndex(n1, 1);
  printLinkedList(n1);
  n1 = removeAtIndex(n1, 1);
  printLinkedList(n1);
}
  }

  
