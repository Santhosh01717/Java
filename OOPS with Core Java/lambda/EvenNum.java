/*
Create a list of the cost that has to be paid for halls and print only the even values using lambda expressions.

Input format
The first line of the input is the value of n.

Next input is the cost separated by a space.

Output format
The output prints the even values separated by a space.

Sample testcases               
Input 1                               Output 1
5                                     1004 8540 
1004 5021 8540 9655 4853
 

*/package lambda;

import java.util.*;
interface EvenNum{
    abstract void evennum(ArrayList a);
}
class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            num.add(x);
        }
        EvenNum e=(ArrayList a)->
        {
            for(int i=0;i<n;i++)
            {
                int z=(int)a.get(i);
                if(z%2==0)
                {
                    System.out.print(z+" ");
                }
            }
        };
        e.evennum(num);
        
    }
}
