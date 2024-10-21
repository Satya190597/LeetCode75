# 11. Container With Most Water
### Question description.
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.<br/>
**Notice:** that you may not slant the container.
#### Example 1
```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
```
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
#### Example 2
```
Input: height = [1,1]
Output: 1
```
### Topic
Two Pointers
### Solution Summary
The solution uses the two-pointer technique to efficiently find the maximum area of water that can be trapped between two vertical lines represented by an array of heights.
- Initialize Two Pointers: Set one pointer (left) at the start (index 0) and another (right) at the end of the array.
- Calculate Area: In a loop, compute the area formed between the lines at the left and right pointers:
  - Width: The distance between the two pointers.
  - Height: The shorter of the two heights at the pointers.
  - Area = Width * Height
- Update Maximum Area: Compare the calculated area with the current maximum area and update it if the new area is larger.
- Move Pointers:
  - If the height at the left pointer is less than the height at the right, increment the left pointer to potentially find a taller line.
  - Otherwise, decrement the right pointer.
- Repeat: Continue this process until the two pointers meet.
- Return Result: After the loop, return the maximum area found.
### Time Complexity
O(N) - It will examine each element only once.
### Sapce Complexity
O(1) - as it uses only a fixed amount of extra space (the two pointers) and a variable to keep track of maximum area.
