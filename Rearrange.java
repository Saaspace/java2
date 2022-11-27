//Saahil
import java.util.*;
class Rearrange
{
    String txt,cxt;
    int len;
    Rearrange()
    {
        txt="";
        cxt="";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words in upper case");
        txt=sc.nextLine();
    }
    void convert()
    {
        char ch;
        ch=txt.charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            cxt=txt+'Y';
        }
        else
        {
            int c=0;
            len=txt.length();
            for(int i=0;i<len;i++)
            {
                char ch1;
                ch1=txt.charAt(i);
                if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')   
                {
                    c++;
                    cxt=txt.substring(i)+txt.substring(0,i);
                    break;
                }
            }
            if(c==0)
            cxt=txt+'N';
            else
            cxt=cxt+'C';
        }           
    }
    void display()
    {
        System.out.println("original="+txt);
        System.out.println("rearranged="+cxt);
    }
    public static void main(String args[])
    {
        Rearrange ob=new Rearrange();
        ob.readword();
        ob.convert();
        ob.display();
    }
}



















