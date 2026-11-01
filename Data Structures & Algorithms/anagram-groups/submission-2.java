class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String,List<String>> map=new HashMap<>();

        for(String s:strs)
        {
            char[] carr=s.toCharArray();
            Arrays.sort(carr);
            String cuvint=new String(carr);

            if(!map.containsKey(cuvint))
            {
                map.put(cuvint,new ArrayList<>());
            }

            map.get(cuvint).add(s);
        }


        return new ArrayList<>(map.values());

        
    }
}
