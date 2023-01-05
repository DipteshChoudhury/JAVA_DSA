import java.util.*;

public class DiagonalSumMat {
    static int sumDiagonal(int[][] mat){
        int sum1=0,sum2=0,dSum=0;

        for(int i=0; i<mat.length; i++){
             //sum elements of primary digonal
            sum1 += mat[i][i];

            //sum elements of secondary digonal
            sum2 += mat[mat.length-1-i][i]; 
        }
        dSum = sum1+sum2;
        if(mat.length % 2 != 0){    //check the odd square matrix or not ?? 
            int temp= (mat.length-1)/2;
            dSum -= mat[temp][temp];
        }
        System.out.println("Primary diagonal element sum :-"+sum1+"\nSecondary diagonal element sum :-"+sum2);

        return dSum;
    }
    public static int[][] createMatrix(){
        int r;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter square matrix(row = column)  :- ");
        r = sc.nextInt();

        int[][] arr = new int[r][r];
        for(int i=0;i<r; i++){
            for(int j=0;j<r;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return arr;
    }

    public static void displayMat(int[][] a){
        for(int i=0;i<a.length; i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = createMatrix();

        displayMat(mat);

        System.out.println("\nBoth diagonal element Sum :-"+sumDiagonal(mat));
    }
}
