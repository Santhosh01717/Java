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