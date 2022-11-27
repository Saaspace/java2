import java.io.*;
class KarpekarNumber
{
    int p,q;
    int count=0;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        p=Integer.parseInt(br.readLine());
        q=Integer.parseInt(br.readLine());
        if(p>=5000 || q>=5000 || p>=q)
            System.out.println("Out of range");
        else
        {
            System.out.println("THE KAPREKAR NUMBERS ARE:- ");
            for(int i=p;i<=q;i++)
            {
                if(check(i)==1)
                {
                   if(count==0)
                       System.out.print(i);
                  else
                        System.out.print(","+i);
                     count++;
                }
            }
            System.out.println();
            System.out.println("FREQUENCY OF KAPREKAR NUMBERS IS:  "+count);
        }
    }
    long check(int n)
    {
        int len=(""+n).length();
        long sq=n*n;
        long k=sq%(long)(Math.pow(10,len));
        long s=sq/(long)(Math.pow(10,len));
        long l=(k+s);
        if(l==n)
            return 1;
        else
            return 0;
    }
    public static void main(String args[])throws IOException
    {
        KarpekarNumber ob=new KarpekarNumber();
        ob.input();
    }
}
