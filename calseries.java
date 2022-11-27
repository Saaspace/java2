//unique
import java.util.*;
class calseries
{
    int x,n,sum;
    calseries()
    {
        x=0;
        n=0;
        sum=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        x=sc.nextInt();
        n=sc.nextInt();
    }
    int power(int p,int q)
    {
        if(q==0)
        return 1;
        else
        return ((int)Math.pow(p,q))+power(p,q-1);
    }
    void cal()
    {
        sum=power(x,n);
        System.out.println("Sum is"+sum);
    }
    public static void main(String args[])
    {
        calseries ob=new calseries();
        ob.input();
        ob.cal();
    }
}











