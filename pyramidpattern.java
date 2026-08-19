
import java.util.*;
public class patternprinting 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the number");
        int n = sc.nextInt();
        // for rows
        for(int i=1;i<=n;i++)
        {
            // for columns
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
