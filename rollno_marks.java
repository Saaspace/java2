//binaryinput
import java.io.*;
public class rollno_marks
{
    static String fileName1 = "stu.dat";
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin=new BufferedReader(isr);
    static String fileName2 = "toppers.dat";
    public static void main(String args[])
    {
        boolean EOF=false;
        try
       {
            FileOutputStream fw = new FileOutputStream(fileName2);
            DataOutputStream dw = new DataOutputStream(fw);
            FileInputStream fr = new FileInputStream("d:\fileName1");
            DataInputStream dr = new DataInputStream(fr);
            while(!EOF)
            {
                try
                {
               int rno;float marks;
                rno = dr.readInt();
                    marks = dr.readFloat();
                            if(marks>75)
               {
                    dw.writeInt(rno);
                dw.writeFloat(marks);
            }
                  
            }
        catch(EOFException el)
        {
            System.out.println("end of the file");
            EOF=true;
        }
         catch(IOException e)
    {
    System.err.println(e);
}
}
}
catch(FileNotFoundException e)
{
    System.out.println("File not Found");
}
}
}
   

    