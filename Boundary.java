import java.util.Scanner;
class Boundary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("M = ");
int m = sc.nextInt();
System.out.print("N= ");
int n = sc.nextInt();
if (m<2||m>8||n<2||n>8)
{
    System.out.println("INVALID");
}
else
{
int a[][] = new int[m][n];
int sum = 0;

System.out.println("Enter integers:");
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
a[i][j] = sc.nextInt();
if(i == 0 || j == 0 || i == m - 1 || j == n - 1)
sum =sum+ a[i][j];
}
}
System.out.println("ORIGINAL MATRIX");
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("SUM OF THE BOUNDARY ELEMENTS (UNSORTED) =" + sum);
int b[] = new int[m*n];
int index = 0;
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
b[index++]=a[i][j];
}
}
int l=b.length;
for(int i=0; i<l-1; i++)
{
for(int j=0; j<l-i-1; j++)
{
if(b[i] < b[j+1])
{
int temp = b[i];
b[i] = b[j+1];
b[j+1] = temp;
}
}
}
index=0;
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
a[i][j]=b[index++];
}
}
sum=0;
System.out.println("SORTED MATRIX:");
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
System.out.print(a[i][j]+"\t");
if(i == 0 || j == 0 || i == m - 1 || j == n - 1)
sum += a[i][j];
}
System.out.println();
}
System.out.println("SUM OF THE BOUNDARY ELEMENTS (SORTED) = "+ sum);
}
}
}
