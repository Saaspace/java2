//privacy
import java.util.*;
class privacy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l;
        int height=0;
        String s;
        System.out.println("Enter the number of alphabets");
        n=sc.nextInt();
        if(n>6)
        {
            System.out.println("Error!Length of sting should not exceed 6 characters!");
        }
        else
        {
            System.out.println("Enter the code");
            s=sc.next();
            l=s.length();
            for(int i=0;i<l;i++)
            {
             if((int)s.charAt(i)>75&&(int)s.charAt(i)<97)
             {
             height+=1;
             break;
             }
             else if((int)s.charAt(i)>97)
             {
                 height+=3;
                 break;
             }
            }
            for(int j=0;j<l-1;j++)
            {
             if((int)s.charAt(j)==((int)s.charAt(j+1))+1)
             {
             height+=2;
             break;
             }
             else
             height+=4;
            }
            if(height==1)
            System.out.println("INVALID! if contains only from A to K");
            if(height==2)
            System.out.println("INVALID! it must be alternative!");
            if(height==3)
            System.out.println("INVALID! it must be upper case");
            if(height==4)
            System.out.println("VALID");
        }
    }        
}