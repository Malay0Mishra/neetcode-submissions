class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character , Integer> count = new HashMap<>();
        int maxFreq = 0;
        int left = 0; 
        int result = 0;
       
        for(int right = 0; right < s.length(); right++){
             int windowSize = right - left + 1;
            char ch = s.charAt(right);
            count.put(ch , count.getOrDefault(ch , 0) + 1);
            maxFreq = Math.max(maxFreq, count.get(ch));

            if (windowSize - maxFreq > k){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;

            }
            else{
                result = Math.max(result , windowSize);
                
            }
        }
        return result;
        }
    }

