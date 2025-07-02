class Solution {
    public int totalElements(int[] arr) 
    {
        int n = arr.length;
        if (n <= 2) return n;

        Map<Integer, Integer> freq = new HashMap<>();
        int tail = 0, maxLen = 0;

        for (int head = 0; head < n; head++) 
        {
            
            freq.put(arr[head], freq.getOrDefault(arr[head], 0) + 1);
            
            while (freq.size() > 2) 
            {
                int val = arr[tail];
                freq.put(val, freq.get(val) - 1);
                if (freq.get(val) == 0) freq.remove(val);
                tail++;
            }
            
            maxLen = Math.max(maxLen, head - tail + 1);
        }
        return maxLen;
    }

}
