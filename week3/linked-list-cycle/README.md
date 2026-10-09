
# Linked List Cycle

## 1. Problem

In this task, I need to check if a linked list has a cycle.

A cycle means that a node points back to a previous node instead of the list ending with null.

The method should return true if there is a cycle and false if there is no cycle.

## 2. Approach

I use two pointers called slow and fast.

The slow pointer moves one step at a time, and the fast pointer moves two steps at a time.

If the list has a cycle, the fast pointer will eventually meet the slow pointer. If the fast pointer reaches the end of the list, there is no cycle.

### Example

Let's say the list looks like this:

3 -> 2 -> 0 -> -4

The last node points back to the node with value 2.

Step 1:
Slow is at 2.
Fast is at 0.

Step 2:
Slow is at 0.
Fast is at 2.

Step 3:
Slow is at -4.
Fast is at -4.

Both pointers meet, so the method returns true.

If the list has no cycle, the fast pointer will eventually reach null, and the method returns false.

## 3. Time Complexity

**Time Complexity: O(n)**

The slow pointer moves one step and the fast pointer moves two steps in each iteration. Each pointer moves through the list a limited number of times, so the time complexity is O(n).

**Space Complexity: O(1)**

I only use two pointers, slow and fast. I do not need an additional list or set to store visited nodes.

## 4. Reflection / Improvement

This solution is already efficient in terms of time and additional memory.

Another approach is to store visited nodes in a HashSet. That approach is also O(n) in time, but it needs O(n) additional space.

My solution is better in terms of additional memory because it uses only O(1) space.
