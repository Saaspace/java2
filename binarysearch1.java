//binarysearch
import java.util.Scanner;
class binarysearch1
{
    static int BinarySearch(int a[],int lb,int ub,int x)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value for n");
        n=sc.nextInt();
        lb=0;
        ub=n-1;
        int mid=lb+(ub-lb)/2;
        if(a[lb]>a[ub])
        {
        return -1;
    }
        if(x==a[mid])
        {
        return mid;
    }
        else if (x<a[mid])
        {
        return BinarySearch(a , lb,mid-1,x);
    }
        else
        {
        return BinarySearch(a, mid+1,ub,x);
    }
}
    public static void main(String args[])
    {
      int lb,ub,mid,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value for n");
      n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
      System.out.print("Enter the elements in a sorted manner"+i);
      a[i]=sc.nextInt();
    }
    lb=0;
    ub=n-1;
     System.out.println("Enter the element to be search");
     int x=sc.nextInt();
      int result;
      result= BinarySearch(a,lb,ub,x);
      if(result==-1)
      System.out.println("Element not found");
      else
      System.out.println("ELement found");
    }
}
