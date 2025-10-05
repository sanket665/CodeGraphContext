class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.jump(new int[]{2,3,1,1,4})); 
        System.out.println(s.jump(new int[]{2,3,0,1,4})); 
    }
}
