class ArrayAsArg{
    public static void update(int marks[]){

        //update mark by 1
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1 ;
        }
    }
    public static void main(String args[]) {
        int marks[] ={97,98,99};

        update(marks);   //call update function

        //print marks

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}