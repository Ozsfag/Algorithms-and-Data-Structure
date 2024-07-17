package homework.VeryDynamic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VeryDynamicArray veryDynamicArray = new VeryDynamicArray();
        veryDynamicArray.add(0);
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




        DynamicHashMap dynamicHashMap = new DynamicHashMap();
        dynamicHashMap.add("key1", "value1");
        dynamicHashMap.add("key2", "value2");
        dynamicHashMap.add("key3", "value3");
        dynamicHashMap.add("key4", "value4");
        dynamicHashMap.add("key5", "value5");
        dynamicHashMap.add("key6", "value6");
        dynamicHashMap.add("key7", "value7");
        dynamicHashMap.add("key8", "value8");
        dynamicHashMap.add("key9", "value9");
        dynamicHashMap.add("key10", "value10");
        System.out.println(dynamicHashMap);
        dynamicHashMap.deleteKey("key1");
        dynamicHashMap.deleteKey("key2");
        dynamicHashMap.deleteKey("key3");
        dynamicHashMap.deleteKey("key4");
        System.out.println(dynamicHashMap);
        System.out.println(Arrays.toString(dynamicHashMap.getAllKeys()));
        System.out.println(Arrays.toString(dynamicHashMap.getAllValues()));
    }
}
