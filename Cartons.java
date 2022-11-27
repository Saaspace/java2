import java.io.*;
class Cartons{
    public static void main(String args[])
    throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        if(n > 1000){
            System.out.println("INVALID INPUT");
            return;
        }
        int num = n;
        int c48 = n / 48;
        if(c48 > 0)
            System.out.println("48 x " + c48 + " = " + (c48 * 48));
        n %= 48;
        int c24 = n / 24;
        if(c24 > 0)
            System.out.println("24 x " + c24 + " = " + (c24 * 24));
        n %= 24;
        int c12 = n / 12;
        if(c12 > 0)
            System.out.println("12 x " + c12 + " = " + (c12 * 12));
        n %= 12;
        int c6 = n / 6;
        if(c6 > 0)
            System.out.println("6 x " + c6 + " = " + (c6 * 6));
        n %= 6;
        if(n == 0)
            System.out.println("Remaining boxes = 0");
        else
            System.out.println("Remaining boxes = " + n + " x 1 = " + n);
        System.out.println("Total number of boxes = " + num);
        int total = c48 + c24 + c12 + c6;
        if(n > 0)
            total++;
        System.out.println("Total number of cartons = " + total);
    }
}
