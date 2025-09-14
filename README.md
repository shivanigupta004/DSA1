# KadaneMaxSubarray\nJava implementation of Kadane's Algorithm to efficiently find the maximum subarray sum.
# Stock Profit Calculator 📈

This Java program calculates the maximum profit from a single buy-sell transaction based on daily stock prices.

## Features
- Efficient O(n) time complexity
- Simple and clean logic
- Easy to integrate into larger financial tools

# 🔍 Duplicate Number Checker

This Java program checks whether an array contains **at least one duplicate** number. It uses sorting to simplify the comparison process.

## 💡 How It Works

1. The array is sorted using `Arrays.sort()`.
2. A loop checks adjacent elements for equality.
3. If a duplicate is found, the method returns `true`; otherwise, `false`.

# 🔄 Array Left Rotation in Java

This project demonstrates two efficient methods to perform **left rotation** on an array in Java. Whether you're optimizing for space or speed, both approaches are clean, readable, and ready for action.

---

## ✨ Approaches Implemented

### 1️⃣ Temporary Array Method
- **Time Complexity:** O(n)
- **Space Complexity:** O(k)
- **Logic:**  
  - Store first `k` elements in a temporary array  
  - Shift remaining elements to the left  
  - Append the stored elements to the end

### 2️⃣ Reversal Algorithm
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Logic:**  
  - Reverse the entire array
  - Reverse the first `length-k` elements  
  - Reverse the last `k` elements  

---
## 📌 Sample Input
```java
int[] arr = {1, 2, 3, 4, 5, 6, 7};
int k = 3;
### 📌 Sample Output
-1
5 6 7 1 2 3 4

## 🔄 Rotate and Search in Array

This Java program rotates an array to the left by `k` positions and performs a binary search for a target element.

### 💡 Features
- In-place array rotation using reversal
- Efficient binary search
- Time Complexity: O(n) for rotation, O(log n) for search
- Space Complexity: O(1)

### 📌 Sample Output
-1
5 6 7 1 2 3 4

🔁 Bubble Sort (Ascending)
Method: bubblesorting(int[] arr)
Logic: Repeatedly compares adjacent elements and swaps them if they’re in the wrong order.
Example:
Input: [4, 2, 5, 1, 3]
Output: [1, 2, 3, 4, 5]

🔁 Bubble Sort (Descending)
Method: bubblesortingInDescending(int[] arr)
Logic: Repeatedly compares adjacent elements and swaps them if the left is smaller than the right.
Example:
Input: [4, 2, 5, 1, 3]
Output: [5, 4, 3, 2, 1]

📌 Selection Sort (Ascending)
Method: selectionsorting(int[] arr)
Logic: Finds the minimum element in the unsorted part and places it at the beginning.
Example:
Input: [4, 2, 5, 1, 3]
Output: [1, 2, 3, 4, 5]

📌 Selection Sort (Descending)
Method: selectionsortingInDescending(int[] arr)
Logic: Finds the maximum element in the unsorted part and places it at the beginning.
Example:
Input: [4, 2, 5, 1, 3]
Output: [5, 4, 3, 2, 1]


