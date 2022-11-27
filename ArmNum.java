import java.util.Scanner;
class ArmNum
{
    int n,l;
    ArmNum(int num)
    {
        n=num;
        l=(" "+n).length();
    }
    int sum_pow(int i)
    {
        if(i<10)
        {
            return(int)Math.pow(i,l);
        }
        else
        {
            return sum_pow(i/10)+sum_pow(i%10);
        }
    }
    void isArmstrong()
    {
        if(n==sum_pow(n))
        System.out.println(n+"is a armstrong");
        else
        System.out.println(n+"is not a armstrong");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int x=sc.nextInt();
        ArmNum ob=new ArmNum(x);
        ob.isArmstrong();
    }
}
        
           