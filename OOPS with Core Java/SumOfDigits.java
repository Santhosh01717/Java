/*
Write a program to implement the following logic using inheritance.

Create a parent class and implement the fun method. In the method,
get the individual digits of the entered number,
store it in an array, and find their sum. 
For example in case of 1234, the individual digits are 4,3,2,1 
and the final sum → (4+3)+(4+2)+(4+1)+(3+2)+(3+1)+(2+1) = 30. 
Create the main class that inherits the parent class and 
call the fun method inside the parent function.

Input format
The input consists of an integer.

Output format
The output prints the final sum.

Code constraints
Integers only.

Sample testcases
Input 1           Output 1
1234              30

Input 2           Output 2
4356              54
*/
import java.util.*;
class SumOfDigits{
    void fun(int[] a,int n,int len){
        int k;
        int sum=0;
        for(int i=0;i<len;i++)
         { 
             a[i]=n%10;
             n=n/10;
         }
         for(int i=0;i<len;i++)
         {
             for(int j=i+1;j<len;j++)
             {
                 sum=sum+a[i]+a[j];
             }
         }
         System.out.print(sum);
         
}
}
class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len = (int) (Math.log10(n) + 1);
        int[] a=new int[len];
        SumOfDigits p=new SumOfDigits();
        p.fun(a,n,len);
        
    }
}