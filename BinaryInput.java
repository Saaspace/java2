//binaryinput
import java.io.*;
public class BinaryInput
{
    static String fileName = "stu.dat";
    public static void main(String args[])
    {
        boolean EOF=false;
        try
       {
            FileInputStream fr = new FileInputStream(fileName);
            DataInputStream dr = new DataInputStream(fr);
            while(!EOF)
            {
                try
                {
               int rno;float marks;
               rno = dr.readInt();
               System.out.println("Rollno:"+rno);
               marks = dr.readFloat();
               System.out.println("marks:"+marks);
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
            
                
    