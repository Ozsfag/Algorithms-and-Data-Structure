package homework.InsertionPlace;

import java.util.ArrayList;
import java.util.List;

public class UrbanDictionary {

    private final List<String> newRussianDictionary = new ArrayList<>();

    // Как и в любом словаре, у вас слова идут строго порядку.
    // Напишите функцию, которая будет вставлять в словарь новые слова

    public void insertNewWord(String word) {
        // please implement
        int left = 0;
        int right = newRussianDictionary.size();
        while(left < right){
            int mid = (right + left) / 2;
            if (newRussianDictionary.get(mid).compareTo(word) < 0) left = mid + 1;
            else right = mid;
        }
        newRussianDictionary.add(left, word);
    }

    public String[] newRussianDictionary() {
        return newRussianDictionary.toArray(String[]::new);
    }
}
