/*ArrayIndexOutOfBoundsException:

The prominent exception which you will see is ArrayIndexOutOfBoundsException. It occurs when the program try to access the array beyond its size. As we know arrays have fixed size. So when you try to use array beyond its size it throws this exception. Let's try to handle this exception.

Get an Array of size N and get an index, then print the Array[index]. If the index is greater or equal to array size(N), then print the Exception.



Divide by zero exception:

When you try to divide any number by Zero it will throw ArithmeticException: / by Zero

Get two numbers Then print the quotient if the divisor is 0 then print the Exception.



NullPointerException:

Another prominent exception is NullPointerException. It occurs when you try to access a null value. Assign a null value to a string and obtain an index position and try to access it. Print the exception.

Input format
The first line consists of array size(N).

The second line consists of N integers separated by space.

The third line consists of the Index value to retrieve the array element.

The fourth line consists of two integers(Dividend and Divisor) separated by space.

The fifth line consists of an index value to get the character from the string.

Output format
The first line consists of Array[Index] or ArrayIndexOutOfBoundException.

The second line consists of the result of division or ArithmeticException.

The third line consists of String(Which is assigned to null value).

The fourth line consists of NullPointerException.

Refer to the sample input and output for formatting specifications.

Sample testcases
Input 1                          Output1 
5                                Array index out of bound.
1 2 3 4 5                        java.lang.ArithmeticException: / by zero
6                                null
4 0                              java.lang.NullPointerException
2

Input 2                          Output2
4                                12     
10 89 76 12                      2
3                                null
4 2                              java.lang.NullPointerException
9                
*/
import java.util.*;
class main{
   public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++)
            {
               a[i]=sc.nextInt();
             }
            int pos=sc.nextInt();
            try{
                System.out.println(a[pos]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound.");
            }
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            try{
                System.out.println(num1/num2);
            }
            catch(ArithmeticException e)
            {
               System.out.println(e);
            }
            int num3=sc.nextInt();
            String s=null;
            try{
                System.out.println(s.charAt(0));
            }
            catch(NullPointerException e){
                
                System.out.println("null");
                System.out.println(e);
            }
            
              
        }
    }