# Binary Tree Paths

## 1. Problem
Return every path that goes from the root of a binary tree to one of its leaves.

## 2. Approach
I used recursion to build the paths. Starting at the root, I add each node to the current path. Once a leaf is reached, I store that complete path in the result list.

### Example

```text
    1
   / \\
  2   3
   \\
    5
```

Paths:
- 1 → 2 → 5
- 1 → 3

Result: `["1->2->5", "1->3"]`

## 3. Complexity Analysis

**Time Complexity: O(n * h)**

We visit each node and construct path strings, where h represents the tree height.

**Space Complexity: O(n * h)**

The result list stores all generated paths.

## 4. Reflection / Improvement

Using StringBuilder could make path construction more efficient by avoiding repeated string creation.
