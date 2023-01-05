
class LeanerSearchArray {

    public static int searchEle(int a[]){
        int key = 10;

        //searching
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return (i+1);
            }
        }
        return (-1);
    }
    public static void main(String[] args) {
        int a[] ={2,4,6,10,12,14,50,24,53};
        int index = searchEle(a);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is found at index "+index);
        }

    }
}
