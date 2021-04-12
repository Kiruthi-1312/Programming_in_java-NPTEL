// Complete the code fragment to read three integer inputs from keyboard and find the sum and store the result in the variable "sum".

import java.util.*;
public class Question1{ 
public static void main (String[] args){
            int i,n=0,sum=0;
             Scanner inp = new Scanner(System.in);
		for (i=0;i<3;i++){
       	    n = inp.nextInt();
               sum =sum+n;
              }
   System.out.println(sum);
  }
}
