# Invert Binary Tree

## 1. Problem
Reverse a binary tree by switching the left and right child of every node.

## 2. Approach
I used recursion. For each node, I first check whether it is empty. If it is not, I swap its left and right children and repeat the operation for the remaining nodes.

### Example

```text
Before:       After:

    4             4
   / \\           / \\
  2   7         7   2
 / \\           / \\
1   3         3   1
```

Result: The tree is inverted.

## 3. Complexity Analysis

**Time Complexity: O(n)**

The algorithm visits every node once.

**Space Complexity: O(h)**

Recursive calls use memory according to the height of the tree.

## 4. Reflection / Improvement

A Queue could be used to swap children one level at a time. The time complexity would still be O(n).
