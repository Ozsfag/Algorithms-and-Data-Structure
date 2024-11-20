package com.skillbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Stack implemented using dynamic array inside
public class Stack {
  // Array where we store the data
  private long[] a;
  // Number of elements that we actually store in the array. <= a.length
  private int size;

  public int getSize() {
    return size;
  }

  // This function is called when it's not enough memory to fit new elements.
  // It creates new long array and copies all the elements there.
  public void reallocate() {
    long[] newArr = new long[a.length * 2];
      System.arraycopy(a, 0, newArr, 0, a.length);
    a = newArr;
    /* IMPLEMENT THIS */
  }

  public Stack() {
    a = new long[10];
    size = 0;
  }

  // Adds element to the end of the stack
  public void push_back(long x) {
    int index = getSize();
    if (index >= a.length) {
      reallocate();
    }
    a[index] = x;
    size++;
    /* IMPLEMENT THIS */
  }

  // Removes last element from the stack and returns its value
  public long pop_back() {
    int index = getSize() > 0 ?  getSize() - 1 : 0;
    long last = a[index];
    a[index] = 0;
    if (size > 0) {
      size--;
    }
    /* IMPLEMENT THIS */
    return last;
  }

  // Returns value of the last element in the stack
  public long top() {
    int index = getSize() - 1;
    /* IMPLEMENT THIS */
    return a[index];
  }

  // Calculates the result of reversed polish notation.
  // https://en.wikipedia.org/wiki/Reverse_Polish_notation
  // This one is simplified. Every number and character are separated by exactly one space.
  // Only + - * should be supported.
  // Example: calcPolish("1 2 3 * -") should return -5 | because (1 - (2 * 3))
  public static long calcPolish(String s) {
    Stack stack = new Stack();
    String[] charSeq = s.trim().split(" ");
      for (String string : charSeq) {
          if (isDigit(string)) {
              long num = Long.parseLong(string);
              stack.push_back(num);
          } else {
              if (string.equals("+")) {
                  long first = stack.pop_back();
                  long second = stack.pop_back();
                  long result = first + second;
                  stack.push_back(result);
              }
              if (string.equals("*")) {
                  long first = stack.pop_back();
                  long second = stack.pop_back();
                  long result = first * second;
                  stack.push_back(result);
              }
              if (string.equals("-")) {
                  long first = stack.pop_back();
                  long second = stack.pop_back();
                  long result = second - first;
                  stack.push_back(result);
              }
          }
      }
    if (stack.getSize() == 1) {
      return stack.top();
    }
    /* IMPLEMENT THIS */
    return 0;
  }

  private static boolean isDigit(String item) {
    String regex = "\\d";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(item);
    return matcher.find();
  }
}
