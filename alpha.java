//alpha
import java.util.*;
class alpha
{
    String str;
    alpha()
    {
        str=" ";
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the word");
        str=sc.next();
    }
    void arrange()
    {
        int l,ch1,temp,m;
        String ns=" ";
        l=str.length();
       int a[]=new int[l];
       for(int i=0;i<l;i++)
       {
           char ch;
           ch=str.charAt(i);
           ch1=(int)ch;
           a[i]=ch1;
        }
       for(int j=0;j<l;j++)
       {
           for(int k=0;k<l-j-1;k++)
           {
               if(a[k]>a[k+1])
               {
                   temp=a[k];
                   a[k]=a[k+1];
                   a[k+1]=temp;
                }
            }
        }
        for(m=0;m<l;m++)
        {
            ns=ns+(char)a[m];
            str=ns;
        }
    }
    void display()
    {
        System.out.println("THE WORD IS"+str);
    }
    public static void main(String args[])
    {
        alpha ob=new alpha();
        ob.readword();
        ob.arrange();
        ob.display();
    }
}