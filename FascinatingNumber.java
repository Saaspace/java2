import java.util.*;
class FascinatingNumber
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the value for m and n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        if(m>1000 && n>1000)
        {
            System.out.println("INVALID");
        }
        else
        {
        int freq = 0;
        for(int x=m;x<=n;x++)
        {
            if(isFascinating(x))
            {
                freq ++;
            }
        }
        System.out.println("Frequency is: " + freq); 
    }
}
    public static boolean isFascinating(int n)
    {
        int n2 = n*2;
        int n3 = n*3;
        String s = "" + n + n2 + n3;
        
        int l = s.length();
        char ch,cs;
        int i,c=0;
        
        for(cs='1';cs<='9';cs++)
        {
            c=0;
            for(i=0;i<l;i++)
            {
                ch = s.charAt(i);
                if(ch == cs)
                    c++;
            }
            if(c!=1)
                break;
        }
        if(cs > '9')
        {
            System.out.println("fascinating nois"+n);
            return true;
        }
        else
            return false;
    }
}