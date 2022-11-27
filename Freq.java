import java.util.Scanner;
public class Freq
{
  public static void main(String args[])
  {
      String s="";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of sentences:");
      int a=sc.nextInt();
      if((a>=1)&&(a<=4))
     {
        System.out.println("Enter the paragraph");
        s=sc.nextLine();
     }
     System.out.println(s);
    }
}
