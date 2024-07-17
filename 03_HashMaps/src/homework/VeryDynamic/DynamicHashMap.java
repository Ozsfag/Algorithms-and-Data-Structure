package homework.VeryDynamic;

import examples.Dynamic.HashMap;

import java.util.Objects;

public class DynamicHashMap extends HashMap {

    public void deleteKey(String key) {
        for (int j = 0; j < super.numberOfElements; j++) {
            if (super.entries[j] == null) continue;
            if(super.entries[j].key.equals(key)) {
                for (int i = j; i < super.entries.length - 1; i++){
                    super.entries[i] = super.entries[i + 1];
                }
                super.numberOfElements--;
            }
        }

        if (super.numberOfElements <= super.size / 4) {
            super.size /= 2;
            resize(super.size);
        }

        // please implement
    }

    public String[] getAllKeys() {
        String[] keys = new String[super.numberOfElements];
        for (int i = 0; i < numberOfElements; i++){
            if (entries[i] == null) continue;
            keys[i] = entries[i].key;
        }
        return keys; // please implement
    }

    public String[] getAllValues() {
        String[] values = new String[super.numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            if (entries[i] == null) continue;
            values[i] = entries[i].value;
        }
        return values; // please implement
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (HashMap.KeyValuePair entry : super.entries){
            if (Objects.isNull(entry)) continue;
            result.append("key - ").append(entry.key).append("; ").append("value - ").append(entry.value).append("\n").append(" ");
        }
        return result.toString();
    }
}
