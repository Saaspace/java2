//potential
import java.util.Scanner;
class potential
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s,f=" ",temp1=" ";
    int l,i,j=0,pot=0,wc=0,temp=0;
    char ch1,ch2,ch3;
    System.out.println("Enter the sentence in upper case");
    s=sc.nextLine();
    l=s.length();
    ch1=s.charAt(l-1);
    if(ch1=='.'||ch1==','||ch1=='?'||ch1=='!')
    {
    for(i=0;i<l;i++)
    {
        ch2=s.charAt(i);
        if(ch2==' ')
        wc++;
    }
    wc=wc+1;
    System.out.println(wc);
    String as[]=new String[wc];
    int ap[]=new int[wc];
    for(i=0;i<l;i++)
    {
      ch3=s.charAt(i);
      if(ch3!=' '&&ch3!='.'&&ch3!=','&&ch3!='?'&&ch3!='!')
      {
      f=f+ch3;
      pot=pot+(int)ch3;
      }
      else
      {
          as[j]=f;
          ap[j]=pot;
          System.out.println(as[j]+"="+ap[j]);
          f=" ";
          pot=0;
          j++;
      }
    }
    for(int m=0;m<wc;m++)
    {
        for(int n=0;n<wc-m-1;n++)
        {
         if(ap[n]>ap[n+1])
         {
         temp=ap[n+1];
         ap[n+1]=ap[n];
         ap[n]=temp;
         temp1=as[n+1];
         as[n+1]=as[n];
         as[n]=temp1;
        }
        }
    }
    for(int k=0;k<wc;k++)
    {
        System.out.print(as[k]);
    }
    }
    else
    {
    System.out.println("INVALID");
    }
}
}

    