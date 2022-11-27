//difference
import java.util.Scanner;
class difference
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,temp;
    System.out.println("Enter the number of elements to be entered in the array");
    n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int c[]=new int[n];
    int d[]=new int[n];
    System.out.println("Enter the elements in the array");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
        c[i]=a[i]-b[i];
    }
    for(int j=0;j<n;j++)
    {
        for (int k=0;k<n-j-1;k++) 
        {
            temp=c[k+1];
            c[k+1]=c[k];
            c[k]=temp;
        }
    }
    for (int k=0;k<n;k++)
    {
        d[k]=a[k]-b[k];
        if(c[0]==d[k])
        {
            System.out.println("the minimum difference"+" "+a[k]+"and"+b[k]+"is"+d[k]);
        }
        else if(c[n-1]==d[k])
        {
            System.out.println("the maximum diff"+" "+a[k]+"and"+b[k]+"is"+d[k]);
        }
    }
}
}













