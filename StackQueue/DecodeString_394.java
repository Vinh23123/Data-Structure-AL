package StackQueue;

import java.util.Stack;

public class DecodeString_394 {

  public static String decodeString(String s) {
     int n = s.length();
      Stack<Character>  stack = new Stack<>();


     for (int i = 0; i < n; i++) {
      char c = s.charAt(i);

      if (c == ']') {
        // Main xu ly


        //pop until meet '['
        String loopString = "";
        while (stack.peek() != '[') {
          loopString = stack.pop() + loopString;
        }
        
        // remove '['
        stack.pop();

        // get number
        String numberString = "";
        while (stack.isEmpty() == false && Character.isDigit(stack.peek())) {
          numberString = stack.pop() + numberString;
        }

        int nLoop = Integer.parseInt(numberString);
        // repeat the string
        loopString = loopString.repeat(nLoop);
        // add the result back to stack
        for (int j = 0; j < loopString.length(); j++) {
          stack.push(loopString.charAt(j));
        }
      } else {
        stack.push(c);
      }
     }

     String result = "";
     while (stack.isEmpty() == false) {
        result = stack.pop() + result;
     }
     return result;
  }

  public static void main(String[] args) {
    System.out.println(decodeString("2[ab]"));
  }
}
