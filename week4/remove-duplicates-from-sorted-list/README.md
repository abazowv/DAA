# Remove Duplicates from Sorted List

## 1. Problem

The task is to remove duplicate values from a sorted linked list. Each value should appear only once.

For example:

Input: `1 -> 1 -> 2 -> 3 -> 3`

Output: `1 -> 2 -> 3`

## 2. Approach

I use a pointer called `cur` to go through the list.

I compare the current node with the next node. If both values are the same, I skip the next node by changing `cur.next`.

If the values are different, I move `cur` to the next node.

Because the list is sorted, duplicate values are next to each other.

### Example

Input: `1 -> 1 -> 2 -> 3 -> 3`

1. `cur` points to the first `1`. The next value is also `1`, so I remove the duplicate.
2. The list becomes `1 -> 2 -> 3 -> 3`. Now the next value is `2`, so I move forward.
3. The value `2` is different from `3`, so I move forward again.
4. The current value is `3`, and the next value is also `3`. I remove the duplicate.
5. The final list is `1 -> 2 -> 3`.

Output: `1 -> 2 -> 3`

### Challenges and Testing

One thing I had to consider was not moving the pointer immediately after removing a duplicate. There could be more equal values after it.

I would test an empty list, a list with one node, a list without duplicates, and a list where all values are the same.

## 3. Time Complexity

**Time Complexity: O(n)**

I go through the linked list once. Each node is checked at most a constant number of times, so the time complexity is O(n).

**Space Complexity: O(1)**

I only use one pointer and do not create another list.

## 4. Reflection / Improvement

My solution is already efficient. Since the list is sorted, I can remove duplicates in one pass. It uses O(n) time and O(1) extra space.