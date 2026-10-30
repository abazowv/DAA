# Minimum Depth of Binary Tree

## 1. Problem
Determine the shortest path from the root node to any leaf in a binary tree.

## 2. Approach
I solved it recursively. First, I handle the case of an empty tree. Then I examine the left and right children to find the shortest route to a leaf.

When one child is missing, I follow the existing child instead.

### Example

```text
    1
   / \\
  2   3
     /
    4
```

The shortest path is 1 → 2.

Result: `2`

## 3. Complexity Analysis

**Time Complexity: O(n)**

In the worst case, every node may need to be visited.

**Space Complexity: O(h)**

The recursion stack requires memory based on the tree height.

## 4. Reflection / Improvement

BFS could also be used to stop at the first leaf. In some cases, this avoids visiting the entire tree.
