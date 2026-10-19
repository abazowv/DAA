
# Sort List

## 1. Problem

The task is to sort a linked list in ascending order.

For example:

Input: 4 -> 2 -> 1 -> 3

Output: 1 -> 2 -> 3 -> 4

## 2. Approach

I used Merge Sort because it works well with linked lists.

First, I find the middle of the list using two pointers: slow and fast. The slow pointer moves one step, while the fast pointer moves two steps.

When I find the middle, I split the list into two parts. Then I sort both parts recursively and merge them in the correct order.

For example:

4 -> 2 -> 1 -> 3

I split the list into:

4 -> 2

1 -> 3

After sorting the parts, I get:

2 -> 4

1 -> 3

Then I merge them and get:

1 -> 2 -> 3 -> 4

The main difficulty was finding the middle of the list and separating it into two parts. I used slow and fast pointers to solve this problem.

## 3. Time Complexity

Time Complexity: O(n log n)

The list is divided into smaller parts, and each level processes all nodes during merging. There are about log n levels, so the total time complexity is O(n log n).

## 4. Space Complexity

Space Complexity: O(log n)

I don't create new arrays or duplicate nodes during merging. However, the recursive calls use additional stack memory. The recursion depth is O(log n).

## 5. Reflection / Improvement

The solution works efficiently. One possible improvement is to use an iterative version of Merge Sort instead of recursion. This could reduce the additional space complexity to O(1).
