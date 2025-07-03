class Solution {
    public int longestKSubstr(String s, int k) 
    {
        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        int tail = 0, maxLen = -1;
        
        for(int head = 0; head < n; head++)
        {
            freq.put(s.charAt(head), freq.getOrDefault(s.charAt(head), 0) + 1);
            
            while(freq.size() > k)
            {
                char val = s.charAt(tail);
                
                freq.put(val, freq.get(val)-1);
                if(freq.get(val) == 0)  freq.remove(val);
                
                tail++;
            }
            if(freq.size() == k)
                maxLen = Math.max(head-tail+1, maxLen);
        }
        
        return maxLen;
    }
}
