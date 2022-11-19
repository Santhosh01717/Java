/*
Java program to find the count of all digits of a number using class.
In this program, we will read a positive integer number and then calculate the count of all digits using a class.

Input format
The input consists of a number.

Output format
The output prints the count of all digits in the number.

Sample testcases
Input 1            Output 1     
12345              Count of all digits: 5

Input 2            Output 2
22                 Count of all digits: 2
 */
import java.util.Scanner;
class CountDigit{
    void print(int n){
        int count=0;
        int k;
        while(n>0)
        {
            k=n%10;
            count++;
            n=n/10;
        }
        System.out.print("Count of all digits: "+count);
}
}
class main{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CountDigit d= new CountDigit();
        d.print(n);
    }
}