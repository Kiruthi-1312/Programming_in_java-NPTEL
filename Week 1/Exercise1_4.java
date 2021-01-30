import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
 //Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int power;
power = (int)Math.floor(Math.log10(n)+1);
int temp=n;
int sum =0;

while(n>0)
{
  int n1 = n%10;
  n=n/10;
  sum += (int)Math.pow(n1,power);
}
if (sum == temp)
  result=1;
System.out.print(result);

}
}
