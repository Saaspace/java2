//arrange
import java.util.*;
class arrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,mid,temp,count=0,counterhigh,counterlow;
        System.out.println("Enter the value of no number of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        int ans[]=new int[n];
        int index=n-1;
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                
                if(a[j]>a[j+1])
                {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                }
            }
        }
        //System.out.println("DSorted");
        //for(int o=0;o<n;o++)
            //System.out.println(a[o]);
        if(index%2==0)
        mid=(index/2);
        else
        mid=((index+1)/2);
        counterhigh=mid+1;
        counterlow=mid-1;
        name: for(int k=0;k<n;k++)
        {
            while((counterhigh<=n)&&(counterlow>=0))
            {
        if(count==0)
        {
        ans[mid]=a[k];
        count++;
        continue name;
        }
        if(count%2!=0)
        {
        ans[counterhigh]=a[k];
        counterhigh++;
        count++;
        continue name;
        }
        else
        {
        ans[counterlow]=a[k];
        counterlow--;
        count++;
        continue name;
    }
    }
        }
     System.out.println("THe required array is");
    for(int l=0;l<n;l++)
   System.out.print(ans[l]);
}
}






