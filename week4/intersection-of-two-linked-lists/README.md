# Intersection of Two Linked Lists

## 1. Problem

The task is to find the node where two linked lists intersect. If they do not share a node, the method returns `null`.

Two nodes with the same value are not necessarily the same node. They must refer to the same object.

## 2. Approach

I use two pointers, `a` and `b`.

Pointer `a` starts at the beginning of list A, and pointer `b` starts at the beginning of list B.

Both pointers move one node at a time. When a pointer reaches the end of its list, it starts again from the beginning of the other list.

This helps both pointers travel the same total distance. If the lists intersect, the pointers eventually meet at the shared node. If they do not intersect, both pointers eventually become `null`.

### Example

List A:

`4 -> 1 -> 8 -> 4 -> 5`

List B:

`5 -> 6 -> 1 -> 8 -> 4 -> 5`

Assume both lists share the same nodes starting from the node with value `8`.

1. Pointer `a` starts at list A, and pointer `b` starts at list B.
2. Both pointers move forward one node at a time.
3. When a pointer reaches the end of its list, it starts at the head of the other list.
4. After switching lists, both pointers travel the same total distance.
5. They eventually meet at the shared node with value `8`.

Output: the shared node with value `8`.

If there is no intersection, both pointers become `null`, and the method returns `null`.

### Challenges and Testing

The main challenge was understanding why the pointers need to switch to the other list after reaching the end.

I also had to remember to compare nodes using `a != b`, not their values. Two different nodes can contain the same value.

I would test lists that intersect at the beginning, intersect near the end, have no intersection, and include an empty list.

## 3. Time Complexity

**Time Complexity: O(m + n)**

Here, `m` is the length of list A and `n` is the length of list B.

Each pointer travels through both lists at most once. Therefore, the total time grows linearly with the combined length of the lists.

**Space Complexity: O(1)**

I only use two pointers. No additional list or array is created.

## 4. Reflection / Improvement

This solution is already efficient. Compared with checking every node in list A against every node in list B, it improves the time complexity from O(m × n) to O(m + n).

The solution also uses O(1) extra space, so there is no need for an additional data structure.