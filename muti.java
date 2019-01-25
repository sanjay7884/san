import java.util.Scanner;
public class multi 
{
      public static void main(String[] args) 
       {
        int i,n,mul;
        Scanner s=new Scanner(System.in);
        System.out.print("input: ");
        n=s.nextInt();
        System.out.println("output");
        for(i=1;i<=5;i++)
      {
          mul=i*n;
          System.out.println(mul);
      }
        
    }
 
}
