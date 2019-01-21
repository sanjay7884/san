import java.util.*;
class vowel
{
public static void main(String[ ] arg)
{
boolean Vowel=false;;
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0); 
switch(ch)
{
case 'a' :
case 'e' :
case 'i' :
case 'o' :
case 'u' :
case 'A' :
case 'E' :
case 'I' :
case 'O' :
case 'U' : 
Vowel = true;
break;
}
if(Vowel == true)
{
System.out.println("Vowel");
}
else 
{
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println("Consonant");
else
System.out.println("Invalid");		
}
}
}
