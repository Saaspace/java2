//fib
import java.util.Scanner;
class fib
{
    int a=0;
    int b=1;
    int c=0;
    int i=0;
    int n;
    void take()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    n=sc.nextInt();
    System.out.print(a);
    System.out.print(b);
    }
    void fib()
    {
        c=a+b;
        System.out.print(c);
        a=b;
        b=c;
        i++;
        if(i<(n-2))
        {
            fib();
        }
    }
    public static void main(String args[])
    {
        fib ob=new fib();
        ob.take();
        ob.fib();
    }
}

