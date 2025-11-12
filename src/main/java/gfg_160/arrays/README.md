#Problem1️⃣: Given an array of integers, find the second largest element.
-Solution: [SecondLargest.java](./SecondLargest.java)
-Example:
    Input:  [12, 35, 1, 10, 34, 1]
    Output: 34
-Approach: Iterate through the array once, maintaining two variables -> one for the largest and another for the second largest element.
-Time Complexity: O(n)
-Space Complexity: O(1)

================================================================================================================================
#Problem2️⃣: Given an integer array, move all zeros to the end while maintaining the relative order of non-zero elements.
-Solution: [MoveAllZeros.java](./MoveAllZeros.java)
-Example:
    Input:  [0, 1, 0, 3, 12]
    Output: [1, 3, 12, 0, 0]
-Approach: Use a two-pointer technique.
->Traverse the array and maintain a pointer j for the position of the next non-zero element.
->Whenever a non-zero element is found, swap it with the element at index j and increment j.
-Time Complexity: O(n)
-Space Complexity: O(1)

================================================================================================================================
#Problem3️⃣: Reverse the elements of an integer array in place, without using extra space.
-Solution: [ReverseArray.java](./ReverseArray.java)
-Example:
    Input:  [1, 2, 3, 4, 5]
    Output: [5, 4, 3, 2, 1]
-Approach: Use two pointers —> one starting from the beginning (i) and one from the end (j).
Swap the elements at these indices and move both pointers toward the center until they meet.
-Time Complexity: O(n)
-Space Complexity: O(1)

================================================================================================================================
#Problem4️⃣: Rotate the elements of an integer array by d positions in counter-clockwise direction, without using extra space.
    ->Note: Consider the array as circular.
-Solution: [RotateArray.java](./RotateArray.java)
-Example:
    Input: arr = [1, 2, 3, 4, 5, 6, 7], d = 2
    Output: [3, 4, 5, 6, 7, 1, 2]
-Approach: Use the Reversal Algorithm.
    ->Reverse the first d elements.
    ->Reverse the remaining n - d elements.
    ->Reverse the entire array.
This effectively rotates the array in-place without using extra space.
-Time Complexity: O(n)
-Space Complexity: O(1)

================================================================================================================================