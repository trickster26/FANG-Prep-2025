public class ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return true;
        //     }
        //     set.add(num);
        // }
        // return false;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == nums[right]){
                return true;
            }
            else if (nums[left] < nums[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {0,4,5,0,3,6};
        System.out.println(containsDuplicate(nums));
    }
}