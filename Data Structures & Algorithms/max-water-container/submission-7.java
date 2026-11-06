class Solution {
    public int maxArea(int[] heights)
    {
        int l=0;
        int r=heights.length-1;
        int maxAria=0;
        while(l<r)
        {
            int latime=r-l;
            int inaltime=Math.min(heights[r],heights[l]);
            int aria=latime*inaltime;

            maxAria=Math.max(aria,maxAria);

            if(heights[l]<heights[r])
            {
                l++;
            }else if(heights[l]>heights[r])
            {
                r--;
            }else{
                l++;
                r--;
            }
        }

        return maxAria;
        
    }
}
