public class MoveZeros {

    public static void main (String []  args)
    {

        //283. Moves zeros
        System.out.println("Problem #283 'Move Zeros' : ");
        int[] nums2={3,43,0,54,5,8,0,4,0,12,13,0,0,44,33,22,11};
        MoveZeros.MoveZeroNumber(nums2);
        for(int i:nums2)
        {
            System.out.print(i +" ");
        }
    }
    public static void MoveZeroNumber(int[] nums)
    {
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) continue;

            nums[j]=nums[i];
            j++;
        }
        while (j<n)
        {
            nums[j]=0;
            j++;
        }
    }
}
