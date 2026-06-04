class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> viewed = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toTarget = target - nums[i];
            if (viewed.containsKey(toTarget)) {
                return new int[] {viewed.get(toTarget), i};
            }
            viewed.put(nums[i], i);
        }
        return new int[]{};
    }
}
