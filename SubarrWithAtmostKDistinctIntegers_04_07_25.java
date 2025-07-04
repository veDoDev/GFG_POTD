class Solution {
    public int countAtMostK(int arr[], int k) 
    {
        int n = arr.length, count = 0, head = 0, tail = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        k = Math.min(n, k);
        
        for(head = 0; head < n; head++)
        {
            freq.put(arr[head], freq.getOrDefault(arr[head], 0) + 1);
            
            if(freq.size() <= k)   count+= head - tail + 1;
            else
            {
                while((tail < head) && (freq.size() > k))
                {
                    freq.put(arr[tail], freq.get(arr[tail]) - 1);
                    if(freq.get(arr[tail]) < 1)
                        freq.remove(arr[tail]);
                    tail++;
                }
                count += head - tail + 1;   
                
            }
            
        }
       
        return count;
    }
}
