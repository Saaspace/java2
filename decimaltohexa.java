//z
import java.util.*;
class decimaltohexa

{
    int a[];
    int n;
    decimaltohexa()
    {
        a=new int[15];
        n=0;
    }
    void decimaltohexadecimal(int n)
    {
        int ch;
        if(n==0)
        return ;
        else
        {
            if((n%16)>=10)
            {
            ch=(n%16)+55;
        }
        else
        {
            ch=(n%16)+48;
        }
    }
    decimaltohexadecimal(n/16);
    System.out.print((char)ch);
}
public static void main(String args[])
{
    decimaltohexa ob=new decimaltohexa();
    ob.decimaltohexadecimal(35);

}
}









