//karpekar3
import java.util.Scanner;
class karpekar3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sq,secsq,digit=0,pow,secpow;
        int m,secm,z,secz,y,secy,sum,secsum;
        double f;
        System.out.println("ENter the number");
        num=sc.nextInt();
        sq=num*num;
        secsq=sq;
        while(secsq>0)
        {
            secsq=secsq/10;
            digit++;
        }
        f=((double)digit)/2;
        pow=(int)Math.ceil(f);
        secpow=(int)Math.floor(f);
        m=(int)Math.pow(10,pow);
        secm=(int)Math.pow(10,secpow);
        z=sq/m;
        y=sq%m;
        secz=sq/secm;
        secy=sq%secm;
        if(z==0||y==0||secz==0||secy==0)
        {
            System.out.println("NO:");
            System.out.println("0");
        }
        else
        {
            sum=z+y;
            secsum=secz+secy;
            if(sum==num)
            System.out.println("YES");
            else if(secsum==num)
            System.out.println("YES");
            else
            System.out.println("No");
        }
    }
}

















