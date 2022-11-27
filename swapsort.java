//swapsort
import java.util.*;
class swapsort
{
    String wrd,swapwrd,sortwrd;
    int len;
    swapsort()
    {
        wrd=" ";
        swapwrd=" ";
        sortwrd=" ";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word in upper case");
        wrd=sc.next();
        len=wrd.length();
    }
    void swapword()
    {
        char ch1,ch2;
        String mid;
        ch1=wrd.charAt(0);
        ch2=wrd.charAt(len-1);
        mid=wrd.substring(1,len-1);
        swapwrd=ch2+mid+ch1;
    }
    void sortwrd()
    {
        int temp;
        int s[]=new int[len];
        for(int k=0;k<len;k++)
        s[k]=(int)wrd.charAt(k);
        for(int i=0;i<len-1;i++)
        {
              for(int j=0;j<len-1-i;j++)
              {
                  if(s[j]>s[j+1])
                  {
                      temp=s[j];
                      s[j]=s[j+1];
                      s[j+1]=temp;
                    }
              }
        }
         for(int p=0;p<len;p++)
         sortwrd=sortwrd+(char)s[p];
    }
    void display()
    {
        System.out.println(wrd);
        System.out.println(swapwrd);
        System.out.println(sortwrd);
    }
    public static void main(String args[])
    {
        swapsort ob=new swapsort();
        ob.readword();
        ob.swapword();
        ob.sortwrd();
        ob.display();
    }
}




















