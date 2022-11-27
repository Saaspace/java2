//Rearrange
import java.util.Scanner;
class Rearrange2
{
    String wrd,newwrd;
    Rearrange2()
    {
        wrd="";
        newwrd="";
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words in upper case");
        wrd=sc.nextLine();
    }
    void freq_vow_con()
    {
        int fc=0,fv=0;
        int l;
        char ch;
        l=wrd.length();
        for(int i=0;i<l;i++)
        {
            ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                fv++;
            }
            else
            {
                fc++;
            }
        }
        System.out.println("freq of vow="+fv);
        System.out.println("freq of cons="+fc);
    }
    void arrange()
    {
        String c="";
        String v="";
        int l;
        char ch;
        l=wrd.length();
        for(int i=0;i<l;i++)
        {
            ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                v=v+ch;
            }
            else
            {
                c=c+ch;
            }
            newwrd=v+c;
        }
    }
    void display()
    {
        System.out.println("original="+wrd);
        System.out.println("rearranged="+newwrd);
    }
    public static void main(String args[])
    {
        Rearrange ob=new Rearrange();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}




















