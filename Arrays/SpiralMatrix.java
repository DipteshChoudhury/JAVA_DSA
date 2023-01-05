import java.util.*;

public class SpiralMatrix {
    public static void printSpiral(int[][] a){
        int startRow = 0, startCol = 0, endRow = a.length-1, endCol = a[0].length-1;

        while(startCol <= endCol && startRow <= endRow){
            
            //print top element of mtrix
            for(int j=startCol;j<=endCol;j++){
                System.out.print(a[startRow][j]+" ");
            }

            //print right element of mtrix
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(a[i][endCol]+" ");
            }

            //print bottom element of mtrix
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break ;
                }
                System.out.print(a[endRow][j]+" ");
            }

            //print left element of mtrix
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break ;
                }
                System.out.print(a[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
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
        int[][] mat = createMatrix();
        displayMat(mat);

        printSpiral(mat);
        
    }
}
