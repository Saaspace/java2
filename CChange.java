//change
import java.util.*;
class CChange
{
    Scanner sc=new Scanner(System.in);
    String str,newstr;
    int len;
    CChange()
    {
        newstr="";
        len=0;
    }
    void inputword()
    {
     
        System.out.println("Enter the word");
        str=sc.nextLine();
    }
    char caseconvert(char ch)
    {
            if(Character.isLowerCase(ch))
            ch=Character.toUpperCase(ch);
            else if(Character.isUpperCase(ch))
            ch=Character.toLowerCase(ch);
            return(ch);
    }
    void rechange(int len)
    {
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            newstr=newstr+caseconvert(ch);
        }
    }
    void display()
    {
        len=str.length();
        rechange(len);
        System.out.println(newstr);
        System.out.println(str);
    }
    public static void main(String args[])
    {
        CChange ob=new CChange();
        ob.inputword();
        ob.display();
    }
}







