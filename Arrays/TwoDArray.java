import java.util.*;

public class TwoDArray {
    public static void largeSmallEle(int[][] a){
        int large=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
        for(int i=0;i<a.length; i++){
            for(int j=0;j<a[0].length;j++){
                if(large < a[i][j]){
                    large = a[i][j];
                }
                if(small > a[i][j]){
                    small = a[i][j];
                }
            }
        }
        System.out.println("Largest Element :- "+large+"\nSmallest element :- "+small);
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
        int[][] arr= createMatrix();
        displayMat(arr);
        largeSmallEle(arr);
    }
}
