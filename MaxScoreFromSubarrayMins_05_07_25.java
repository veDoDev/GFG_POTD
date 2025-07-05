class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            int sum = arr[i]+arr[i+1];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}


// thought : 
// whenever we sum from a subarray of length greater than 2 ;
// say [1,2,3] , here we are searching for top 2 min elements which are, in this case, 1,2 
// so it means the sum : 1+2 will be less than 1+3 and 2+3 and 
// always there is going to be a number which is aside the greatest number in the subarray 
//   and it will form a subarrayw with the number which is the greatest which will be of length 2 
//   and hence we will have the greatest sum to be that, no matter what is the sum in the bigger subarray 
//   becuase it is made from the two small numbers.
// Therefore, the answer will always be a subarray of length 2
