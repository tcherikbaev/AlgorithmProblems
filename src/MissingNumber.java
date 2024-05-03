public class MissingNumber {

    public static void main (String []  args)
    {
        //268. Missing Number
        int[] missArr = {9,6,4,2,3,5,7,0,1};
        int missNumber=MissingNumber.missingNum(missArr);
        System.out.println("268. Missing Number' : ");
        System.out.println("Miss Number: " +missNumber);
    }

        static public int missingNum(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
