import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String output = Arrays.toString(solution.twoSum(new int[]{2, 3, 11, 7, 6, 15}, 9));
        System.out.println(output);
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int tall = target - nums[index];
            if (map.containsKey(tall)) {
                return new int[]{map.get(tall), index};
            }
            map.put(nums[index], index);
        }
        return new int[0];
    }
}
