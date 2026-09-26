1.Problem

The method receives an integer n which shows the total number of versions. I need to find and return the first bad version using the provided isBadVersion(version) API.

2.Approach

The easiest way would be to check every version starting from 1, but this would have O(n) time complexity and can be slow if n is very large. I decided to use binary search because it allows me to reduce the search range by half after every step.

I use two variables: left, which starts from 1, and right, which starts from n. While left is less than right, I calculate the middle position using left + (right - left) / 2. If isBadVersion(mid) returns true, the first bad version can be mid or an earlier version, so I set right = mid. If the version is good, the first bad version must be after mid, so I set left = mid + 1.

When left and right become equal, the search is finished and left contains the first bad version.

3.Time Complexity

Time Complexity: O(log n)

On every iteration, the search range becomes about two times smaller. Because of this, we only need a logarithmic number of checks to find the first bad version. Therefore, the time complexity is O(log n).

4.Space Complexity

Space Complexity: O(1)

The algorithm only uses three variables: left, right and mid. I don't create any additional arrays or other data structures. Because of this, the extra memory used stays constant and the space complexity is O(1).

5.Reflection / Improvement

I don't see a better solution because binary search already gives O(log n) time complexity and O(1) space complexity. I also used left + (right - left) / 2 instead of (left + right) / 2 because it helps avoid possible integer overflow when n is very large.