
import java.util.*;
class cord
{
String cd,W,w;
cord()
{
cd=" ";
}
void fnInput()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
cd=sc.nextLine();
w=cd;
}

//Check the String is valid
boolean isValid()
{
for(int j=0;j<cd.length()-1;j++)
{
if(cd.charAt(j)==' ' && cd.charAt(j+1)==' ') // checking repeated space
{
return false; //if repeated space, String is invalid
}
}
return true;

}
void fnOperate()
{
fnInput();
if(isValid() == false)
{
System.out.println("Invalid string");
return;
}
StringTokenizer st=new StringTokenizer(cd);
int ct=st.countTokens();
for(int j=1;j<=ct;j++)
{
String wrd=st.nextToken();
int cw=fnVowel(wrd);
System.out.println(wrd +" "+cw);

}
}

//counting the vowels in the argument ‘w’
int fnVowel(String w)
{
int c=0;
W=w.toUpperCase();
for (int j=0;j<W.length();j++)
{
if(W.charAt(j)=='A'||W.charAt(j)=='E'||W.charAt(j)=='I'||W.charAt(j)=='O'||W.charAt(j)=='U')
c++;
}
return c;
}
public static void main(String args[])
{
cord c1=new cord();
c1.fnOperate();
}

}