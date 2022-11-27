//common
import java.util.Scanner;
class common
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,l,Sc=0,wc=0,j=0,freq=1,d=0,k;
        String s,ns="",f="";
        char ch,ch2,ch3;
        System.out.println("Enter the sentence in upper case");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='.'||ch=='?'||ch=='!')
            {
                Sc++;
                ns=ns+s.substring(d,i+1);
                d=i+1;
                System.out.println(ns);
                ns="";
            }
        }
        if(Sc<=1||Sc>2)
        {
        System.out.println("INVALID");    
        }
        else
        {
            for(i=0;i<l;i++)
            {
                ch2=s.charAt(i);
                if(ch2==' '||ch2=='.'||ch2=='?'||ch2=='!')
                wc++;
            }
            String as[]=new String[wc];
            for(i=0;i<l;i++)
            {
                ch3=s.charAt(i);
                if(ch3==' '||ch3=='.'||ch3=='?'||ch3=='!')
                {
                    as[j]=f;
                    f="";
                    j++;
                }
                else
                f=f+ch3;
            }
            for(i=0;i<wc-1;i++)
            {
                for(k=i+1;k<wc;k++)
                {
                    if((as[i].equals(as[k]))&&(as[i].compareTo(" ")!=0))
                    {
                        freq++;
                        as[k]=" ";
                    }
                }
                if(freq!=1)
                {
                System.out.println("HELLO"+as[i]+" "+freq);
                }
                freq=1;
            }
        }
    }
}
