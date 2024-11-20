package examples.Dynamic;

import java.util.Arrays;

public class DynamicArray {
  public int[] values = new int[8];
  public int size = 8;
  public int currentIndex = 0;

  public void add(int value) {
    values[currentIndex] = value;
    currentIndex++;
    if (currentIndex == size) {
      resize(size * 2);
    }
    //        if (currentIndex < size / 4) {
    //            resize(size / 2);
    //        }
  }

  public void resize(int newSize) {
    int[] newValues = new int[newSize];
    for (int i = 0; i < size; i++) {
      newValues[i] = values[i];
    }
    values = newValues;
    size = newSize;
  }

  @Override
  public String toString() {
    return "DynamicArray{"
        + "values="
        + Arrays.toString(values)
        + ", size="
        + size
        + ", currentIndex="
        + currentIndex
        + '}';
  }
}
