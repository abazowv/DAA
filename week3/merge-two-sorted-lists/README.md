
# Merge Two Sorted Lists

## 1. Problem

In this task, I need to merge two sorted linked lists into one sorted list.

For example:

List 1: 1 -> 2 -> 4
List 2: 1 -> 3 -> 4

Result: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## 2. Approach

I compare the first elements of both lists and choose the smaller one. I add it to the result and move to the next element in that list.

I use a dummy node to make it easier to build the result. I repeat this process until one of the lists becomes empty. Then I add the remaining elements from the other list.

### Example

At the beginning:

List 1: 1 -> 2 -> 4
List 2: 1 -> 3 -> 4

Step 1: I compare 1 and 1. I choose 1 from the first list.

Result: 1

Step 2: I compare 2 and 1. I choose 1 from the second list.

Result: 1 -> 1

Step 3: I compare 2 and 3. I choose 2.

Result: 1 -> 1 -> 2

Step 4: I compare 4 and 3. I choose 3.

Result: 1 -> 1 -> 2 -> 3

Step 5: I compare 4 and 4. I choose 4 from the first list.

Result: 1 -> 1 -> 2 -> 3 -> 4

Step 6: The first list is empty, so I add the last 4 from the second list.

Final result: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## 3. Time Complexity

**Time Complexity: O(n + m)**

Here, n is the number of elements in the first list and m is the number of elements in the second list.

I visit each element at most once, so the time depends on the total number of elements in both lists.

**Space Complexity: O(1)**

I only use a few variables and a dummy node. I do not create a new list to store all the elements.

## 4. Reflection / Improvement

I think this solution is already efficient because every element needs to be checked during the merge.

The time complexity is O(n + m), and it cannot be improved to a better general time complexity for this task.

I could also use recursion, but it would not make the algorithm faster and would use additional memory for function calls.
