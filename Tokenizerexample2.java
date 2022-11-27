import java.io.*;
import java.util.*;
class Tokenizerexample2
{
    public static void main(String args[])throws IOException
    {
        FileReader file=new FileReader("Tokenizerexample2.java");
        StreamTokenizer inputStream=new StreamTokenizer(file);
        int tokenType=0;
        int numberofTokens=-1;
        {
            tokenType=inputStream.nextToken();
            numberofTokens++;
        }
        while (tokenType!= StreamTokenizer.TT_EOF);
        System.out.println("Number of Tokens="+ numberofTokens);
    }
}
      