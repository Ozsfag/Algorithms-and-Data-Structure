package homework.UniqueNumbers;

import java.util.ArrayList;
import java.util.List;

class ArrayUnique {
    static List<Character> lettersLearnedToday(String word) {
        ArrayList<Character> uniqueLetters = new ArrayList<>();
        for (Character curLetter : word.toCharArray()){
            boolean isExist = false;
            for (Character uniqueLetter: uniqueLetters){
                if (uniqueLetter.equals(curLetter)){
                    isExist = true;
                    break;
                }
            }
            if (!isExist)uniqueLetters.add(curLetter);
        }
        return uniqueLetters; // please implement
    }

    static int avoidJailDueToTaxFraud(int[][] report) {
        ArrayList<Integer> uniqueNum = new ArrayList<>();
        int answer = -1;
        for (int[] nums : report){
            for (int currNum : nums){
                if (uniqueNum.contains(currNum)){
                   return currNum;
                }
                uniqueNum.add(currNum);
            }
        }
        return answer;  // please implement
    }
}
