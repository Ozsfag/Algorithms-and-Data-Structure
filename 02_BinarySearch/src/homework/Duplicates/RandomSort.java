package homework.Duplicates;

public class RandomSort {
  public static boolean myIsSorted(int[] array) {
    //        return SortedCheck.isSorted(array); // просто сотрите эту строку и напишите свою
    // реализацию
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1]) return false;
    }
    return true;
  }

  public static void randomSort(int[] array) {
    // please implement
    // отсортируйте входной массив array

    for (int i = 0; i < array.length; i++) {
      int prevVal = array[i];
      int index = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < prevVal) {
          index = j;
          prevVal = array[j];
        }
      }
      array[index] = array[i];
      array[i] = prevVal;
    }
  }
}
