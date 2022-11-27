//chord
import java.util.Scanner;
class chord
{
    Scanner sc=new Scanner(System.in);
    String W,w,cd;
        String alpha[];
        char ch;
        char d;
        int vowel[];
        int count,l,i,f,word,v;
    chord()
    {
        String cd=" ";
        String w=" ";
        int count=0;
        int word=0;
        int v=0;
        int f=1;
    }
    void fnInput()
    {
        System.out.println("input the string");
        String cd=sc.nextLine();
        System.out.println(cd);
        int l=cd.length();
        String w=cd;
        fnOperate(cd,l);
    }
    boolean isvalid(String cd,int l)
    {
        boolean flag=true;
        for(i=0;i<(l-1);i++)
        {
            ch=cd.charAt(i);
            if(ch==' ')
            {
                d=cd.charAt(i+1);
                if(d==' ')
                {
                f=0;
                if(f==0)
                {
                    flag=false;
                }
                else
                {
                    flag=true;
                }
                }
            }
        }
        return(flag);
    }
    int fnVowel(String w)
    {
        System.out.println(w);
        W=w.toUpperCase();
        l=W.length();
        count=0;
        word=0;
        alpha=new String[l];
        vowel=new int[l];
        for(i=0;i<l;i++)
        {
            ch=W.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            count=count+1;
            else if(ch==' '||ch=='.')
            {
                alpha[word]=W.substring(v,i);
                vowel[word]=count;
                word++;
                v=i+1;
                count=0;
            }
        }
        for(i=0;i<word;i++)
         {
             System.out.println(alpha[i]+":"+vowel[i]);
            }
            return(0);
    }
    void fnOperate(String cd,int l)
    {
        if(isvalid(cd,l)==false)
        {
            System.out.println("Invalid string");
        }
        else
        {
            int saahil=fnVowel(cd);
         
        }
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        chord ob=new chord();
        ob.fnInput();
        
    }
}













    
    