import java.util.*;
class magic_number
{
    public static void main (String args [])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        while (n>9)
        {
            while (n>0) 
            {
                sum=sum+n%10;
                n/=10;
            }
            n=sum;
            sum=0;
        }
        if (n==1)
            System.out.println("It is a magic number...");
        else 
            System.out.println("It is not a magic munber...");
    }
}