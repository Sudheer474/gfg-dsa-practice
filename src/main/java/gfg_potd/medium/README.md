#Problem-25/11/25: XOR of All Subarray XOR Values
  ->You are given an integer array arr[]. The value of a subarray is defined as the bitwise XOR of all elements in that subarray.  
  ->Your task is to compute the bitwise XOR of the values of all possible subarrays of arr[].
-Solution: [SubArrayXOR.java](./SubArrayXOR.java)
-Examples:
    1. Input:  [1, 2, 3]  
       Output: 2
-Approach:  
  -> Observe that each element arr[i] contributes to the final XOR only if it appears in an odd number of subarrays.  
  -> The frequency of arr[i] in all subarray XORs is: **(i + 1) * (n – i)**.  
  -> If this frequency is odd, XOR it into the answer.  
  -> This avoids generating all subarrays and computes the result efficiently.
-Time Complexity: O(n)
-Space Complexity: O(1)