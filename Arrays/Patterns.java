import java.util.*;

public class Patterns {
    static void Butterfly(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=n+1-i; sp>0; sp--){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=0; sp<n+1-i; sp++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void diamond(int n){
         for(int i=0; i<n; i++){
            for(int sp=0; sp<n+1-i; sp++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*   ");
            }
            System.out.println();
         }
         for(int i=n-1; i>0; i--){
            for(int sp=n+1-i; sp>=0; sp--){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*   ");
            }
            System.out.println();
         }
    }
    static void square(int n){
        
        for(int i=n; i>=1; i--){
            for(int j=n; j>=1; j--){
                if(i>=j){
                    System.out.print(i+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            for(int j=2; j<=n; j++){
                if(i>=j){
                    System.out.print(i+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=n; j>=1; j--){
                if(i>j){
                    System.out.print(i+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            for(int j=2; j<=n; j++){
                if(i>j){
                    System.out.print(i+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int n){
        for(int i=0; i<=n; i++){
            for(int sp=n-i; sp>0; sp--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void  holoSquare(int n){
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a no. of lines :-");
        int n = sc.nextInt();
        sc.close();
        
        //patterns
        Butterfly(n);
        diamond(n);
        square(n);
        triangle(n);
        holoSquare(n);
    }
}
