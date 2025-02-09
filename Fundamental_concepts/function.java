package Fundamental_concepts;

//infinite loop by do while function
public class function {
    public static void infinite(){
        int i=1;
        do{
           System.out.print(i); 
        }while(true);
    }
    public static void main(String[] args){
        infinite();
    }
}


//enter th enunmber and display the poseitive and negative and zero
// import java.util.*;
// public class function{
//     public static void display(int n){
//         int even=0;
//         int odd=0;
//         int zero=0;
//         Scanner sc=new Scanner(System.in);
//         for (int i=0;i<n;i++){
//            int m=sc.nextInt(); 
//            if (m%2==0){
//             even++;
//            }
//            else if (m%2==1){
//             odd++;
//            }
//            else{
//             zero++;
//            }
//         }
//         System.out.print("even , odd and zero is:"+ even +" "+ odd +" " + zero);
        
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         display(n);
//     }
// }


//writw a profram of function and find the value of one number raised the power of another i.e x ki power n
// import java.util.*;
// public class function{
//     public static int calc(int x , int n){
//         int a=1;
//         for(int i=1; i<=n; i++){
//             a=a*x;
//         } 
//         return a; 
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int n=sc.nextInt();
//         System.out.print(calc(x,n));
//     }
// }

//gcd
// import java.util.*;
// public class function{
//     public static void gcd(int a,int b){
//         int c,h;
//         if (a>b){
//             c=a;
//         }
//         else{
//             c=b;
//         }
//         for(int i=c;i>0;i--){
//             if ((a%i==0)&&(b%i==0)){
//                h=i;
//                System.out.println(h);      
//                break;
//             }   
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         gcd(a,b);
//     }
// }

//fabanacci series
// import java.util.*;
// public class function{
//     public static void fab(int n){
//         int a,b,c;
//         a=0;
//         b=1;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=2;i<=n;i++){
//             c=a+b;
//             System.out.println(c);
//             a=b;
//             b=c;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         fab(n);
//     }
// }