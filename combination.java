//combination
import java.util.*;
class combination
{
    int n,k;
    double comp;
    combination()
    {
        n=0;
        k=0;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n and k");
        n=sc.nextInt();
        k=sc.nextInt();
    }
    int fact(int n)
    {
        if(n<2)
        return 1;
        else
        {
        return (n*fact(n-1));
        }
    }
    void compute()
    {
    comp=(double)fact(n)/((double)fact(k)*(double)fact(n-k));
    }
    void display()
    { 
        System.out.println(comp);
    }
    public static void main(String args[])
    {
        combination ob=new combination();
        ob.read();
        ob.compute();
        ob.display();
    }
}





