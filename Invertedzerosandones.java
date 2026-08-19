
import java.util.*;
public class patternprinting 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1 + " ");
                }
                else 
                {
                    System.out.print(0 + " ");
                }
            }
             System.out.println();
        }
    }
}
