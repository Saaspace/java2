import java.io.*;
import java.util.*;
class SentencesOrder
{
    String s,str,sarr[],strarr[];
    StringTokenizer st;
    int i,j,n,c,index=0,fre[],index1=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void take() throws IOException
    {
        System.out.println("Enter the Number of sentences:");
        n=Integer.parseInt(br.readLine());
        if(n< 1 || n >4)
        { System.out.println("Wrong Input…");
            return;
        }
        System.out.println("Enter the Paragraph:");
        str=br.readLine();
        st=new StringTokenizer(str,",.? ");
        n=st.countTokens();
        System.out.println("Number of Words in the paragraph="+n);
        sarr=new String[n];
        strarr=new String[n];
        fre=new int[n];
        while(st.hasMoreTokens())
        {
            sarr[index++]=st.nextToken();
        }
        for(i=0;i< index-1;i++)
        {
            for(j=i+1;j< index;j++)
            {
                if(sarr[i].compareTo(sarr[j]) > 0)
                {
                    s=sarr[i];
                    sarr[i]=sarr[j];
                    sarr[j]=s;
                }
            }
        }
        c=1;
        s=sarr[0];
        for(i=1;i< index;i++)
        {
            if(!s.equals(sarr[i]))
            {
                strarr[index1]=s;
                fre[index1++]=c;
                c=1;
                s=sarr[i];
            }
            else
                c++;
        }
        strarr[index1]=s;
        fre[index1++]=c;
        for(i=0;i< index1-1;i++)
        {
            for(j=i+1;j< index1;j++)
            {
                if(fre[i] > fre[j])
                {
                    n=fre[i];
                    fre[i]=fre[j];
                    fre[j]=n;
                    s= strarr[i];
                    strarr[i]=strarr[j];
                    strarr[j]=s;
                }
            }
        }
        System.out.println("WORD          FREQUENCY");
        for(i=0;i< index1;i++)
            System.out.println(strarr[i]+"    "+fre[i]);
    }
}
