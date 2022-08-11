/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



 class Print implements Runnable 
 {
        
    @Override
	public void run()
	{
		System.out.println("Hello India");
	}
		
 }
	
public class Main
{
		public static void main(String[] args) 
	{
		Print p=new Print();
		Thread T1 = new Thread(p);
		Thread T2 = new Thread(p);
		Thread T3 = new Thread(p);
		Thread T4 = new Thread(p);
		Thread T5 = new Thread(p);
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();
	}
}
