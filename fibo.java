//fibo
import java.util.*;
class fibo
{
    int start,end;
    fibo()
    {
        start=0;
        end=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        start=sc.nextInt();
        end=sc.nextInt();
    }
    int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    void display()
    {
        int a;
        for(int i=1;;i++)
        {
            a=fibo(i);
            if(a<start)
            continue;
            else if(a>=start&&a<=end)
            System.out.print(a+" ");
            else
            break;
        }
    }
    public static void main(String args[])
    {
        fibo ob=new fibo();
        ob.accept();
        ob.display();
    }
}










