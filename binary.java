//search
import java.util.*;
class binary
{
    int a[];
    int n;
    int l;
    int search;
    int u;
    int mid;
    binary(int nn)
    {
        n=nn;
        a=new int[nn];
        l=0;
        u=n-1;
    }
    void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elments");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    int binary_search(int v)
    {
        if(l>u)
        return -1;
        else
        {
        mid=(l+u)/2;
        if(a[mid]>v)
        {
            u=mid-1;
            return binary_search(v);
        }
        else if(a[mid]<v)
        {
            l=mid+1;
            return binary_search(v);
        }
        else
        return mid;
    }
}
    void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        search=sc.nextInt();
        if(binary_search(search)==-1)
        System.out.println("Element not found");
        else
        System.out.println("elment found"+" "+mid);
    }
    public static void main(String args[])
    {
        binary ob=new binary(5);
        ob.readdata();
        ob.search();
    }
}





