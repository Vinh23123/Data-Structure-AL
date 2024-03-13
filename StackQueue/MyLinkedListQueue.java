package StackQueue;

public class MyLinkedListQueue implements IStackQueue{


  public class  Node {
      int value;
      Node next;

      Node(int value){
        this.value = value;
      }    
  }

  Node headNode, tailNode;

  MyLinkedListQueue(){
    headNode = tailNode = null;
  }

  @Override
  public boolean push(int value) {
    if (isFull()) return false;

    Node newNode = new Node(value);
    if (isEmty()) {
      headNode = tailNode = newNode;
    } else {
      tailNode.next = newNode;
      tailNode = newNode;
    }
    return true;
  }

  @Override
  public int pop() {
   

    if (isEmty()) {
      return -1;
    }

    int value = headNode.value;

    if (headNode == tailNode) {
      headNode = tailNode = null;
    } else {
      headNode = headNode.next;
    }

    return value;
  }

  @Override
  public boolean isFull() {
   return false;
  }

  @Override
  public boolean isEmty() {
    return (headNode == null && tailNode == null);
  }

  @Override
  public void show() {
   if (isEmty()) {
    System.out.println("Queue is empty");
    return;
   }

   Node currNode = headNode;
   while (currNode != null) {
     System.out.print(currNode.value + " ");
     currNode = currNode.next; //
   }
   System.out.println();
  }
  
}
