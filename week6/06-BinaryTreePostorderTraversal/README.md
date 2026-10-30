# Binary Tree Postorder Traversal

## 1. Problem
Process all nodes of a binary tree in postorder: Left → Right → Root.

## 2. Approach
I implemented the solution with recursion. I first traverse the left subtree, then the right subtree, and finally add the current node to the result.

### Example

```text
    1
   / \\
  2   3
```

Steps:
1. Visit node 2.
2. Visit node 3.
3. Visit node 1.

Result: `[2, 3, 1]`

## 3. Complexity Analysis

**Time Complexity: O(n)**

All nodes are visited exactly once.

**Space Complexity: O(h)**

The recursion stack requires memory proportional to the tree height.

## 4. Reflection / Improvement

This traversal can also be implemented with a Stack instead of recursion, with the same O(n) time complexity.
