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
#Problem5️⃣: Next Permutation of an Integer Array
    ->Given an array representing a permutation, rearrange it into the lexicographically next greater permutation.
    ->If no such permutation exists, convert it to the lowest possible order (i.e., sorted ascending).
-Solution: [NextPermutation.java](./NextPermutation.java)
-Example:
    1.Input: arr = [2, 4, 1, 7, 5, 0]
      Output: [2, 4, 5, 0, 1, 7]
    2.Input: arr = [3, 2, 1]
      Output: [1, 2, 3]
-Approach:
    ->Traverse from right to find the first index pivot where arr[i] < arr[i+1].
    ->If no pivot exists, reverse the entire array (because it's the last permutation).
    ->Otherwise, from the right, find the smallest element greater than arr[pivot] and swap.
    ->Finally, reverse the subarray from pivot+1 to end to form the next permutation.
This ensures the next lexicographically greater permutation is generated in-place.
-Time Complexity: O(n)
-Space Complexity: O(1)

================================================================================================================================
#Problem6️⃣: Find All Elements Occurring More Than ⌊n/3⌋ Times
    ->Given an array of integers, return all elements that appear more than floor(n/3) times.
    ->The result must be sorted.
-Solution: [MajorityElements.java](./MajorityElements.java)
-Examples:
    1.Input:  [2, 2, 3, 1, 3, 2, 1, 1]
      Output: [1, 2]
    2.Input:  [-5, 3, -5]
      Output: [-5]
-Approach:
    ->Use a HashMap to store element frequencies, then iterate through the map to collect all elements whose count exceeds n/3.
    -?Finally, sort the result.
-Time Complexity: O(n)
-Space Complexity: O(n)

================================================================================================================================
