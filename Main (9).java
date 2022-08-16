/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*; 

public class Main
{
	public static void main(String[] args) {
	    
PriorityQueue<Integer> N = new PriorityQueue<Integer>();
for(int i = 1;i <= 6;  i++)
{
    N.add(i);
}
Iterator<Integer> It = N.iterator();
System.out.println("6 elements : ");
while(It.hasNext())
{
 System.out.println(" "+It.next());   
 
}
System.out.println(" Removed Elements : ");
System.out.println(N.peek());
N.remove(1);
System.out.println(N.peek());
N.remove(2);


System.out.println("Rest Existing elements"+N);
             

	}
}

