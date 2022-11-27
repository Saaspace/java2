import java.io.*;
import java.util.StringTokenizer;
class WordWise
{
    private String str;
    public WordWise()
    {
        str = new String();
    }
    public void readSent()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Sentence: ");
        str = br.readLine();
        str = str.toUpperCase();
        str = str.trim();
    }
    public int freqVowel(String w){
        int count = 0;
        for(int i = 0; i < w.length(); i++){
            char ch = w.charAt(i);
            switch(ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                count++;
            }
        }
        return count;
    }
    public void arrange(){
        StringTokenizer st = new StringTokenizer(str, " ,.?!");
        int count = st.countTokens();
        for(int i = 1; i <= count; i++){
            String word = st.nextToken();
            int f = freqVowel(word);
            System.out.println(word + "\t" + f);
        }
    }
    public static void main(String args[])throws IOException{
        WordWise obj = new WordWise();
        obj.readSent();
        obj.arrange();
    }
}