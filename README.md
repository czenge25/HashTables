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
