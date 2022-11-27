import java.io.*;

public class sentence{

       public static void main(String[] args) throws IOException{

               String Sentence;

               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

               do {

               System.out.println("Enter the sentence:");

               Sentence=br.readLine();

               if( Sentence.charAt(Sentence.length()-1)!= '.' && Sentence.charAt(Sentence.length()-1)!= '?' && Sentence.charAt(Sentence.length()-1)!= '!')

                  System.out.println("INVALID INPUT:,TRY AGAIN");

               } while(Sentence.charAt(Sentence.length()-1)!= '.' && Sentence.charAt(Sentence.length()-1)!= '?' && Sentence.charAt(Sentence.length()-1)!= '!');

               SenetenceSort obj = new SenetenceSort(Sentence);

               obj.wordExtractor();

               obj.sortWords();

               System.out.println("OUTPUT:");

               obj.display();

               br.close();

       }

}

class SenetenceSort{

       public void display() {

              for(int i = 0;i<word_counter;i++) {

                     if(i==word_counter-1)

                           System.out.print(word_Storage[i]+msg.charAt(msg.length()-1));

                     else

                           System.out.print(word_Storage[i]+" ");

                     }

       }

       public void sortWords() {

              String temp;

              int i,j;

              for(i = 0;i<word_counter-1; i++)     

                       for (j = 0; j < word_counter-i-1; j++)

                         if (word_Storage[j].length() >= word_Storage[j+1].length()) { // sorting length wise

                              temp=word_Storage[j+1];

                            word_Storage[j+1]=word_Storage[j];

                            word_Storage[j]=temp;

                            }

              for(i = 0;i<word_counter-1; i++)     

                       for (j = 0; j < word_counter-i-1; j++)

                             if(word_Storage[j].length() == word_Storage[j+1].length()) { // if lengths are equal sort alphabetically

                         if(word_Storage[j].compareTo(word_Storage[j+1])>0) {

                            temp=word_Storage[j+1];

                                     word_Storage[j+1]=word_Storage[j];

                                     word_Storage[j]=temp;

                            }

                                  }

              }

      

       public void wordExtractor() {

              int i;

              //counting the number of words

              for(i=0;i<msg.length();i++)

                if(msg.charAt(i)== ' ')

                       word_counter++;

              word_counter +=1; // In any sentence, number of words is 1 greater than the number of spaces

              word_Storage = new String[word_counter];

              int k = 0;

              //extracting words

              for(i=0;i<msg.length();i++) {

                word_Storage[k]="";

                while(msg.charAt(i) != ' ' &&  i < msg.length()-1) { 

                             word_Storage[k] +=msg.charAt(i);

                             i++;

                            }

                k++;

                       } // end of i-loop

                     }

     

      

       SenetenceSort(String Sentence){

              msg=Sentence;

              word_counter=0;

       }

       private String msg;

       private int word_counter;

       private String[] word_Storage;

}
