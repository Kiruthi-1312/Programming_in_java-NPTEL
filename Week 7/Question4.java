// A string is read from the keyboard and is assigned to variable "s1".
// Your program should print the "number of vowels in s1”. 
// However, if your input is other than "String" data type it will print "0".

import java.io.*;
import java.util.*;
public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
for(int i=0;i<s1.length();i++){  
          char s2=s1.charAt(i);
          if(s2=='e' || s2=='E'|| s2=='a' || s2=='A' || s2=='i' || s2=='I' || s2=='o' || s2=='O' || s2=='u' || s2=='U') 
	     {
	       c=c+1;
             }    
         }  
       System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
}  
