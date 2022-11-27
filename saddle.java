//saddle
import java.util.Scanner;
class saddle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        int temp;
        System.out.println("Enter the value for n;");
        int n=sc.nextInt();
        if(n>20)
        {
            System.out.println("INVALID");
        }
        else
        {
        int A[][]=new int[n][n];
        System.out.println("ENter the elements in matrix");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
         for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        int rmin,mink,minl,c;
        for(int k=0;k<n;k++)
        {
            rmin=A[k][0];
            c=0;
            for(int l=0;l<n-1;l++)
            {
                if(A[k][0]>A[k][l+1])
                rmin=A[k][l];
                c=l;
            }
            for(int m=0;m<n;m++)
            {
                if(rmin>A[m][c])
                found=true;
                break;
            }
        }
        if(found==true)
        {
           System.out.println("SADDLE POINT FOUND");
           for(int i=0;i<n-1;i++)
           {
               for(int j=1;j<n;j++)
               {
               if(A[i][i]>A[j][j])
               {
                   temp=A[i][i];
                   A[i][i]=A[j][j];
                   A[j][j]=temp;
                }
            }
        }
        System.out.println("Sorted");
        for(int i=0;i<n;i++)
           {
               for(int j=0;j<n;j++)
               {
                   System.out.print(A[i][j]);
                }
                System.out.println();
            }
    }
    else
    {
        System.out.println("SADDLE POINT NOT FOUND");
        for(int i=0;i<n-1;i++)
        {
            for(int j=n;j>0;j--)
            {
                if(A[i][j]>A[i+1][j-1])
                {
                   temp=A[i][j];
                   A[i][j]=A[i+1][j-1];
                   A[i+1][j-1]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print(A[i][j]);   
            }
            System.out.println();
        }
    }
}
}
}