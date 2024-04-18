public class SortColors {
    public void sortColors(int[] nums) {
        int red = 0; // Pointer for the end of the red section
        int blue = nums.length - 1; // Pointer for the start of the blue section
        int i = 0; // Pointer to iterate through the array

        while (i <= blue) {
            if (nums[i] == 0) {
                swap(nums, i, red);
                red++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, blue);
                blue--;
            } else {
                i++;
            }
        }
}
