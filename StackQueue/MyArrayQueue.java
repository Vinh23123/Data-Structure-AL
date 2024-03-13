package StackQueue;

public class MyArrayQueue implements IStackQueue {

  private int[] array;
  private int SIZE;
  private int head;
  private int tail;
  MyArrayQueue(int size){
    SIZE = size;
    array = new int[SIZE];  
    head = tail = -1;
  }

  @Override
  public boolean push(int value) {
    if (!isFull()) {

      if (isEmty()) {
        head++;
      }
      tail++;
      array[tail] = value;
      return true;
    }
    return false;
  }

  @Override
  public int pop() {
    int value = -1;
    if (!isEmty()) {
      value = array[head];
      head++;
      if (head > tail) {
        head = tail = -1 ;
      }
    }
    return value;
  }

  @Override
  public boolean isFull() {
    return tail == SIZE - 1;
  }

  @Override
  public boolean isEmty() {
    return (head == -1 && tail == -1);
  }

  @Override
  public void show() {
    if (isEmty()) {
      System.out.println("Queue is empty");
    } else {
      for (int i = head; i < tail; i++) {
        System.out.print(array[i]);
      }
      System.out.println();
    }
  }

  public int count(){
    if (isEmty()) 
      return 0;
    return tail - head + 1; 
  }
  
}
