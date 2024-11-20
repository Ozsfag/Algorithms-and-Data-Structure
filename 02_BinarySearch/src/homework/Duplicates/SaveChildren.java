package homework.Duplicates;

public class SaveChildren {
  public static void permutateWords(char[][] words) {

    for (int j = 0; j < words.length; j++) {
      char[] ex = words[j];
      for (int g = j + 1; g < words.length; g++) {
        char[] word = words[g];
        boolean flag = true;
        for (int i = 0; i < word.length; i++) {
          if (word[i] != ex[i]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          char left = word[0];
          for (int k = 0; k < word.length - 1; k++) {
            word[k] = word[k + 1];
          }
          word[word.length - 1] = left;
        }
      }
    }
  }
}
