import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
    
    //Initialize maximum element as first element of the array.  
result =arr[0];
   //Traverse array elements to get the current max.
int sum=0;
for(i=0;i<arr.length;i++)
{
  if(result<arr[i])
   //Store the highest mark in the variable result.
  {
    result=arr[i];
  }
   //Store average mark in avgMarks.
  
  sum += arr[i];
 
}
 mark_avg = sum/5;
System.out.print(result);
System.out.print("\n"+mark_avg);
}
}
