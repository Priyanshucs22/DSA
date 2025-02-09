// get bit
// import java.util.*;
// public class Bits {
//     public static void main(String[] args){
//         //get
//         Scanner sc = new Scanner(System.in);
//         int pos = sc.nextInt();
//         int n = sc.nextInt();
//         int bitmask = 1<<pos;
//         if ((bitmask & n)==0){
//             System.out.println("bit was zero");
//         }
//         else{
//             System.out.println("bit was one");
//         }
//     }
// }

//set bit
// public class Bits{
//     public static void main(String[] args){
//     int pos = 2;
//     int n = 5;
//     int bitmask = 1<<pos;
//     int newnumber = bitmask | n;
//     System.out.println(newnumber);
//     }
// }

//clear bit
// public class Bits{
//     public static void main(String[] args){
//         int pos = 2;
//         int n = 5;
//         int bitmask = 1<<pos;
//         int newbitmask = ~bitmask;
//         int newnumber = bitmask & n;
//         System.out.println(newnumber);
//     }
// }


//update bit
import java.util.*;
public class Bits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =5;
        int pos = 2;
        int bitmask = 1<<pos;
        int o = sc.nextInt();
        if (o ==1){
            int newbitmask = bitmask | n;
            System.out.print(newbitmask);
        }
        else { 
            int newbitmask = ~bitmask;
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
        sc.close();
    }
}


//program to find the number is a power of two or not
// import java.util.*;
// public class Bits{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if ((a & (a-1))==0){
//             System.out.println("yes it is power of 2's");
//         }
//         else {
//             System.out.println("no it is not power of 2's");
//         }
//     }
// }

//          OR
// import java.util.*;
// public class Bits{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int f=0;
//         while(a!=1){
//             if (a%2!=0){
//                 f=1;
//             }
//             a=a/2;
//         }
//         if (f==0){
//             System.out.println("this no is power of 2's");
//         }
//         else { 
//             System.out.println("no");
//         }
//     }
// }


// function first is decimattobinary ad seconf is binarytodecimal
// public class Bits{
//     public static void d_to_b(int n){
//         StringBuilder sum= new StringBuilder();
//         // String Sum="";
//         while (n!=0){
//             sum.insert(0,n%2);
//             // Sum += n%2;
//             n=n/2;
//         }
//         System.out.println(sum);
//     }
//     public static void b_to_d(String m){
//         int sum=0;
//         for (int i=0; i<m.length(); i++){
//             int a=Character.getNumericValue(m.charAt(i));
//             sum += a * (Math.pow(2,i));
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args){
//         int n=10;
//         String m="1001";
//         d_to_b(n);
//         b_to_d(m);
//     }
// }


//program to count the no of 1's in a binary representation ofa number
// public class Bits{
//     public static void main(String[] args){
//         String s="1001";
//         int c=0;
//         for (int i=0;i<s.length();i++){
//             if (s.charAt(i) == '1'){
//                 c+=1;
//             }    
//         }
//         System.out.println(c);
//     }
// }

//program to toggle a bit postion ='pos' in a number ='n'
// public class Bits{
//     public static void main(String[] args){
//         int pos = 2;
//         int n = 12;
//         int bitmask = 1<<pos;
//         int newnumber = bitmask ^ n;
//         System.out.println(newnumber);
//     }
// }

