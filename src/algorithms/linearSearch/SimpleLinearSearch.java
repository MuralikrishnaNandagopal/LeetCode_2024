package algorithms.linearSearch;

public class SimpleLinearSearch {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 190;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
