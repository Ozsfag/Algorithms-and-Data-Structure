package homework.InsertionPlace;

import examples.Doka3;
import java.util.Objects;

public class Doka4 {
  public static int searchRightmostPlayerWithRating(Doka3.Player[] queue, int ratingBand) {
    int left = 0;
    int right = queue.length - 1;
    if (queue[left].getRating() > ratingBand) return -1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (queue[mid].getRating() < ratingBand) left = mid + 1;
      else if (queue[mid].getRating() > ratingBand) right = mid;
      else if (left == mid) return left;
      else left = mid;
    }
    return Objects.nonNull(queue[left]) ? left : -1;
  }

  public static Doka3.Player[] insertPlayerInQueueWithShift(
      Doka3.Player[] queue, int index, Doka3.Player newPlayer) {
    // please implement
    int pos;
    int left = 0;
    int right = queue.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (queue[mid].getRating() < newPlayer.getRating()) left = mid + 1;
      else if (queue[mid].getRating() > newPlayer.getRating()) right = mid;
      else if (left == mid) {
        pos = left;
        break;
      } else left = mid;
    }
    pos = Objects.nonNull(queue[left]) ? left : -1;

    for (int k = queue.length - 1; k > index; k--) {
      queue[k] = queue[k - 1];
    }
    queue[Math.max(index + 1, pos)] = newPlayer;
    return queue;
  }
}
