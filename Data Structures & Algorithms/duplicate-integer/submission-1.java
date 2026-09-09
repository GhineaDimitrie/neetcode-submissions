class Solution {
    public boolean hasDuplicate(int[] nums)
    {
        HashSet<Integer> seen=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            seen.add(nums[i]);
        }

        if(n!=seen.size())
        {
            return true;
        }



        return false;
    }
}