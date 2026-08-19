import java.util.*;
public class patternprinting 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the number");
        int n = sc.nextInt();

        // for upper half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower half 
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n+i-4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
