// Execution of two or more threads occurs in a random order. 
// The keyword 'synchronized' in Java is used to control the execution of thread in a strict sequence.
// In the following, the program is expected to print the output as given below.
// Do the necessary use of 'synchronized' keyword, so that, the program prints the Final sum as given below:  
// 
// -----------------OUTPUT-------------------
// 
// Final sum:6000
// 
// -------------------------------------------------

class Pair {
private int a, b;
public Pair() {
a = 0;
b = 0;
}
public synchronized int sum() {
return(a+b);
}
  public synchronized void inc() {
a++;
b++;
}
  public class PairWorker extends Thread {
public final int COUNT = 1000;
private Pair pair;

public PairWorker(Pair pair) {
this.pair = pair;
}
    
    public void run() {
for (int i=0; i<COUNT; i++) {
pair.inc();
}
    }
    
    public static void main(String args[]) {
Pair pair = new Pair();
PairWorker w1 = new PairWorker(pair);
PairWorker w2 = new PairWorker(pair);
PairWorker w3 = new PairWorker(pair);
w1.start();
w2.start();
w3.start();
      
   try {
w1.join();
w2.join();
w3.join();
}
catch (InterruptedException ignored) {}


System.out.println("Final sum:" + pair.sum());
    }
  }
