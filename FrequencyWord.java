import java.util.Scanner;
public class FrequencyWord
{
  public static void main(String args[])
  {
      String s;
      String r;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of sentences:");
  int a=sc.nextInt();
  r=sc.nextLine();
    if((a>=1)&&(a<=4))
     {
        System.out.println("Enter the paragraph");
        s=sc.nextLine();
        char ch;
        int l=s.length();
        String word[]=new String[l];
        int v=0,count=0;
        for(int i=0;i<l;i++) //extract each word to array
        {
            ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch==',') 
            {
                word[count]=s.substring(v,i);
                 v=i+1;
                count++;
            }
        }
        int freq[]=new int[count];
       System.out.println("Total number of words:"+count);
       
       for(int j=0;j<count;j++)//counting frequency of each word
         {
             freq[j]=0;
             for(int k=0;k<count;k++)
             {
              if(word[j].equals(word[k]))
              {
               freq[j]++;
              }
            }
        }
        
        String w[]=new String[count];
        int f[]=new int[count];
        int z=0,temp;
        String t;
        for(int i=0;i<count-1;i++)
          {
            for(int m=i+1;m<count;m++)
             {
                 if(word[i].equals(word[m]))
                  freq[m]=0;
                }
         }
         
          for(int m=0;m<count;m++)
           {
               if(freq[m]!=0)
                {
                  w[z]=word[m];
                  f[z]=freq[m];
                  z++;
                }
            }
            for(int i=0;i<z;i++)
             {
                 for(int m=0;m<z-i-1;m++)
                  {
                      if(f[m]>f[m+1])
                       {
                         temp=f[m+1];
                         f[m+1]=f[m];
                         f[m]=temp;
                         t=w[m+1];
                         w[m+1]=w[m];
                        w[m]=t;
                      }
                }
            }
           System.out.println("WORD\tFREQUENCY");
            for(int i=0;i<z;i++)
             {
              System.out.println(w[i]+"\t"+f[i]);
            }
        }
        else
        System.out.println("INVALID INPUT");
    }
}
