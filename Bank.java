import java.io.*;

class Bank
{
    public void intake() throws IOException
    {
        int rev=0,amount,dummy,rem;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Amount:");
        amount=Integer.parseInt(br.readLine());
        if(amount >99999)
        {
            System.out.println("Invalid Amount…");
            return;
        }
        dummy=amount;
        while(dummy !=0)
        {
            rev=rev*10+dummy%10;
            dummy=dummy/10;
        }
        System.out.print("Amount in words :");
        while(rev!=0)
        {
            rem=rev%10;
            switch(rem)
            {
                case 0:
                System.out.print("ZERO");
                break;
                case 1:
                System.out.print(" ONE");
                break;
                case 2:
                System.out.print("TWO");
                break;
                case 3:
                System.out.print(" THREE");
                break;
                case 4:
                System.out.print("FOUR");
                break;
                case 5:
                System.out.print(" FIVE");
                break;
                case 6:
                System.out.print(" SIX");
                break;
                case 7:
                System.out.print("SEVEN");
                break;
                case 8:
                System.out.print("EIGHT");
                break;
                case 9:
                System.out.print("NINE");
            }
            rev=rev/10;
        }
        int den[]={1000,500,100,50,20,10,5,2,1};
        int i=0, tot=0;
        System.out.println("\nDENOMINATORS:\n");
        while (amount!=0)
        {
            rev=amount/den[i];
            if(rev!=0)
            {
                System.out.println(den[i]+" X " + rev + " = " + rev*den[i]);
                tot+=rev;
            }
            amount=amount%den[i];
            i++;
        }
        System.out.println("TOTAL NUMBER OF NOTES:  "+ tot);
    }
}
