//cap
import java.util.*;
class cap
{
    String sent;
    int freq;
    cap()
    {
        sent=" ";
        freq=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
    }
    boolean iscap(String w)
    {
        char ch;
        ch=w.charAt(0);
        if(Character.isUpperCase(ch))
        {
        return true;
    }
        else
        return false;
    }
    void display()
    {
        String word;
        System.out.println("the sentence is"+sent);
        StringTokenizer st=new StringTokenizer(sent);
        int b=st.countTokens();
        System.out.println(b);
        for(int i=1;i<=b;i++)
        {
        word=st.nextToken();
        System.out.print(word+" ");
        if(iscap(word))
        freq++;
    }
     System.out.println(freq);   
    }
    public static void main(String args[])
    {
        cap ob=new cap();
        ob.input();
        ob.display();
    }
}




















