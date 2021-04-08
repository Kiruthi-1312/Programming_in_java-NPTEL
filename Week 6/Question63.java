// A part of the Java program is given, which can be completed in many ways, for example using the concept of thread, etc.
// Follow the given code and complete the program so that your program prints the message "NPTEL Java week-6 new Assignment Q3".
// Your program should utilize the given interface/ class.

interface A {
	public abstract void run();
}

class B implements A {
	public void run() {}
}


class MyThread extends B {
	public void run() {
 		System.out.print("NPTEL Java week-6 new Assignment Q3");
	}
}

		
public class Question63 {
     public static void main(String[] args) {
		 
         MyThread t = new MyThread();
		
         t.run();
     }
}
