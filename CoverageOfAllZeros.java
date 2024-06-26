//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.findCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findCoverage(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        
        for(int r = 0; r < rows; r++)
        {
            for(int c= 0; c < col; c++)
            {
                if (matrix[r][c] == 0)  // we haves to check only on ZEROs
                {
                    // iff c is not the rightmost element od the current row, check for 1s on the right side
                    if ((c < col-1)  && (matrix[r][c+1] == 1)) count++;// iff c is not the rightmoat element check for 1s on right 
                    if ((c > 0)    && (matrix[r][c-1] == 1)) count++;// iff c is not the leftmost element check for 1s on left side
                    if ((r < rows-1) && (matrix[r+1][c] == 1)) count++;// iff r is not the mostbottom element check for 1s in the bottom
                    if ((r > 0)    && (matrix[r-1][c] == 1)) count++;// iff r is not the topmost element check for 1s in the top
                }
                
            }
        }
        return count;
    }
}
