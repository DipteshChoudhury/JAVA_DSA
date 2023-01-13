
public class ClassObjects{
    public static void main(String[] args) {
        Pen p1 = new Pen();  //created a pen object using Pen() constructor
        p1.setColor("Blue");    //using function call
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";    //direct assigning
        System.out.println(p1.color);
    }
}

class Pen{
    //Define Properties & function of pen

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip =  newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;   //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math) /3 ;
    }
}
