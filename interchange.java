//interchange
import java.util.*;
class interchange
{
String nw,w;
interchange()
{
w=" ";
}
void fnInput()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
w=sc.nextLine();
}
void isdoing()
{
char ch1;
char ch2;
String nw2;
int l;
l=w.length();
ch1=w.charAt(0);
ch2=w.charAt(l-1);
nw2=w.substring(1,l-1);
nw=ch2+nw2+ch1;
System.out.println(nw);
}
public static void main(String args[])
{
interchange ob=new interchange();
ob.fnInput();
ob.isdoing();   
}
}