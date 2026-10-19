
# Sort an Array

## 1. Problem

The task is to sort an array of integers in ascending order.

For example, if the input is [5, 2, 3, 1], the result should be [1, 2, 3, 5].

## 2. Approach

I used Merge Sort to solve this problem. First, I divide the array into two parts. Then I continue dividing each part until every part contains only one element.

After that, I merge the parts back together in the correct order by comparing their elements.

For example:

[5, 2, 3, 1]

First, I divide the array into [5, 2] and [3, 1].

Then I divide them into [5], [2], [3] and [1].

Next, I merge them into [2, 5] and [1, 3].

Finally, I merge both parts and get [1, 2, 3, 5].

One difficulty was understanding how to merge two arrays without missing any elements. I solved this by using separate indexes for both arrays.

## 3. Time Complexity

Time Complexity: O(n log n)

The array is divided into halves, so there are about log n levels. At each level, all elements are processed during merging. Because of this, the total time complexity is O(n log n).

## 4. Space Complexity

Space Complexity: O(n)

I create additional arrays to divide and merge the elements. The extra memory depends on the size of the input array.

## 5. Reflection / Improvement

Merge Sort is already an efficient solution for this problem. I could improve the code by reusing a temporary array instead of creating new arrays during every recursive call.
