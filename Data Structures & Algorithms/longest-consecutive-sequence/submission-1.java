

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {

            // Verificăm dacă numărul curent este începutul unei secvențe
            if (!set.contains(nums[i] - 1)) {

                int currentNum = nums[i];
                int currentLength = 0;

                // Numărăm elementele consecutive
                while (set.contains(currentNum)) {
                    currentNum++;
                    currentLength++;
                }

                // Actualizăm lungimea maximă
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}