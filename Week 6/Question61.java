// Complete the code segment to print the following using the concept of extending the Thread class and ‘run()’  in Java:

// ----------------OUTPUT--------------------------
// 
// This code is outside of the thread
// This code is running in a thread
// 
// -------------------------------------------------

ublic class Question61 extends Thread {
  public static void main(String[] args) {
    
Question61 thread = new Question61();
    thread.start();
    System.out.println("This code is outside of the thread");
  }

public void run() {
    System.out.println("This code is running in a thread");
  }
}
