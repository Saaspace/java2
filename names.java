//names
import java.io.*;
class names
{
   public static void main(String args[])throws IOException
   {
       FileReader file=new FileReader("d:/names.txt");
       BufferedReader fileInput=new BufferedReader(file);
       String text;
       //Read file and output
       int i=0;
       while((text=fileInput.readLine())!=null)
       {
           i++;
           System.out.print("names"+i+":");
           System.out.println(text);
        }
        
        fileInput.close();
    }
}