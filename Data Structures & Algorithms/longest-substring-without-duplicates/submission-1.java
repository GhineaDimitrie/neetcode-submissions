class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen=new HashSet<>();
        int l=0;
        int r=0;
        int maxLength=0;
        while(r<s.length())
        {
            while(seen.contains(s.charAt(r)))
            {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }

        return maxLength;
       

        
    }
}
