# Merge Two Binary Trees

## 1. Problem
Combine two binary trees into a single tree. When nodes occupy the same position in both trees, their values are summed.

## 2. Approach
I used recursion. First, I check whether both nodes are empty. Then I calculate the sum of their values; if one node is missing, I take the value from the node that exists.

After handling the current nodes, I recursively merge their left and right children.

### Example

```text
Tree 1:       Tree 2:

   1             2
  / \\           / \\
 3   2         1   3

Result:

     3
    / \\
   4   5
```

## 3. Complexity Analysis

**Time Complexity: O(n + m)**

The algorithm processes nodes from both trees.

**Space Complexity: O(n + m)**

Recursive calls require memory. In the worst case, the recursion depth may reach O(n + m).

## 4. Reflection / Improvement

An iterative version using a Queue is also possible. Its time complexity would remain O(n + m).
