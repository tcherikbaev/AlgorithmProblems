public class PowerOfTwo {

    public static void main (String []  args)
    {
        System.out.println("231. problem: ");
       System.out.println("if n=45: "+isPowerOfTwo(64));

    }

    //Solution using Bitwise operation
    private static boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        return (n&(n-1))==0;
    }


}
