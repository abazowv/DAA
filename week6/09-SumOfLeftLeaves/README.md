# Sum of Left Leaves

## 1. Problem
Calculate the total value of all leaf nodes that are located on the left side of their parent.

## 2. Approach
I solved the task recursively. I check whether the left child is a leaf node. If it is, I add its value to the total. Then I continue checking the remaining nodes.

### Example

```text
      3
     / \\
    9   20
       /  \\
      15   7
```

The left leaves are 9 and 15.

Result: `24`

## 3. Complexity Analysis

**Time Complexity: O(n)**

Every node is checked once.

**Space Complexity: O(h)**

The recursion stack takes memory based on the tree height.

## 4. Reflection / Improvement

The solution could also be written iteratively with a Stack, without changing the O(n) time complexity.
