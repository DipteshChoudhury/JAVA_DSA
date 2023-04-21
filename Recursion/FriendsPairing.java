/*{
 * FRIEND PAIRINNG PROBLE
 *
 * Program : Given n friends, each one can remain single can be paired up with some other friend. Each friend 
 *           can be paired only once. Find out the total no. of ways in which friends can remain single or 
 *           can be paired up.
 *
 * Time Complexity :- O()
 * Space Complexity :-
 * //paytm
 * }
 */

import java.util.*;

class FriendsPairing {
    public static int friendsPairing(int n) {

        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Description for ways
        // //choice for singles (ways)
        // int frndSingle = friendsPairing(n-1);

        // //choice for pairs
        // int frndPair = (n-1) * friendsPairing(n-2);

        // return frndSingle + frndPair ;
        //

        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // no. of friends
        System.out.print("Enter no. of friends : ");
        int n = sc.nextInt();

        System.out.println("No. of ways : " + friendsPairing(n));
        
        sc.close();
    }
}
