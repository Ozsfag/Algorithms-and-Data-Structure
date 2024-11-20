package homework.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
  public static boolean doIKnowThisLanguage(String[] languagesList, String language) {
    int left = 0;
    int right = languagesList.length - 1;
    if (language.isBlank()) return false;
    while (left <= right) {
      int middle = (right + left) / 2;
      if (languagesList[middle].charAt(0) < language.charAt(0)) {
        left = middle + 1;
      } else if (languagesList[middle].charAt(0) > language.charAt(0)) {
        right = middle - 1;
      } else {
        return true;
      }
    }
    return false;
  }

  public static class DatingUser {
    public final int iq;
    public final String name;

    public DatingUser(int iq, String name) {
      this.iq = iq;
      this.name = name;
    }
  }

  public static List<String> findUsers(
      DatingUser[] usersSortedByIq, int lowerIqBound, int professorIq) {
    int left = 0;
    int right = usersSortedByIq.length - 1;
    ArrayList<String> ans = new ArrayList<>();
    if (usersSortedByIq.length == 0) return ans;
    while (left <= right) {
      if (usersSortedByIq[left].iq < lowerIqBound) {
        left++;
      } else if (usersSortedByIq[right].iq > professorIq) {
        right--;
      } else {
        for (int i = left; i <= right; i++) {
          ans.add(usersSortedByIq[i].name);
        }
        break;
      }
    }
    return ans;
  }

  public static int findPhoneNumber(long[] sort, long phone) {
    int left = 0;
    int right = sort.length - 1;
    int index = -1;

    if (sort.length == 0) return index;

    if (sort[left] < sort[right]) {
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (sort[mid] < phone) {
          left = mid + 1;
        } else if (sort[mid] > phone) {
          right = mid - 1;
        } else if (sort[mid] == phone) {
          index = mid;
          break;
        }
      }
    } else {
      while (left <= right) {
        int mid = left + (right - left) / 2;
        if (sort[mid] > phone) {
          left = mid + 1;
        } else if (sort[mid] < phone) {
          right = mid - 1;
        } else if (sort[mid] == phone) {
          index = mid;
          break;
        }
      }
    }

    return index; // please implement
  }
}
