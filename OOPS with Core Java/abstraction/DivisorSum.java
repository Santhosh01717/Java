/*
  Write a program to find the sum of divisors using the concept of abstract classes.
  Create an abstract class "AbstractClass" which contains abstract methods getValue() and divisorSum(int n). Then write a class called Calculator which extends the abstract class.
  getValue(): Method need's to get input from the user.
  divisorSum(int n): Method get's "n" as parameter and returns the sum of the numbers divisor.

  Eg: Divisor of number 4 is 1, 2, 4. Output is 1+2+4 = 7

  Input format
  The input consists of a number.

  Output format
  The output prints the sum of its proper divisors.

  Code constraints
  0 <= n <= 9999

  Sample testcases
 Input 1         Output 1
 4               7
*/

package abstraction;
import java.util.*;
abstract class AbstractClass{
    abstract void getValue();
    abstract int divisorSum(int n);
}
class Calculator extends AbstractClass
{
    void getValue(){
        
    }
    int divisorSum(int n){
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return n+sum;
        
    }
}
class DivisorSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calculator cal=new Calculator();
        int n=sc.nextInt();
        System.out.print(cal.divisorSum(n));
        
    }
}
