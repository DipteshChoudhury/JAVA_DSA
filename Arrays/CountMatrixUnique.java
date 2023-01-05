
import java.util.*;

public class CountMatrixUnique {
    public static void printCountUniqueEle(int[][] mat){
        int eleCount=0;

        for(int i=0; i<mat.length; i++){
            eleCount = 0;
            for(int j=0; j<mat[0].length; j++){
                int temp=0;
                for(int e : mat[i]){
                    if(mat[i][j] == e){
                        temp++;
                    }
                }
                if(temp==1){
                    eleCount++;
                }
            }
            System.out.println(i+"th Row have "+eleCount+" distinct elements.");
        }
    }
    public static int[][] createMatrix(){
        int r,c;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter row and column :- ");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] arr = new int[r][c];
        for(int i=0;i<r; i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return arr;
    }

    public static void displayMat(int[][] a){
        for(int i=0;i<a.length; i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = createMatrix();
        displayMat(mat);
        printCountUniqueEle(mat);
        sc.close();
    }
}
