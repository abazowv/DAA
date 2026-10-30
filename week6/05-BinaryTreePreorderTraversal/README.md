# Binary Tree Preorder Traversal

## 1. Problem
Visit every node in a binary tree using preorder traversal: Root → Left → Right.

## 2. Approach
I used recursion. I add the current node's value to the result first, then process its left child followed by its right child.

### Example

```text
    1
   / \\
  2   3
```

Steps:
1. Visit node 1.
2. Visit node 2.
3. Visit node 3.

Result: `[1, 2, 3]`

## 3. Complexity Analysis

**Time Complexity: O(n)**

Each node is visited once.

**Space Complexity: O(h)**

The recursive call stack uses space based on the tree height.

## 4. Reflection / Improvement

A Stack can be used to implement the traversal iteratively. The time complexity remains O(n).
