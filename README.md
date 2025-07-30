# Set and HashSet in Java


# 1. Overview
A Set is a collection that does not allow duplicate elements.

HashSet is one of the most commonly used implementations of the Set interface.

Elements in a HashSet are unordered and do not maintain insertion order.

# 2. Key Points
Set (Interface)
Belongs to java.util package.

Does not allow duplicates.

Allows null value (only one null).

# Common implementations:

HashSet (unordered)

LinkedHashSet (maintains insertion order)

TreeSet (sorted order)

HashSet (Class)
Uses hashing for storing elements.

Offers constant time performance for add, remove, and lookup operations (on average).

Does not guarantee order of elements.

# 3. Common Methods
All sets share these methods:

add(E e) – adds element if not already present.

remove(Object o) – removes element if present.

contains(Object o) – checks if element exists.

isEmpty() – checks if set is empty.

size() – returns number of elements.

clear() – removes all elements.

iterator() – returns iterator for traversal.
