package homework.VeryDynamic;

import examples.Dynamic.DynamicArray;

import java.util.Arrays;

public class VeryDynamicArray extends DynamicArray {
    int[] values = super.values;
    int size;

    public void deleteElementAt(int index) {
        int end = values.length - 1;
        for (int i = index; i < end; i++){
            values[i] = values[i + 1];
        }

        super.size--;

        if (getSize() / 4 >= super.size) decreaseResize();
    }
    private int getSize() {
        for (int val : values){
            if (val != 0) size++;
        }
        return size;
    }

    public void decreaseResize(){
            super.values = Arrays.copyOf(super.values, super.size);
            super.currentIndex = super.size;
    }
}
