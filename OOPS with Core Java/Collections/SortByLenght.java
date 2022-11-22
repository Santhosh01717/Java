/*Input a positive integer N (N > 0), input N strings, 
and sort the strings in place in the order of increasing length. 
Print the sorted strings using ArrayList as an implementation of the List interface 
for storing the individual strings.

Input format
Input number of elements

Input each string on a separate line

Output format
Print the list of strings sorted by their length

Sample testcases
Input 1              Output 1
3                    
aa                   [b, aa, ccc]
b
ccc
*/
package Collections;
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Collections;
import java.util.List; 
import java.util.Scanner;
import java.util.Comparator;
class SortByLenght{ 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        ArrayList<String> str=new ArrayList<>(); 
        sc.nextLine(); 
        for(int i=0;i<n;i++) { 
            String s=sc.nextLine();
            str.add(s); 
        } 
        Collections.sort(str,Comparator.comparingInt(String::length));
        System.out.print(str);
    }
    }
