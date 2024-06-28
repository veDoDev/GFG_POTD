//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution {
    public String pattern(int[][] arr) {
        int n = arr.length;
        int check = 0;
        for(int i = 0; i<n; i++)
        {
            //check for rows:-
            for(int r = 0; r < (n/2); r++)
                if(arr[i][r] == arr[i][n-r-1])    check++;
            
            //if the condition (arr[i][r] == arr[i][n-r]) is true n/2 times, then the row is a palindrome if it is not, set check = 0
            if (check == (n/2))
                return (i+" R");
                
            else
                check = 0;
            
            
        }
        for(int i = 0; i<n; i++)
        {
            //check for columns:-
            for(int c = 0; c< (n/2); c++)
                if(arr[c][i] == arr[n-c-1][i])    check++;
            
            //if the condition (arr[c][i] == arr[n-c][i]) is true n/2 time, the the column is a palindrome if it is not, set check = 0
            if (check == (n/2))
                return (i+" C");
            else
                check = 0;
            
            
        }
        return "-1";
    }
}
