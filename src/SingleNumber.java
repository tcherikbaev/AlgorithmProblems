public class SingleNumber {
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
