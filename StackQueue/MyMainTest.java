package StackQueue;
public class MyMainTest {
  public static void main(String[] args) {
    MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();

    myLinkedListQueue.push(1);
    myLinkedListQueue.push(2);
    myLinkedListQueue.push(3);
    myLinkedListQueue.push(4);
    myLinkedListQueue.show();
    System.out.println(myLinkedListQueue.pop());
    myLinkedListQueue.show();
  }
}
