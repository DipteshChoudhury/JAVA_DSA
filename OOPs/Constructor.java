
/*
 *Constructor :- it is a method/ function . It must call one time (when object created)
 * 
 * Types of Constreuctor:
 *  ->Non-parameterized :-no parameter
 *  ->Parameterized     :-Having parameter
 *  ->Copy Constructor  :-It copies the one object data to another object (we have to create it)
 * 
 * Constructor overloading :- polymorphism
 */

public class Constructor {
    String name;
    int roll;

    Constructor() {
        // It is a default constructor (if user not defained in code then by default
        // java will assign it)
        System.out.println("\"con1\" calls Default Constructor.....");
    }

    Constructor(String name) {
        // It is a parameterized constructor (if user not defained in code then by
        // default java will assign it)
        System.out.println("\"con3\" calls Parameterized Constructor(of String parameter).....");
        this.name = name;
    }

    Constructor(int roll) {
        // It is a parameterized constructor (if user not defained in code then by

        System.out.println("\"con3\" calls Parameterized Constructor(of integer parameter).....");
        this.roll = roll;
    }

    Constructor(Constructor obj) {
        // it has parameter as object

        System.out.println("\"con4\" is copying the data of con3");
        this.name = obj.name;
        this.roll = obj.roll;
    }

    public static void main(String[] args) {

        // Creatng object it calls constructor for initialization

        // Calling default constructor
        Constructor con1 = new Constructor();

        // Calling parameterised Costructor of String
        Constructor con2 = new Constructor("Diptesh");

        // Calling Parameterized constructor of integer parameter
        Constructor con3 = new Constructor(5);

        // There are no such constructor so it shows error
        // Constructor con4 = new Constructor("Hello",10)

        con3.name = "Diptesh";
        con3.roll = 5;

        // Calling copy constructor
        Constructor con4 = new Constructor(con3);

    }
}
