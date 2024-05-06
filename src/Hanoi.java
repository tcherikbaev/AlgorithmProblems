import java.util.Scanner;

public class Hanoi {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=in.nextInt();
        System.out.print("Amount of moves: ");
        System.out.println((1<<n)-1);
        HanoiTower(n,1,3,2);

    }
    //s- starting pin, f-finish pin, i-intermediate pin
    private static void HanoiTower(int n,int s,int f,int i)
    {
        if(n==0) return;
        HanoiTower(n-1,s,i,f);
        System.out.println(s+" "+f);
        HanoiTower(n-1,i,f,s);
    }
}
