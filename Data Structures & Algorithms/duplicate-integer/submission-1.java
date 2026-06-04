class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> viewed = new HashSet<>();
        for (int num : nums) {
            if (viewed.contains(num)) return true;
            viewed.add(num);
        }
        return false;
    }
}