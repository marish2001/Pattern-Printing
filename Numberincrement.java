import java.util.*;
public class patternprinting 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num =1;
        System.out.print("\n Enter the number");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
