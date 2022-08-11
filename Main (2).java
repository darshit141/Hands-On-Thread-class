/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



 class Print extends Thread {

	//Thread T = new Thread();
		public void run() {
		System.out.println("Hello All");
	
	}
	
	
		
	}
	
public class Main
{
	public static void main(String[] args) {
	
	Print p1 = new Print();  //Thread 1
	Print p2 = new Print();	 //Thread 2
	Print p3 = new Print();  //Thread 3
	Print p4 = new Print();  //Thread 4
	Print p5 = new Print();  //Thread 5
	p1.start();
	p2.start();
	p3.start();
	p4.start();
	p5.start();	
	    
	}
}
