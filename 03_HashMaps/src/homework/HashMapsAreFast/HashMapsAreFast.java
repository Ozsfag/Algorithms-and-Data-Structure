package homework.HashMapsAreFast;

public class HashMapsAreFast {
    int size = 0;
    long[] phones = new long[]{};
    public long[] getUniqueNumbers(long[] inputArray) {

        for (int i = 0; i < inputArray.length; i++){
            int index = getIndex(inputArray[i]);
            phones[index] = inputArray[i];
            size++;
        }

        return phones; // please implement
    }
    private int getIndex(long key){
        String num = Long.toString(key);
        int hash = 0;
        for (int i = 0; i < num.length(); i++){
            hash += (int) (i * num.charAt(i) ^ i) % ;
        }

        int index;
        if (size == 0) index = hash;
        else index = hash % size;

        if (phones[index] == key) return index;

        for (int i = 0; i < size; i++){
            int probIndex = (index + i) % size;
            if (phones[probIndex] == key) return probIndex;
        }
        return -1;
    }



    public boolean isThereTwoNumbers(int[] numbers, int X) {
        return false; // please implement
    }
}
