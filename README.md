# HashTables

1. Which is a better hash function:
x % n where n is a large number with several factors
x % n where n is a large prime number

Prime numbers would create a better hash function than a composite number would. After the keys are randomized in a map, a composite number does give an even distribution in the map, but when the pattern is used on the keys, they are prone to collide. See below:

6 % 4 = 2
8 % 4 = 0
10 % 4 = 2
12 % 4 = 0
------------
12 % 11 = 1
16 % 11 = 5
20 % 11 = 9
18 % 11 = 7

2. Is char values summed % 599 a good hash function for strings? Why or why not?

No, if the same string is passed in twice, a collision will occur and both strings will occupy the same hash code.

3. Take a look at Java's HashMap class and how it produces hashed values, then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

This is the formula used by the hashCode() function to output a hash value: (s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1])


***Overview***

This Java code implements a simple HashTable data structure. A HashTable is a data structure that allows efficient insertion, deletion, and retrieval of key-value pairs. In this implementation, a hash function is used to map keys to indices in an ArrayList.

**Methods**

put(String key, String value): Inserts a key-value pair into the HashTable. The hash function is used to calculate the index for the given key. If the calculated index is already occupied (collision), the insertion fails, and false is returned. Otherwise, the value is placed at the calculated index, and the size of the HashTable is incremented.

get(String key): Retrieves the value associated with the given key. The hash function is used to find the index for the key. If the index is not empty, the corresponding value is returned; otherwise, null is returned, indicating that the key is not found.

addSize(int newIndex): This method adds empty slots to the ArrayList up to a specified index. It ensures that the ArrayList size is increased if the specified index is greater than the current size.

hashCode(String key): The hash function converts the input key into an integer that represents the index in the ArrayList. The hash function utilizes the ASCII values of characters in the key and applies a simple modulo operation to create a unique index.

**Initialization**
The HashTable is initialized with an empty ArrayList and a size of 0. The ArrayList is dynamically resized as needed to accommodate new elements.


