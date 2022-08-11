/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//package com.jobready.threadpools;


import java.util.concurrent.Executor;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;


public class Main
{
  public static void main (String[]args)
  {


    ExecutorService executor = Executors.newFixedThreadPool (5);


    for (int i = 1; i <= 10; i++)

      {


	Runnable print1 = new Print (i);


	  executor.execute (print1);


      }
    executor.shutdown ();


  }
}

class Print implements Runnable {

	int i;

public Print(int i) {
this.i=i;
}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(i+ "   info-- "+Thread.currentThread().getName()+")");
		
		}	}

	
	
		





