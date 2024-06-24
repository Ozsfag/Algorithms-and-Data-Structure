package homework.ArrayTop;

import java.util.Arrays;

class TopX {

    private static int findMaxUnderBoundary(int index, int[] inputArray, int topBoundary){
        int currentMax = Integer.MIN_VALUE;
        int count = 0;
        for (int j : inputArray) {
            if (j == topBoundary) {
                count++;
            }
        }
        for (int j : inputArray) {
            if (j <= topBoundary && index != count) {
                currentMax = Math.max(j, currentMax);
            } else if (j < topBoundary) {
                currentMax = Math.max(j, currentMax);
            }
        }
        return currentMax;
    }

    public static int[] findTopElements(int[] inputArray, int numberOfElements){
        if (numberOfElements <= 0 || inputArray == null || inputArray.length == 0) return null;
        int[] topElements = new int[numberOfElements];
        int previousMax = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfElements; i++) {
            int currentMax = findMaxUnderBoundary(i, inputArray, previousMax);
            previousMax = currentMax;
            topElements[i] = currentMax;
        }
        return topElements;
    }

    public static int[] findBottomElements(int[] inputArray, int numberOfElements) {
        int[] botElements = new int[numberOfElements];
        int prevVal = Integer.MIN_VALUE;
        for (int i = 0; i < numberOfElements; i ++){
            int cur = findMinUpperBoundary(inputArray, prevVal);
            prevVal = cur;
            botElements[i] = cur;
        }
        return botElements; // Please implement
    }
    public static int findMinUpperBoundary(int[]inputArray, int bottomBoundary){
        int currMin = Integer.MAX_VALUE;
        for (int j : inputArray) {
            if (j > bottomBoundary) currMin = Math.min(currMin, j);
        }
        return currMin;
    }

    public static void main(String[] args){
        int[] array = new int[]{100, 55, 8, 100, 100};

        int[] top5 = findTopElements(array, 4);
        System.out.println("Top 5: " + Arrays.toString(top5));

    }
}
