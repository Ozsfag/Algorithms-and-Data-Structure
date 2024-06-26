package src.homework.HashMapsAreFast;

import java.util.Arrays;

public class HashMapsAreFast {
    int size = 0;
    int[] hashes;
    long[] phones;
    public long[] getUniqueNumbers(long[] inputArray) {
        phones = new long[1];
        hashes = new int[inputArray.length];
        if (inputArray.length == 0) return new long[]{};
        for (int index = 0; index < inputArray.length; index++){
            phones = Arrays.copyOf(phones, index + 1);
            int hash = getHash(inputArray[index]);
            if (checkHash(hash)) {
                addHash(hash, index);
                phones[index] = inputArray[index];
                size++;
            }
        }

        return getResult(phones); // please implement
    }
    private int getHash(long key){
        String num = Long.toString(key);
        int hash = 0;
        for (int i = 0; i < num.length(); i++){
            hash += num.charAt(i);
        }
        return hash;
    }

    private boolean checkHash(int hash){
        for (int j : hashes)
            if (j == hash) {
                return false;
            }
        return true;
    }

    private void addHash(int hash, int index){
        hashes[index] = hash;
    }

    private long[] getResult(long[] phones){
        for (int i = 0; i < phones.length; i++){
            for (int j = i + 1; j < phones.length; j++){
                if (phones[i] == 0){
                    phones[i] = phones[j];
                    phones[j] = 0;
                }
            }
        }
        return Arrays.copyOf(phones, size);
    }



    public boolean isThereTwoNumbers(int[] numbers, int X) {
        return false; // please implement
    }
}
