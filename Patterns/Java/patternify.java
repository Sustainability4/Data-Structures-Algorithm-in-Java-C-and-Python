/*
Problem Statement
You are given an integer ‘N’. Your task is to print a pattern with the following description
The pattern will consist of ‘N’ lines.

For 1 <= ‘i’ <= ‘N’ ‘i’th line consists of a string of ‘N’  + 1 - ‘i’  ‘*’ characters.
For example:
If ‘N’ is 5 then the pattern will be.

*****
****
***
**
*
Input Format
The first line of input contains an integer 'T' representing the number of test cases.

Then each test case contains a single integer ‘N’ denoting the size of the pattern.
Output Format:
The output for each test case will be 'N' strings denoting the pattern printed for the given ‘N’ number of rows.

The output of each test case will be printed in a separate line.
Constraints:
1 <= T <= 5
1 <= N <= 500

Where ‘T’ is the number of test cases, ‘N’  is the size of the pattern.
Note:
You do not need to print anything, it has already been taken care of. Just implement the given function.
Sample Input 1:
2
5
3
Sample Output 1:
*****
****
***
**
*
***
**
*
Explanation of Sample Input 1:
Test Case 1:

Given ‘N’ = 5
We will print the pattern as description first line will contain a string of 5 ‘*’, the second line will contain a string of 4 ‘*’, the third line will contain 3 ‘*’, the fourth line will contain 2 ‘*’ and the fifth line will contain 1 ’*’.

Test Case 2:

Given ‘N’ = 3
For 1 <= ‘i’ <= 3  , ‘i’th line contains 4 - ’i’, ‘*’ characters.
Sample Input 2:
2
1
2
Sample Output 2:
*
**
* 
Explanation of Sample Input 2:
Test Case 1:

Given ‘N' = 1
There will be only 1 line and that will contain a single ‘*’.

Test Case 2:

Given ‘N’ = 2
First-line will contain 2 ‘*’ while the second line will contain 1 ‘*’ as per description.
*/


public class Solution {
	public static String[] printPatt(int n) {
		// Defining String
		String answer[] = new String[n];
        // Lets get the index of this string 
        int index = 0;
        
        // Lets get a string 
        String str = "";
        
        for(int i = 0; i<n ; i++){
            str += ("*");
        }
        
        for (int i = 1; i <= n; i++) {

			// Append current string to answer
			answer[index++] = str;

			// Decrese length of string by 1
			str = str.substring(0, str.length() - 1);
		}
        
        return answer;
	}

}



  
