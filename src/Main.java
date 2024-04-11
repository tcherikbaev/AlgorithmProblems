
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello it is my AlgoTask project, where i will post all my solved problems");


        //Here my solved task between 4th-11th April
        //136. Single Number
        int [] nums={8,2,8,2,1};
        int result=SingleNumber(nums);
        System.out.println("Single number , task#136 : "+result);
    }

    public static int SingleNumber(int [] nums)
    {
        int result=0;
        for(int number:nums)
        {
            result^=number;
        }
        return result;
    }
}
