# 392. Is Subsequence
### Question description.
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some 
(can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
#### Example 1
```
Input: s = "abc", t = "ahbgdc"
Output: true
```
#### Example 2
```
Input: s = "axc", t = "ahbgdc"
Output: false
```
### Topic
Two Pointers
### Solution Summary
The `isSubsequence` method checks if string `s` is a subsequence of string `t`. 
It uses two pointers to traverse both strings: if characters at both pointers match, it increments both; 
if they don't, it only increments the pointer for `t`. After traversing, if the pointer for `s` has reached its length, 
it returns `true`, indicating that all characters of `s` were found in `t` in order. Otherwise, it returns `false`.
### Time Complexity
O(N) : Where n is the length of the longest string.
### Space Complexity
O(1) : as it uses only a fixed amount of extra space (the two pointers).
