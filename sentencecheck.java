import java.util.Scanner;
class sentencecheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch,w;
        String s;
        String S;
        
        String t,west;
        int l,temp,z,v,i,j,k,p;
        int nwords=0;
        System.out.println("Enter the sentence which may be terminated either by . ! ? only");
        s=sc.nextLine();
        l=s.length();
        String word[]=new String[l];
        String original[]=new String[l];
        int alpha[]=new int[l];
        ch=s.charAt(l-1);
        if(ch!='.')
        {
            System.out.println("Invalid");
        }
            else
            {
            for(i=0;i<l;i++)
            {
             
             v=0;
             
             w=s.charAt(i);
             if(w==' '||w=='.'||w=='!'||w=='?')
             {
                 word[nwords]=s.substring(v,i);
                 west=s.substring(v,i);
                 z=west.length();
                 alpha[nwords]=z;
                 nwords++;
                 v=i+1;
                original[i]=word[nwords];
            }
        }
            
            for(j=0;j<nwords;j++)
            {
                for(k=0;k<nwords-j-1;k++)
                {
                    if(alpha[k]>alpha[k+1])
                    {
                        temp=alpha[k];
                        alpha[k]=alpha[k+1];
                        alpha[k+1]=temp;
                        t=word[k];
                        word[k]=word[k+1];
                        word[k+1]=t;
                    }
                }
            }
        
            for ( p=0;p<nwords;p++)
            System.out.println(original[p]);
            System.out.print(word[p]);
        }
    }
}