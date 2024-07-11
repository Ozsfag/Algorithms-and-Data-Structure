package homework.VeryDynamic;

import examples.Dynamic.DynamicArray;

import java.util.Arrays;

public class VeryDynamicArray extends DynamicArray {
    int[] values = super.values;
    int size = super.size;

    public void deleteElementAt(int index) {
        for (int i = index; i < values.length - 1; i++){
            values[i] = values[i + 1];
        }
        values[values.length - 1] = 0;
        decreaseResize();
    }

    public void decreaseResize(){
        int currenSize = 0;
        for (int val : values){
            if (val != 0) currenSize += 1;
        }
        if ((super.size / 4) > currenSize){
            super.values = Arrays.copyOf(values, size / 4);
            super.size = super.values.length;
            super.currentIndex = super.size;
        }
    }
}
