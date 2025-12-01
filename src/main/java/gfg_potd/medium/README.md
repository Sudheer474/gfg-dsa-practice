#Problem-24/11/25: Second Best Minimum Spanning Tree
  ->Given an undirected graph with **V** vertices and **E** weighted edges, your task is to compute the weight of the **second best Minimum Spanning Tree (MST)**.  
  ->A second best MST is defined as the minimum-weight spanning tree whose weight is **strictly greater** than the weight of the MST.  
  ->If no such spanning tree exists, return **-1**.
-Solution: [MinSpanTree2B.java](./MinSpanTree2B.java)
-Examples:
    1. Input:  
       V = 5, E = 7  
       Edges = [[0, 1, 4], [0, 2, 3], [1, 2, 1], [1, 3, 5], [2, 4, 10], [2, 3, 7], [3, 4, 2]]  
       Output: **12**
-Approach:  
  ->First compute the **MST using Kruskal’s algorithm**, storing all edges included in the MST.  
  ->To find the second-best MST, try **removing each MST edge one by one**, and rebuild a new spanning tree:
    -Reinsert all other MST edges.
    -Add the **minimum-weight non-MST edge** that reconnects the graph.  
      ->Keep track of all valid spanning tree weights that are **greater than the MST weight**, and take the smallest among them.  
      ->If none of the rebuilt trees exceed the MST weight, return **-1**.
-Time Complexity: **O(E log E + V * E)**
-Space Complexity: **O(E + V)**

================================================================================================================================
#Problem-25/11/25: XOR of All Subarray XOR Values
    ->You are given an integer array arr[]. The value of a subarray is defined as the bitwise XOR of all elements in that subarray.  
    ->Your task is to compute the bitwise XOR of the values of **all possible subarrays** of arr[].
-Solution: [SubArrayXOR.java](./SubArrayXOR.java)
-Examples:
    1. Input:  [1, 2, 3]  
       Output: 2
-Approach:  
    ->Observe that each element arr[i] contributes to the final XOR only if it appears in an odd number of subarrays.  
    ->The frequency of arr[i] in all subarray XORs is: **(i + 1) * (n – i)**.  
    ->If this frequency is odd, XOR it into the answer.  
    ->This avoids generating all subarrays and computes the result efficiently.
-Time Complexity: **O(n)**
-Space Complexity: **O(1)**

================================================================================================================================
#Problem-26/11/25: AND In Range
    ->You are given two integers l and r. Find the result after applying the series of Bitwise AND ( & ) operation on every natural 
      number between the range l to r (including both).
-Solution: AndInRange.java
-Example:
    1.Input: l = 8, r = 13
      Output: 8
    2.Input: l = 2, r = 3
      Output: 2
-Approach:
    ->The key idea is to find the common prefix (same highest bits) of numbers between l and r.
    ->If the highest set bit of l and r is the same, we include that bit in the answer and subtract it from both l and r, then continue checking lower bits.
    ->If at any point the highest bits differ, further AND operations will zero out remaining bits.
    ->Compute highest set bit (log₂) of l and r.
    ->If both have the same highest bit, add that bit to the result and remove it from both numbers.
    ->Repeat until the highest bits differ.
    ->Return the accumulated result.
-Time Complexity: O(log n)
-Space Complexity: O(1)

