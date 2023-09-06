//ask user to enter length ask user to search element 
import java.util.*;
public class Linear_Search{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter elements");
        for(int i=0;i<l;i++)
        {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
       System.out.println("Enter element to search");
       int t=sc.nextInt();
       boolean search=false;
       for(int i=0;i<l;i++)
       {
        if(arr[i]==t)
        {
search=true;
System.out.println("Element " + t + " search at index " + i);
                break; 
            }
        }

        if (!search) {
            System.out.println("Element " + t + " not found in the array.");
        }

        sc.close();
        }
       }
    