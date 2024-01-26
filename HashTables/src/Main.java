/*
CZ
12/4/23
HK
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Create a new HashTable instance
        HashTable hashTable = new HashTable();

        //Display the initial size of the HashTable
        System.out.println("Initial size: " + hashTable.size);

        //Add 20 key-value pairs to the HashTable
        for (int i = 1; i <= 20; i++) {
            String key = "Key" + i;
            String value = "Value" + i;

            //Attempt to add the key-value pair to the HashTable
            boolean isSuccessful = hashTable.put(key, value);

            //Display the result of the add operation
            if (isSuccessful) {
                System.out.println("Successfully added: " + key + " -> " + value);
            } else {
                System.out.println("Failed to add: Collision detected for key " + key);
            }
        }

        //Retrieve values for the 20 keys added earlier
        for (int i = 1; i <= 20; i++) {
            String key = "Key" + i;
            String value = hashTable.get(key);

            //Display the retrieved value or indicate that the key was not found
            if (value != null) {
                System.out.println("Retrieved value for " + key + ": " + value);
            } else {
                System.out.println("Key not found: " + key);
            }
        }

    }
}