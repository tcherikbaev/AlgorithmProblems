public class SingleNumber {

    public static void main(String[] args)
    {
        //136. Single Number
        int[] nums = {8, 2, 8, 2, 1};
        int result = SingleNumber.SingleNum(nums);
        System.out.println("Problem #136 'Single Number' : " + result);
    }
    public static int SingleNum(int [] nums)
    {
        int result=0;
        for(int number:nums)
        {
            result^=number;
        }
        return result;
    }
}
