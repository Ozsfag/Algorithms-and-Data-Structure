package homework.VeryDynamic;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        veryDynamicArray.add(10);

        System.out.println(veryDynamicArray);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);
        veryDynamicArray.deleteElementAt(1);

        System.out.println(veryDynamicArray);



//        DynamicHashMap dynamicHashMap = new DynamicHashMap();
//        dynamicHashMap.add("0", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("1", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("2", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("3", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("4", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("5", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("6", "1");
////        System.out.println(dynamicHashMap);
//        dynamicHashMap.add("7", "1");
////        System.out.println(dynamicHashMap);
//
//        dynamicHashMap.add("8", "2");
//        dynamicHashMap.add("9", "2");
//        dynamicHashMap.add("10", "2");
//        dynamicHashMap.add("11", "2");
//        System.out.println(dynamicHashMap);
//
//
//        dynamicHashMap.deleteKey("1");
//        dynamicHashMap.deleteKey("2");
//        dynamicHashMap.deleteKey("3");
//        dynamicHashMap.deleteKey("4");
//        dynamicHashMap.deleteKey("5");
//        dynamicHashMap.deleteKey("6");
//        dynamicHashMap.deleteKey("7");
//        dynamicHashMap.deleteKey("8");
//
//        System.out.println(dynamicHashMap);
//        System.out.println(Arrays.stream(dynamicHashMap.getAllKeys()).collect(Collectors.toList()));
//        System.out.println(Arrays.stream(dynamicHashMap.getAllValues()).collect(Collectors.toList()));
    }
}
