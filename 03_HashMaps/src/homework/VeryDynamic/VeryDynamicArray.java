package homework.VeryDynamic;

import examples.Dynamic.DynamicArray;

import java.util.Arrays;

public class VeryDynamicArray extends DynamicArray {

    public void deleteElementAt(int index) {
        for (int i = index; i < super.values.length - 1; i++){
            super.values[i] = super.values[i + 1];
        }
        super.values[super.values.length - 1] = 0;
        decreaseResize();
    }

    public void decreaseResize(){
        int currenSize = 0;
        for (int val : super.values){
            if (val != 0) currenSize += 1;
        }
        if ((super.size / 4) >= currenSize){
            super.values = Arrays.copyOf(super.values, super.size / 2);
        }
        super.size = super.values.length;
        super.currentIndex = currenSize;
    }
}
