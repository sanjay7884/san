import java.util.Scanner;
public class countingdigits
 {
   public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      int count=0;
      System.out.println("Input :");
      int num=s.nextInt();
      while(num!=0)
	{
         num = num/10;
         count++;
        }
      System.out.println("Output: "+count);
   }
}
