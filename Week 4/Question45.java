// Modify the code segment to print the following output.
// 
// -----------------OUTPUT-------------------
// Circle: This is Shape1
// Circle: This is Shape2
// -------------------------------------------------


interface ShapeX {
 public String base = "This is Shape1";
 public void display1();
}
interface ShapeY extends ShapeX {
 public String base = "This is Shape2";
 public void display2();
}

class ShapeG implements ShapeY {
 public String base = "This is Shape3";
  
  public void display1() {
  System.out.println("Circle: " + ShapeX.base);
 }
  
 public void display2() {
  System.out.println("Circle: " + ShapeY.base);
 }
}

public class Question45{
 public static void main(String[] args) {
  ShapeG circle = new ShapeG();
  circle.display1();
  circle.display2();
 }
}
