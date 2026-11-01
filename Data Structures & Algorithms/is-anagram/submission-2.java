class Solution {
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())
            return false;

        int[] caract=new int[26];
        for(char c:s.toCharArray())
        {
            int index=c-'a';
            caract[index]++;
        }

        for(char c:t.toCharArray())
        {
            int index=c-'a';
            caract[index]--;
        }


        for(int val:caract)
        {
            if(val!=0)
                return false;
            
        }




        return true;

        



        
    }
}
