import java.util.*;
class check
{
    public void perform(int n)
    {
    int s=0,g;
    while (n>0)
    {
        if(n%2==1)
        n/=10;
        g=n%10;
        System.out.print("\n g = \t "+g);
        s=s+g;
        n/=5;
    }
    System.out.print("\n s = \t "+s);
    }
    public static void main(String args[])
    {
        check ob=new check();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter num");
        n=sc.nextInt();
        ob.perform(n);
    }
}
