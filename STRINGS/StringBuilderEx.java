//Time Complexity :- O(n)=O(26) (for this)

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);          //it add the elements at the end of sb
        }
        

        System.out.println(sb);
    }
}
