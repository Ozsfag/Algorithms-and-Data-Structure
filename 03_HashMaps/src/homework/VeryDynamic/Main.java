package homework.VeryDynamic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VeryDynamicArray veryDynamicArray = new VeryDynamicArray();
        veryDynamicArray.add(1);
        veryDynamicArray.add(2);
        veryDynamicArray.add(1);
        veryDynamicArray.add(2);
        veryDynamicArray.add(2);
        veryDynamicArray.add(1);

        System.out.println(veryDynamicArray);
        veryDynamicArray.deleteElementAt(1);
        System.out.println(veryDynamicArray);
    }
}
