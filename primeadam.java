
import java.util.*;
class primeadam //the main class
{
    boolean isPrime(int n) //to check for prime number
    {
        int c = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
            {
                c++;
            }
        }
        if(c == 2)
            return true;
        else
            return false;
    }
     
    int reverseNum(int n) //to reverse a number
    {
        int r = 0, d = 0;
        while(n > 0)
        {
            d = n%10;
            r = r*10 + d;
            n = n/10;
        }
        return r;
    }
     
    boolean isAdam(int n) //to check for Adam number
    {
        int rev = reverseNum(n);
        int sqn = n*n;
        int sqr = rev * rev; //square of reverse
        int rsqn = reverseNum(sqn); //reverse of square
        if(rsqn == sqr)
            return true;
        else
            return false;
    }
     
    public static void main(String args[]) //the main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for M : ");
        int m = sc.nextInt();
        System.out.print("Enter the value for N : ");
        int n = sc.nextInt();
 
        primeadam ob = new primeadam();
 
        if(m<1 || n<1 || m>n) //checking for invalid input
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            int c = 0;
            System.out.println("THE PRIME-ADAM INTEGERS ARE:");
            for(int i=m; i<=n; i++)
            {
                if(ob.isPrime(i) && ob.isAdam(i)) //checking for prime-adam number
                {
                    c++;
                    System.out.print(i + "\t");
                }
            }
            if(c == 0)
            System.out.print("NIL");
            System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS:" + c);
        }
    }
}
