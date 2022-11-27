//change
import java.util.*;
class Change
{
    Scanner sc=new Scanner(System.in);
    String str,newstr;
    int len;
    Change()
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
        if(len>=0)
        {
            rechange(len-1);
          newstr=newstr+caseconvert(str.charAt(len));  
        }
    }
    void display()
    {
        len=str.length();
        rechange(len-1);
        System.out.println(newstr);
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Change ob=new Change();
        ob.inputword();
        ob.display();
    }
}







