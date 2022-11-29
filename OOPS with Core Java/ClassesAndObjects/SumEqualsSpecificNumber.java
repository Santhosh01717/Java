/*
      Create a class with two methods 
      one to read the elements of an array and
      the other to find all pairs of elements 
      in an array whose sum is equal to a specified number.

      Input Format
      The first line of the input consists of the value of n.
      Next input is the array elements.
      The last input is the sum value.

      Output Format
      The output prints the pair whose sum is equal
      to a specified number.

      Sample Testcases

      Input1                Output1
      5                     3  5
      1 2 3 4 5             4  4
      8                     5  3
 */

package ClassesAndObjects;
import java.util.*;

public class SumEqualsSpecificNumber {
    public static void display(int n,int a[],int sum){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]+a[j] == sum)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=sc.nextInt();
        display(n,a,sum);
    }
}

