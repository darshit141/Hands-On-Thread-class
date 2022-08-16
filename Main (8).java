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
	    
ArrayDeque <Integer> N = new ArrayDeque<Integer>();
Stack<Integer>sk = new Stack<>();
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
for(int i= 1;i<=2;i++){			//removing 2 elements and adding to the Stack
sk.push(N.peek());
N.remove(i);
}

System.out.println(sk.size()+" Removed Elements : "+ sk);
Stack<Integer>stk = new Stack<>();   						//stack to initialize existing elements


	
stk.push(N.pollFirst());
stk.push(N.pollFirst());
stk.push(N.pollFirst());
stk.push(N.pollFirst());

System.out.println("Rest Existing elements"+stk);
             

	}
}

