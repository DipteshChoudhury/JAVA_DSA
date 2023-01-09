/*
 * Program  :- String Compression (when you compress a string, and the consecutive duplicates of each string are replaced with the character, followed by the consecutive, repeated character count)
 */
import java.util.*;

public class StringCompression {
    static String compress(String s){
        
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<s.length(); i++){
            Integer count = 1;
            sb.append(s.charAt(i));

            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            
            sb.append(count.toString());

        }

        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :- ");
        String str = sc.nextLine();

        System.out.println("Compressed String is :- "+compress(str));
        
        sc.close();
    }
}
