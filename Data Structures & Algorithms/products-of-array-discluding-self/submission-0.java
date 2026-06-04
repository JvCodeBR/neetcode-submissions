class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsSize = nums.length;
        int[] result = new int[numsSize];
        for (int i = 0; i < numsSize; i++) {
            int product = 1;
            for (int j = 0; j < numsSize; j++) {
                if (j != i) {
                    product = product * nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}  
