//matix2020
import java.util.Scanner;
class matrix2021
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,l,temp;
        int sum=0;
        int index=0;
        System.out.println("Enter the value for m");
        m=sc.nextInt();
        System.out.println("Enter the value for n");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        l=m*n;
        int b[]=new int[l];
        if(m<2||m>20||n<2||n>20)
        {
            System.out.println("INVALID");
        }
        else
        {
          System.out.println("ENTER THE ELEMENTS IN THE MATRIX");
          for(i=0;i<m;i++)
          {
              for(j=0;j<n;j++)
              {
               a[i][j]=sc.nextInt();
               System.out.println("ORIGINAL MATRIX:"+a[i][j]);
               if(i==0||j==0||i==m-1||j==n-1)
               {
                   sum=sum+a[i][j];
               }
              }
          }
          System.out.println("SUM OF UNSORTED MATRIX IS"+sum);
          for(i=0;i<m;i++)
          {
              for(j=0;j<n;j++)
              {
                  b[index]=a[i][j];
                  index++;
                }
            }
          for(i=0;i<l-1;i++)
          {
            for(j=i+1;j<l-i-1;j++)
            {
                if(b[i]<b[j])
                {
                   temp=b[i];
                   b[i]=b[j];
                   b[j]=temp;
                }
            }
            }
            sum=0;
            index=0;
            for(i=0;i<m;i++)
          {
            for(j=0;j<n;j++)
            {
                a[i][j]=b[index];
                index++;
                if(i==0||j==0||i==m-1||j==n-1)
                {
                    sum=sum+a[i][j];
                }
            }
           }
             for(i=0;i<m;i++)
          {
            for(j=0;j<n;j++)
            {
           System.out.println("Sum of sorted array is"+sum);
           System.out.println("REARRANGED MATRIX:"+a[i][j]);
        }
    }
        }
    }
}



























