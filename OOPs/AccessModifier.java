import java.lang.management.MemoryType;

/*
 * Access Modifiers     Within class    within package      Outside package by subclass only    outside package
 * ----------------     ------------    --------------      --------------------------------    ---------------
 *  Private         :-      Yes             No                              No                          No
 *  Default         :-      Yes             Yes                             No                          No 
 *  Protected       :-      Yes             Yes                             Yes                         No
 *  Public          :-      Yes             Yes                             Yes                         Yes
 */

public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "DipteshChoudhury";
        // myAcc.password = "abcd1234"; //It shows error of "The field
        // BankAccount.password is not visible"

        myAcc.setPassword("hiIamDC");
    }

}

class BankAccount {
    public String username;
    private String password;
    // We can't access the password variable outside the declared class

    public void setPassword(String pwd) {
        password = pwd;
    }
}