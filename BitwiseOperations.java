
/*
 * BITWISE OPERATOR:
 * Bitwise Not(!)        :It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 
 * Bitwise And(&)        :It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0. 
 * Bitwise Or(|)         :It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0.
 * Bitwise Xor(^)        :It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. 
 * Bitwise Left shift(<<):The left shift operator moves all bits by a given number of bits to the left.
 * Bitwise Right shift(>>):The right shift operator moves all bits by a given number of bits to the right.
 * Bitwise   "      "(>>>):	It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
 */

public class BitwiseOperations {
  
  public static void bitOperators(){
    String binary[]={
      "0000","0001","0010","0011","0100","0101",
      "0110","0111","1000","1001","1010",
      "1011","1100","1101","1110","1111"
    };
   
    // initializing the values of a and b
    int a=3; // 0+2+1 or 0011 in binary
    int b=6; // 4+2+0 or 0110 in binary
    
    // bitwise or
    int c= a | b;
    
    // bitwise and
    int d= a & b;
    
    // bitwise xor
    int e= a ^ b;
    
    // bitwise not
    int f= (~a & b)|(a &~b);
    int g= ~a & 0x0f;
    
    
    System.out.println(" a= "+binary[a]);
    System.out.println(" b= "+binary[b]);
    System.out.println(" a|b= "+binary[c]);
    System.out.println(" a&b= "+binary[d]);
    System.out.println(" a^b= "+binary[e]);
    System.out.println("~a & b|a&~b= "+binary[f]);
    System.out.println("~a= "+binary[g]);
  }
  public static void isOddEven(int n){
    int bitMask = 1;
    
    if((n & bitMask) == 0){
      //even
      System.out.println("Even Num");
    }else{
      System.out.println("Odd Num");
    }
  }

  public static int getIthBit(int n, int i){
    int bitMask = 1<<i;

    if((n & bitMask) == 0){
      return 0;
    }else{
      return 1;
    }
  }

  public static int setIthBit(int n,int i){
    int bitMask = 1<<i ;

    return (n | bitMask);
  }

  public static int clearIthBit(int n, int i){
    int BitMask = ~(1<<i);

    return (n & BitMask);
  }
  public static int updateIthBit(int n, int i,int newbit){
    /*
    if(newBit == 0){
      return clearBit(n,i);
    }else{
      return setIthBit(n,i);
    }

     */
    
    n = clearIthBit(n, i);
    int BitMask = newbit<<i;

    return (n | BitMask);
  }

  public static int clearLastIBits(int n,int i){
    int bitMask = (~0)<<i; //=(-1)<<i

    return(n & bitMask);
  }

  public static int clearRangeBits(int n,int i, int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a| b;

    return (n & bitMask);
  }

  public static boolean isPowOf2(int n){
    return (n & (n-1)) == 0;
  }

  public static int countSetBits(int n){  
    //Time complexity :- O(log n)

    int count =0 ;

    while(n != 0){
      if((n & 1) != 0){
        count++;
      }
      n >>= 1;
    }
    return count;
  }

  public static int fastExponentiation(int a,int n){
    //Time Complexity :-O(log n) < O(n^2) in nexted loop
    
    int ans=1;

    while(n > 0){
      if((n&1) != 0){ //check LSB
        ans*= a;
      }
      a *= a;
      n >>= 1;
    }
    return ans;
  }
  public static void main(String[] args) {
    
    //bitOperators();

    //To check a number even or odd using bitwise operator
    isOddEven(5);
    isOddEven(14);

    //To get Ith bit of a decimal num(binary num)
    System.out.println("The bit is :-"+getIthBit(4, 2));

    //To set ith bit of a decimal num(binary num)
    System.out.println("After set bit :-"+setIthBit(10, 2));

    //To clear ith bit of a decimal num (binary num)
    System.out.println("After clear bit :-"+clearIthBit(10, 1));

    //To update the ith bit of a decimal num(binary num)
    System.out.println("After update bit :-"+updateIthBit(10, 2, 1));

    //To clear last(LSB) i bits of a decimal num(binary num)
    System.out.println("After clear i bits :-"+clearIthBit(15, 2));   //doubt in video 

    //To clear range of bits of a decimal num(binaary num)
    System.out.println("After range clear bits :- "+clearRangeBits(10, 2, 4));

    //To check a num is a power of 2 or not ?
    System.out.println("Num is power of 2 :- "+isPowOf2(512));

    //To count set bits in num
    System.out.println("The no. of set bits :- "+countSetBits(10));

    //Fast Exponentiation
    System.out.println("After finding po(a,b) using bitwise :- "+fastExponentiation(3, 5));
  }  
}
