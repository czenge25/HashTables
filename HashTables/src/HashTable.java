public class HashTable {

    String[] values;
    int size;

    public HashTable(int capacity) {
        values = new String[capacity];
        size = capacity;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {

    }

}
