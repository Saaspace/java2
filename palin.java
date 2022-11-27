//palin
import java.util.*;
class palin
{
    int num,revnum;
    palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else
        {
            revnum=(revnum*10)+y%10;
            return reverse(y/10);
        }
    }
    void check()
    {
        if(reverse(num)==num)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    public static void main(String args[])
    {
        palin ob=new palin();
        ob.accept();
        ob.check();
    }
}










