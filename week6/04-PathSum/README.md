# Path Sum

## 1. Problem
Determine whether the tree contains a root-to-leaf path whose node values add up to the given target.

## 2. Approach
I used recursion. At each step, I subtract the current node's value from the target and continue to either the left or right child.

When a leaf is reached, I check whether its value matches the remaining sum. If it does, the result is true.

### Example

```text
    5
   / \\
  4   8
 /   / \\
11  13  4
```

Target sum: `9`

Path: 5 → 4

Result: `true`

## 3. Complexity Analysis

**Time Complexity: O(n)**

The algorithm may need to check every node.

**Space Complexity: O(h)**

Recursive calls take memory depending on the height of the tree.

## 4. Reflection / Improvement

An iterative solution with a Stack could replace recursion. Its time complexity would remain O(n).
