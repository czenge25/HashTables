/*
CZ
12/4/23
HK
 */

import java.util.ArrayList;

public class HashTable {

    private ArrayList<String> values;
    protected int size;

    //Constructor initializes the HashTable with an empty ArrayList and size set to 0
    public HashTable() {
        values = new ArrayList<String>();
        size = 0;
    }

    //Method to add empty slots to the ArrayList up to a specified index
    public void addSize(int newIndex) {
        for (int i = 0; i <= newIndex; i++) {
            //Ensure the ArrayList size is increased if the specified index is greater than the current size
            if (values.size() <= newIndex && i >= values.size()) {
                values.add(i, "");
            }
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys
    public boolean put(String key, String value){
        int index = hashCode(key);
        addSize(index);
        //If the slot at the calculated index is not empty, return false (collision)
        if (!values.get(index).equals("")) {
            return false;
        }
        else {
            //Place the value at the calculated index in the array
            size++;
        }
        values.add(index,value);
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found
    public String get(String key) {
        int index = hashCode(key);
        //If the slot at the calculated index is not empty, return the value
        if (!values.get(index).equals("")) {
            return values.get(index);
        } else {
            //Return null if the slot is empty (key not found)
            return null;
        }
    }

    //returns the unique int in the range of the [0, array length)
    protected int hashCode(String key) {
        StringBuilder output = new StringBuilder();
        int sum = 0;
        int val = (int)'0';
        for (int i = 0; i < key.length(); i++) {
            //Uses hash function to add nums to sum
            int num = ((int)key.charAt(i) - val) % 491;
            sum += num;
            System.out.println(num);
            output.append(num);
        }
        //Prints the final sum
        System.out.println("Total: " + sum);
        return Integer.parseInt(output.toString());
    }
}
