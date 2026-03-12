public class FindMax
 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        FindMax sol = new FindMax();
        
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(sol.findMaxConsecutiveOnes(nums)); // Output: 3
    }
}