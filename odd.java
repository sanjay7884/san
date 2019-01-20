import java.util.*;
import java.io.*;
public class odd
{
public static void main (String args[])
{
int i;
Scanner s=new Scanner (System.in);
i=s.nextInt();
if(i>0)
if((i%2)==0)
System.out.println("even");
else 
System.out.println("odd");
else 
System.out.println("invalid");
}
}
