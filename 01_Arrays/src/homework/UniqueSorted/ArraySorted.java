package homework.UniqueSorted;

import java.util.HashMap;
import java.util.LinkedHashMap;

class ArraySorted {

    /**
     * @see Printer#printPhoneInfo(long phone, int count)
     */
    static void groupAndPrint(long[] phoneNumbers, Printer printer) {
        HashMap<Long, Integer> uniqueNum = new LinkedHashMap<>();
        long prevNum = phoneNumbers[0];
        int count = 1;
        for (int i = 1; i < phoneNumbers.length; i++){
            if (prevNum != phoneNumbers[i]){
                uniqueNum.put(prevNum, count);
                count = 0;
                prevNum = phoneNumbers[i];
            }
            count++;
        }
        uniqueNum.put(prevNum, 1);
        uniqueNum.forEach(printer::printPhoneInfo);
    }


    /**
     * @see Printer#printCurrencyInfo(String name, double amount)
     */
    static void cryptoCurrencyAnalysis(String fileContents, Printer printer) {
        System.out.printf("Input file contents: \n%s\n", fileContents);
        HashMap<String, Double> uniqueNum = new HashMap<>();
        String[] splittedContent = fileContents.split("\n");
        String prevLine = splittedContent[0].trim();
        int count = 1;
        uniqueNum.put(getName(prevLine), getValue(prevLine));
        for (int i = 1; i < splittedContent.length; i++) {
            String item = splittedContent[i].trim();
            if (!getName(item).equals(getName(prevLine))) {
                uniqueNum.put(getName(prevLine), uniqueNum.get(getName(prevLine)) / count);
                uniqueNum.put(getName(item), getValue(item));
                prevLine = item;
                count = 1;
            }else {
                uniqueNum.put(getName(item), uniqueNum.get(getName(item)) + getValue(item));
                count++;
            }
        }
        uniqueNum.put(getName(prevLine), uniqueNum.get(getName(prevLine)) / count);
        uniqueNum.forEach(printer::printCurrencyInfo);
    }
    private static double getValue(String item){
        return Double.parseDouble(item.substring(item.indexOf(":") + 1));
    }
    private static String getName(String item){
        return item.substring(0, item.indexOf(":"));
    }
}
