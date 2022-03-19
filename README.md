# Number_Of_Pairs
Pairs

There are ‘N’ items being sold in a shop, with ‘Cost[i]’ representing how much the ith item is being sold for. The shopkeeper initially bought all the items from the same wholesale dealer, paying ‘i’ units for currency for the ith item. In other words, he paid 1 unit of currency for the first item, 2 for the second item, and so on.
Your task is to calculate the number of unordered pairs of items (i,j) such that the profit the shopkeeper earns on item ‘i’ and ‘j’ is the same (Note that i!=j).
For example:
If the selling prices are [4,6], the shopkeeper makes a profit of 4-1=3 on the first item and a profit of 6-2=4 on the second. In this scenario, there are no pairs of items with the same profit.
Input Format:
The first line contains 'T', denoting the number of test cases.
For each Test :
The first line contains a single integer ‘N’, representing the number of elements.
The second line contains an array ‘Cost’ of ‘N’ space-separated integers, representing the selling price of the items.
Output Format:
For each test case, print one integer, the number of pairs satisfying the condition.
Note:
You are not required to print the expected output. It has already been taken care of. Just implement the function.
Constraints -
1 <= ‘T’  <= 10
1 <= ‘N’ <= 10^5
1 <= ‘Cost[i]’ <= 10^9
Note: It is guaranteed that the sum of N across all test cases will be at most 10^5.
Time Limit: 1 sec
Sample Input 1:
2
4
2 3 4 1
2
2 7
Sample Output 1
3
0
Explanation For Sample Input 1:
For test case 1:
    The shopkeeper earns a profit of 1 on the first 3 items and -3 on the last item. Hence, the unordered pairs of items are (1,2), (1,3) and (2,3).

For test case 2 :
    The shopkeeper earns a profit of 1 on the first item and 5 on the second. There are no pairs with the same profit.
Sample Input 2:
1
3
9 2 11
Sample Output 2:
1
