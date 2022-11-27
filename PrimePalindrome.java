
import java.io.*;
class PrimePalindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("m = ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("n = ");
        int n = Integer.parseInt(br.readLine());
        if(m > 3000 || n > 3000 || m > n){
            System.out.println("OUT OF RANGE.");
            return;
        }
        int count = 0;
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for(int i = m; i <= n; i++){
            if(isPalindrome(i) && isPrime(i)){
                if(count == 0)
                    System.out.print(i);
                else
                    System.out.print(", " + i); count++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS: " + count);
    }
    public static boolean isPalindrome(int n){
        int rev = 0;
        for(int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        return n == rev;
    }
    public static boolean isPrime(int n){
        int f = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                f++;
            if(f > 2)
                return false;
        }
        return f == 2;
    }
}
