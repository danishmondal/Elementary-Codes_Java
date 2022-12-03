import java.util.*;
class HammingDistance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,i,count=0;
        System.out.println("Enter the number of elements.");
        n=sc.nextInt(); 
        int arr1[]=new int[n]; 
        int arr2[]=new int[n];
        System.out.println("Only enter 0 and 1 as value.");
        
        for (i=0;i<n;i++)
        {
            System.out.println("Enter value of element "+(i+1)+" in array 1.");
            arr1[i]=sc.nextInt(); 
            if (arr1[i]>1)
            {
                System.out.println ("Invalid input."); 
                break;
            }
            System.out.println("Enter value of element "+(i+1)+" in array 2.");
            arr2[i]=sc.nextInt(); 
            if (arr2[i]>1)
            {
                System.out.println ("Invalid input."); 
                break;
            }
        }
        
        for (i=0;i<n;i++)
        {
            if(arr1[i]==0 && arr2[i]==1|| arr1[i]==1 && arr2[i]==0) //checking if the value of the first element of array is not matching with the second one
            {
                count++;
            }  
        }
        System.out.println("Your array 1 followed by array 2:");
        for (i=0;i<n;i++)
        {
            System.out.print("["+arr1[i]+"]");
        }
        System.out.println("                  ");
        for (i=0;i<n;i++)
        {
            System.out.print("["+arr2[i]+"]");
        }
        System.out.println("                   ");
        for (i=0;i<n;i++)
        {
            if (arr1[i]!=arr2[i]) 
                System.out.print(" 0 ");   
            else
                System.out.print(" X ");
        }
        System.out.println("\n"+"Number of Hamming distance: "+count);
    }
}
/*
 * Author: Danish Mondal
 * Email: danishmondal03@gmail.com
 * Level: Elementart (ICSE & ISC)
 */