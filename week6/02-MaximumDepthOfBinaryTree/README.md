# Maximum Depth of Binary Tree

## 1. Problem
Calculate the maximum depth of a binary tree, meaning the longest path from the root to a leaf.

## 2. Approach
I used a recursive solution. I first handle an empty node, then calculate the depths of the left and right subtrees. The larger depth is returned with 1 added for the current node.

### Example

```text
    1
   / \\
  2   3
 /
4
```

The longest path is 1 → 2 → 4.

Result: `3`

## 3. Complexity Analysis

**Time Complexity: O(n)**

Every node is processed once.

**Space Complexity: O(h)**

The recursive calls use memory according to the height of the tree.

## 4. Reflection / Improvement

The same problem can be solved with BFS using a Queue, while keeping O(n) time complexity.
