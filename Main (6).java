/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number to print First N numbers group of Integer ");
int n=sc.nextInt();	    
ArrayList <Integer> N = new ArrayList<Integer>();

for(int i =0;i<n;i++)
{
    N.add(i,i+1);   // inserts each element to specified index.
}
Iterator<Integer> It = N.iterator();

while(It.hasNext())
{
 System.out.print(" "+ It.next());   
}
	    
	}
}