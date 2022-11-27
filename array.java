//array
import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[25];
        int p=1;
        int count=0;
        int flag=0;
        int temp;
        System.out.println("Enter the elements in an aaray");
        for(int i=0;i<25;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<25;j++)
        {
            if(a[j]%2!=0)
            p=p*a[j];
        }
        System.out.println("THe product of all odd numbers of the array are"+p);
        for(int k=0;k<25;k++)
        {
            int m=a[k]/2;
           for(int l=0;k<m;k++) 
           {
               if(a[k]==0||a[k]==1||a[k]%l==0)
               {
               flag++;
            }
            if(flag==0)
            System.out.print(a[k]+" ");
            count++;
            }
        }
        System.out.println("the total prime numbers are"+count);
        for(int n=0;n<25;n++)
        {
            for (int q=1;q<(25-1);q++)
            {
                if(a[q-1]>a[q])
                {
                  temp=a[q-1];
                  a[q-1]=a[q];
                  a[q]=temp;
                }
            }
        }
        System.out.println("THe elemets in ascending order is");
        for( int r=0;r<25;r++)
        {
            System.out.print(a[r]+" ");
        }
    }
}