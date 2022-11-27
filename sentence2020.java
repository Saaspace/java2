//sentence2020
import java.util.Scanner;
class sentence2020
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch,w;
        String s;
        String S;
        
        String t,west,west1;
        int l,temp,temp1,z,v,i,j,k,p,h,start=0;
        int nwords=0;
        System.out.println("Enter the sentence which may be terminated either by . ! ? only");
        s=sc.nextLine();
        l=s.length();
        String word[]=new String[l];
        String original[]=new String[l];
        int alpha[]=new int[l];
        ch=s.charAt(l-1);
        if((ch!='.')&&(ch!='?')&&(ch!='!'))
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            for(i=0;i<l;i++)
            {
                if(s.charAt(i)==' '||s.charAt(i)=='.')
                {
                    original[nwords]=s.substring(start,i);
                    word[nwords]=original[nwords];
                    alpha[nwords]=(original[nwords]).length();
                    nwords++;
                    start=i+1;
                }
            }
            for(i=0;i<nwords;i++)
            {
                for(j=i+1;j<nwords-i-1;j++)
                {
                    if(alpha[i]>alpha[j])
                    {
                        temp=alpha[i];
                        alpha[i]=alpha[j];
                        alpha[j]=temp;
                        t=word[i];
                        word[i]=word[j];
                        word[j]=t;
                       }
                    }
                }
            for(h=0;h<nwords;h++)
            {
                System.out.print(original[h]);
            }
            System.out.println();
            for(int q=0;q<nwords;q++)
            {
                System.out.print(word[h]);
            }
        }
    }
}

            
            



        
                
            
                
                 
            
            
                
                 
                
            
        
        
    
        
        
        
        
        
        
        
        
        
