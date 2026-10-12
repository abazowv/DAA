# Palindrome Linked List

## 1. Problem

The task is to check whether a linked list is a palindrome.

A palindrome has the same values from left to right and from right to left.

For example:

Input: `1 -> 2 -> 2 -> 1`

Output: `true`

## 2. Approach

I use an `ArrayList` to store the values from the linked list.

First, I go through the list and copy each node's value into the array.

Then I use two indexes. `left` starts at the beginning of the array, and `right` starts at the end.

I compare the values at both indexes. If they are different, I return `false`. Otherwise, I move `left` forward and `right` backward.

If all pairs match, I return `true`.

### Example

Input: `1 -> 2 -> 2 -> 1`

1. I copy all values into an array: `[1, 2, 2, 1]`.
2. I compare the first and last values: `1 == 1`.
3. I move both indexes toward the middle.
4. I compare the next pair: `2 == 2`.
5. All pairs match, so I return `true`.

Output: `true`

Another example:

Input: `1 -> 2 -> 3`

1. The array becomes `[1, 2, 3]`.
2. I compare the first and last values: `1` and `3`.
3. The values are different, so I return `false`.

Output: `false`

### Challenges and Testing

The main challenge was that a linked list does not provide direct access to the last node. I solved this by copying the values into an array.

I would test an empty list, a list with one node, an even-length palindrome, an odd-length palindrome, and a list that is not a palindrome.

## 3. Time Complexity

**Time Complexity: O(n)**

Copying the values takes O(n) time. Comparing the values from both ends takes at most O(n) time as well.

Therefore, the total time complexity is O(n).

**Space Complexity: O(n)**

I store all node values in an additional `ArrayList`. If the list has `n` nodes, the array stores `n` values, so the extra space complexity is O(n).

## 4. Reflection / Improvement

A more efficient approach uses two pointers to find the middle of the list, reverses the second half, and compares both halves.

This approach can achieve O(n) time and O(1) extra space. It uses less memory, but the code is more difficult because I need to reverse the linked list correctly.

My current solution is easier to understand and test, but it requires more memory.