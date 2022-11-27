//binaryoutput
import java.io.*;
public class BinaryOutput
{
    static String fileName = "stu.dat";
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin=new BufferedReader(isr);
    public static void main(String args[])
    {
        try
        {
            int rno;float marks;
            FileOutputStream fw = new FileOutputStream(fileName);
            DataOutputStream dw = new DataOutputStream(fw);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter rollno:");
                rno=Integer.parseInt(stdin.readLine());
                System.out.println("Enter marks");
                marks=Float.parseFloat(stdin.readLine());
                dw.writeInt(rno);
                dw.writeFloat(marks);
            }
            dw.close();
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
            
                
    