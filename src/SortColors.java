import java.util.Arrays;

public class SortColors {

    public static void main(String[] args)
    {
        //75. Sort Colors
        int[] numsArr = {0, 0, 2, 1, 1,2,1,0,2,0,0};
        SortColors.sortColors(numsArr);
        System.out.println("Problem #75 'Sort Colors' : ");
        System.out.println(Arrays.toString(numsArr));
    }
    public static void sortColors(int[] nums) {
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
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
