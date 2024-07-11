package homework.VeryDynamic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VeryDynamicArray veryDynamicArray = new VeryDynamicArray();
        veryDynamicArray.add(1);
        veryDynamicArray.add(2);
        veryDynamicArray.add(3);
        veryDynamicArray.add(4);
        veryDynamicArray.add(5);
        veryDynamicArray.add(6);
        veryDynamicArray.add(7);
        veryDynamicArray.add(8);
        veryDynamicArray.add(9);

        System.out.println(veryDynamicArray);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        System.out.println(veryDynamicArray);
    }
}
