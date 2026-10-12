# Remove Linked List Elements

## 1. Problem

The task is to remove all nodes from a linked list that have a value equal to `val`.

For example:

Input: `1 -> 2 -> 6 -> 3 -> 6`, `val = 6`

Output: `1 -> 2 -> 3`

## 2. Approach

I create a dummy node before the head of the list. This makes it easier to remove the first node if its value matches `val`.

Then I use a pointer called `current`.

I check the next node of `current`. If its value equals `val`, I skip that node by changing `current.next`.

If the value is different, I move `current` forward.

After checking all nodes, I return `dummy.next`, which points to the new beginning of the list.

### Example

Input: `1 -> 2 -> 6 -> 3 -> 6`, `val = 6`

1. I create a dummy node that points to the first node.
2. The value `1` is not equal to `6`, so I move forward.
3. The value `2` is not equal to `6`, so I move forward again.
4. The next value is `6`, so I remove that node.
5. I check `3` and move forward.
6. The last value is `6`, so I remove it too.

Output: `1 -> 2 -> 3`

### Challenges and Testing

The main challenge was handling the case where the first node must be removed. The dummy node makes this easier because I can use the same logic for the first node and the other nodes.

I would test an empty list, a list where every value equals `val`, a list where no value equals `val`, and a list where the first and last nodes must be removed.

## 3. Time Complexity

**Time Complexity: O(n)**

I check each node once. Each comparison and pointer update takes constant time, so the total time complexity is O(n).

**Space Complexity: O(1)**

I use one dummy node and one pointer. The additional memory does not grow with the size of the list.

## 4. Reflection / Improvement

My solution is already efficient because I need to check every node to know whether it should be removed.

It uses O(n) time and O(1) extra space. The dummy node also makes the code easier to manage when the head needs to change.