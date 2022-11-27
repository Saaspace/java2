//factorial
import java.util.Scanner;
class factorial
{
    int n;
    int i=1;
    int fact=1;
    void take()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
    }
    void fac()
    {
        fact=fact*i;
        i++;
        if(i<=n)
        {
            fac();
        }
        else
        {
            System.out.println(fact);
        }
    }
    public static void main(String args[])
    {
        factorial ob=new factorial();
        ob.take();
        ob.fac();
    }
}