/*
 * Shallow Copy Constructor:-When we do a copy of some entity to create two or more than two entities such that 
 *                           changes in one entity are reflected in the other entities as well, then we can say 
 *                           we have done a shallow copy. In shallow copy, new memory allocation never happens 
 *                           for the other entities, and the only reference is copied to the other entities.
 * 
 * Deep Copy Constructor    :-When we do a copy of some entity to create two or more than two entities such that 
 *                            changes in one entity are not reflected in the other entities, then we can say we 
 *                            have done a deep copy. In the deep copy, a new memory allocation happens for the 
 *                            other entities, and reference is not copied to the other entities. Each entity has
 *                            its own independent reference.
 * 
 * Lazy Copy Constructor    :-A lazy copy can be defined as a combination of both shallow copy and deep copy. 
 *                            The mechanism follows a simple approach – at the initial state, shallow copy 
 *                            approach is used. A counter is also used to keep a track on how many objects share
 *                            the data. When the program wants to modify the original object, it checks whether 
 *                            the object is shared or not. If the object is shared, then the deep copy mechanism
 *                            is initiated.
 * 
 */
//package OOPs;

class ShallowCopy {
    String name;
    int roll[];

    ShallowCopy() {
        name = "Diptesh";
        this.roll=[1,2,3,4,5];
    }

    ShallowCopy(ShallowCopy s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    void display() {
        System.out.println("Roll no. " + roll + " is " + name);
    }
}

class DeepCopy {
    String name = "hellow";
    int n[] = { 1, 2, 3, 5 };

    DeepCopy() {

    }

}

public class ShallowDeepLazyCopyConstructor {
    public static void main(String[] args) {
        // Shallow Copy Example

        ShallowCopy s1 = new ShallowCopy();
        s1.display();

        // Here the shallow copy constructor call and the refferences store
        ShallowCopy s2 = new ShallowCopy(s1);
        s2.display();
        s2.roll = 5;
        // after updation
        s2.display();

        // Here Deep Copy constructor calls
    }
}
