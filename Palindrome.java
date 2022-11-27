import java.util.*;
class Palindrome
{
   private String s,rs;
   public Palindrome()
   {
       s="";
       rs="";
    }
    public Boolean input()
    {
        int l;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Sentence");
        s=sc.nextLine();
        l=s.length();
        ch=s.charAt(l-1);
        if(!(ch=='.'||ch=='?'||ch=='!'))
        {
            System.out.println("INVALID INPUT");
            return false;
        }
        else
        {
            return true;
        }
    }
    public void process()
    {
        String w,suffix;
        int l,wl,i;
        char ch;
        l=s.length();
        ch=s.charAt(l-1);
        String ns=s.substring(0,l-1);
        StringTokenizer st = new StringTokenizer(ns);
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            wl=w.length();
            i=0;
            suffix="";
            while(!isPalindrome(w+suffix))
            {
                suffix = w.charAt(i) + suffix;
                i++;
            }
            rs=rs + " " + w+suffix;
        }
       
    }
    public void display()
    {
        System.out.println("Result is:");
        System.out.println(rs);
    }
    public boolean isPalindrome(String s)
    {
        String r="";
        int l,i;
        l=s.length();
        for(i=0;i<l;i++)
        {
            r=s.charAt(i) +r;
        }
        return s.equals(r);
    }
    public static void main(String args[])
    {
        Palindrome ob = new Palindrome();
        if(ob.input())
        {
            ob.process();
            ob.display();
        }
    }
}
