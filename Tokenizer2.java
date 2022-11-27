
import java.util.*; 
public class Tokenizer2 
{ 
    public static void main(String args[]) 
    { 
        String mydelim = " : "; 
        String mystr = "JAVA : Code : String : Tokenizer : Geeks"; 
  
       
        StringTokenizer geeks3 = new StringTokenizer(mystr, mydelim);  
        int count = geeks3.countTokens(); 
        System.out.println("Number of tokens : " + count + "\n"); 
        for (int i = 0; i <count; i++) 
            System.out.println("token at [" + i + "] : " + geeks3.nextToken());
        while (geeks3.hasMoreTokens()) 
            System.out.println(geeks3.nextToken()); 
    } 
}