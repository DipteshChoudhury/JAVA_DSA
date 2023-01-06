/*
*Program :-Given a route containing 4 directions(E,W,N,S) find the shortest path to reach destination.
*Time complexity :- O(n)
*/

import java.util.*;

public class ShortestPathEWNS {
    static int shortPath(String s){
        char ch;
        int x=0,y=0;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch == 'e' || ch == 'E'){
                x++;
            }
            if(ch == 'w' || ch == 'W'){
                x--;
            }
            if(ch == 'n' || ch == 'N'){
                y++;
            }
            if(ch == 's' || ch == 'S'){
                y--;
            }
        }

        return (int) Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path (must only E,W,N,S) :- ");
        String pathDirection = sc.nextLine();

        System.out.println("The displacement of "+pathDirection+" is "+shortPath(pathDirection)+" units.");

        sc.close();
    }
}
