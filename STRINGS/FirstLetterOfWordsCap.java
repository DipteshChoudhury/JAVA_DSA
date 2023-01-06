/*
 * Program :- For a given a string convert each the first letter of each word to uppercase 
 * Time Complexity :- O(n)
 */
import java.util.*;

public class FirstLetterOfWordsCap {
    static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        //char ch = Character.toUpperCase(0);
        //sb.append(ch);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
 
        System.out.print("Enter the String :- ");
        String str =sc.nextLine();  
        System.out.println("Before Converting :-\n"+str);

        System.out.println("After Converting :-\n"+toUpperCase(str));
        sc.close();
    }
}
