import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello it is my AlgoTask project, where i will post all my solved problems");

        //Here my solved task between 4th-11th April
        //136. Single Number
        int[] nums = {8, 2, 8, 2, 1};
        int result = SingleNumber.SingleNum(nums);
        System.out.println("Problem #136 'Single Number' : " + result);
        System.out.println("****************************************************");
        //283. Moves zeros
        System.out.println("Problem #283 'Move Zeros' : ");
        int[] nums2={3,43,0,54,5,8,0,4,0,12,13,0,0,44,33,22,11};
        MoveZeros.MoveZeroNumber(nums2);
        for(int i:nums2)
        {
            System.out.print(i +" ");
        }
        System.out.println("****************************************************");
        //151. Reverse Words in a String

        String word="a good   example for";
        String reverse= ReverseString.reverseWords(word);
        System.out.println("Problem #151 'Reverse Words in a Strings Java Code' : ");
        System.out.println(reverse);
        //75. Sort Colors
        int[] numsArr = {0, 0, 2, 1, 1,2,1,0,2,0,0};
        SortColors.sortColors(numsArr);
        System.out.println("Problem #75 'Sort Colors' : ");
        System.out.println(Arrays.toString(numsArr));
        //268. Missing Number
        int[] missArr = {9,6,4,2,3,5,7,0,1};
        int missNumber=MissingNumber.missingNum(missArr);
        System.out.println("268. Missing Number' : ");
        System.out.println(missNumber);
    }

}