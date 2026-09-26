1. Problem

The method is given an array of integers and an integer target. I need to return the index of the number which is equal to the target. If there is no such number in the array, the method should return -1.

2. Approach

My first solution was to compare each element of the array using a for loop from 0 to nums.length. This solution has O(n) complexity because in the worst case we need to check every element.

Then I decided to use binary search because it allows me to reduce the number of elements that need to be checked by half after each iteration.

I use three variables: left, right and mid. In each iteration I calculate the middle position. If the element at mid is smaller than the target, I move left to mid + 1. If the element is bigger than the target, I move right to mid - 1. This way I can ignore half of the array each time.

If I find the target, I return its index. If the target is not found, the method returns -1.

3. Time Complexity

Time Complexity: O(log n)

In every iteration we remove about half of the remaining elements from the search. Because of this, the number of iterations grows logarithmically with the size of the array. Therefore, the time complexity is O(log n).

4. Space Complexity

Space Complexity: O(1)

I don't create a copy of the array or use any additional data structures. I only use the left, right and mid variables, so the amount of additional memory stays constant.

5. Reflection / Improvement

I don't think there is a need for a better solution because binary search already has O(log n) time complexity and O(1) space complexity.

Java also has the Arrays.binarySearch() method, which can solve this problem, but I wanted to implement binary search myself to understand how it works.