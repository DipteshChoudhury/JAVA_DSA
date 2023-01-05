import java.util.*;

public class JaggedArray {

    public static int[][] createJagged(){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter no. of rows :- ");
       int r = sc.nextInt();
       int[][] arr = new int[r][];

       for(int i=0; i<r;i++){
            System.out.print("Enter no. of elements in "+i+" row :- ");
            arr[i] = new int[sc.nextInt()];
            System.out.print(" Enter element");
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
       }
       sc.close(); 
       return arr;
    }
    public static void displayJagged(int[][] a){
        for(int i=0; i<a.length;i++){
                for(int j=0; j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
           }
    }
    public static void main(String[] args) {
        int[][] jag = createJagged();

        System.out.println("The jaged array is :-");
        displayJagged(jag); 
    }
}
