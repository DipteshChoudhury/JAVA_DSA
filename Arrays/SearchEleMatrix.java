/*
 * Program :- To find the key element present in a sorted matrix(both column and row wise)
 */
import java.util.*;

class SearchEleMatrix{
    static boolean stairCaseSearch(int[][] mat,int key){
        int row=0,col=mat[0].length-1;

        while(row < mat.length && col>=0){
            if(mat[row][col] == key){
                System.out.print("("+row+","+col+") index element is found.");
                return true;
            }else if(mat[row][col] < key){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        stairCaseSearch(mat, key);
        sc.close();
    }
}