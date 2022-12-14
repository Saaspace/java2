import java.util.*;
public class CopyOfmatrix{
       public static void main(String[] args) {
             int N;
             Scanner in = new Scanner(System.in);
             do {
                 System.out.println("Enter the value of N:");
                 N = in.nextInt();
                 if(N <= 2 || N >= 10)
                              System.out.println("INVALID INPUT:");
                 }while(N < 1 || N > 366);
             Matrix obj = new Matrix(N);
             System.out.println("Enter the elements of single dimensional array:");
             obj.inputSingleDimArray();
             obj.SortMatrix();
             obj.inputElementsToTwoDimMatrix();
             obj.displayMatrix();
             in.close();
             }
       }
     
class Matrix{
       Matrix(int N){
             order = N;
             single_dim_array = new int[order];
             Mat = new int[order][order];
       }
       public void inputElementsToTwoDimMatrix() {
           for(int i = 0; i < order; i++) {
                for(int j = 0; j < order; j++) {
                        if(i+j < order)
                          Mat[i][j]=single_dim_array[j];
                        else
                          Mat[i][j]=single_dim_array[(i+j)-order];
                  }
           }
         
     }
      
       public void inputSingleDimArray() {
          Scanner in = new Scanner(System.in);
          for(int i=0;i<order;i++) {
                single_dim_array[i]=in.nextInt();
                if(single_dim_array[i] <= 0) {
                     System.out.println("Only positive values allowed,enter the value again:");
                     i--;
                     continue;
                 }
              }
          in.close();
       }
       public void SortMatrix() {
             int temp;
             for (int i =0;i<order;i++) {
             for(int j=i;j<order;j++) {
                     if(single_dim_array[i] > single_dim_array[j]) {
                           temp = single_dim_array[j];
                         single_dim_array[j]=single_dim_array[i];
                         single_dim_array[i]=temp;
                         }
                  }
              }        
        }
     
       public void displayMatrix() {
            System.out.println("SINGLE DIMENSIONAL ARRAY AFTER SORTING:");
            for(int k=0;k<order;k++)
               System.out.print(" "+single_dim_array[k]);
            System.out.println();
            System.out.println("TWO DIMENSIONAL MATRIX:");
             for(int i = 0; i < order; i++) {
                    for(int j = 0; j < order; j++) {
                          System.out.print(Mat[i][j]+"  ");
                    }
                    System.out.println();
             }
       }
     
       private int[][] Mat;
       private int[] single_dim_array;
       private int order;
       }
