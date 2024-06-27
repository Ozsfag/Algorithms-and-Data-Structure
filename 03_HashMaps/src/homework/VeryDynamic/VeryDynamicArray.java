package homework.VeryDynamic;

import examples.Dynamic.DynamicArray;

public class VeryDynamicArray extends DynamicArray {
    int[] values = super.values;
    int size = super.size;

    public void deleteElementAt(int index) {
        for (int i = index; i < values.length - 1; i++){
            values[i] = values[i + 1];
        }
    }

    public void decreaseResize(){

    }
}
