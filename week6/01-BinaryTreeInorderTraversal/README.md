# Binary Tree Inorder Traversal

## 1. Problem
The goal is to visit every node in a binary tree in this order: Left → Root → Right.

## 2. Approach
I solved the problem using a Stack.

I move as far left as possible, putting each visited node onto the Stack. Next, I remove a node from the Stack, add its value to the result, and continue with its right child.

This process continues until every node has been visited.

### Example
For this tree:

```text
    2
   / \\
  1   3
```

Steps:
1. Visit node 1.
2. Visit node 2.
3. Visit node 3.

Result: `[1, 2, 3]`

## 3. Complexity Analysis

**Time Complexity: O(n)**

Each node is visited exactly once.

**Space Complexity: O(n)**

The Stack may store up to all nodes.

## 4. Reflection / Improvement

Recursion is another possible solution. Its time complexity is also O(n).
