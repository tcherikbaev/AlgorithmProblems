public class PowerOfTwo {

    public static void main (String []  args)
    {
        System.out.println("231. problem: ");
        int n=64;
       System.out.println("Bitwise : "+isPowerOfTwo(n));

        System.out.println("Recursion : "+isPowerOfTwo2(n));
    }

    //Solution using Bitwise operation
    private static boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        return (n&(n-1))==0;
    }
    private static boolean isPowerOfTwo2(int n)
    {
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        return (n%2==0) && isPowerOfTwo2(n/2);
    }


}
