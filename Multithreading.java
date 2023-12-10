// Multi threading 


import java.util.Scanner;

class Demooo1  extends Thread
{
	public void run()
	{
System.out.println("Addition Started");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ist num");
	        int a = scan.nextInt();
	        System.out.println("Enter the second num");
	        int b = scan.nextInt();
	        System.out.println(a+b);
	        
	        System.out.println("Addition Completed");

	}
	}
class Demooo2 extends Thread
{
	@Override
	public void run ()
	{

        System.out.println("Print num started");
        for(int i = 1;i<=10;i++)
        {
        	System.out.println(i);
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("Print num ended"); 	
	}
	
}
 class Demooo3 extends Thread
 {
	 public void run ()
 
	 {
			System.out.println("Print Char started");
	        for(int i = 65;i<=75;i++)
	        {
	        	System.out.println((char)i);
	        	try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("Print Char ended"); 
 }
 }
 


public class Multithreading {
	

	
	public static void main(String[] args) {
		
		   Demooo1 d1 =  new Demooo1();
		   Demooo2 d2 =  new Demooo2();
		   Demooo3 d3=  new Demooo3();
		 
		   
		d1.start();  // if we give the d1.run() directly the stack frame of 
//		the run method is creatd  in the main stack and the multithreading is not possible
		// we call the run method indirectly by giving d1.start() with this the 
//		stack frame is called in the new stack.
		d2.start();
		d3.start();


	        
	        
	        
	}

}
