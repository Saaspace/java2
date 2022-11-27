//checl
import java.util.Scanner;
class emirip
{
    int n,rev,f;
    emirip(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x)
    {
        if(n==x)
        return 1;
        else if(n%x==0)
        return 0;
        else
        return isprime(x+1);
    }
    void isemirip()
    {
        int x=n;
        while(x>0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        int ans1=isprime(f);
        n=rev;
        f=2;
        int ans2=isprime(f);
        if(ans1==1&&ans2==1)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number to be checked");
        int a=sc.nextInt();
        emirip ob=new emirip(a);
        ob.isemirip();
    }
}
