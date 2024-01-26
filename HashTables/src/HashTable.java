/*
CZ
12/4/23
HK
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HashTable {

    private ArrayList<String> values;
    protected int size;

    public HashTable() {
        values = new ArrayList<String>();
        size = 0;
    }

    public void addSize(int newIndex) {
        for (int i = 0; i <= newIndex; i++) {
            if (values.size() <= newIndex && i >= values.size()) {
                values.add(i,"");
            }
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int index = hashCode(key);
        addSize(index);
        if (!values.get(index).equals("")) {
            return false;
        }
        else {
            size++;
        }
        values.add(index,value);
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        int index = hashCode(key);
        if (!values.get(index).equals("")) {
            return values.get(index);
        } else {
            return null;
        }
    }

    //returns the unique int in the range of the [0, array length)
    protected int hashCode(String key) {
        StringBuilder output = new StringBuilder();
        int sum = 0;
        int val = (int)'0';
        for (int i = 0; i < key.length(); i++) {
            int num = ((int)key.charAt(i) - val) % 491;
            sum += num;
            System.out.println(num);
            output.append(num);
        }
        System.out.println("Total: " + sum);
        return Integer.parseInt(output.toString());
    }
}
