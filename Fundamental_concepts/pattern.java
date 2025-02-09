package Fundamental_concepts;

// 1 reverse right angle triangle
// public class pattern {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=i;j<4;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//wholo rhombus
// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         int m=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||i==n||j==1||j==(m)){
//                      System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print("1"+" ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }

// 2
// public class pattern {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//3  
// public class pattern {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<5;k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//4   reverse pyramid
// public class pattern {
//     public static void main(String[] args){
//         for(int i=5;i>0;i--){
//             for(int j=0;j<5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<(2*i-1);k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//5    
// public class pattern {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<(2*5-2*i)+1;k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// //5 reverse 
// public class pattern {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=i;j<5;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<(2*i+1);k++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j<5;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//6
// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         int num=1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.print("\n");
//         }    
//     }
// }

//6
// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if ((i+j)%2==0){
//                     System.out.print(1+" ");

//                 }
//                 else{
//                     System.out.print(0+" ");
//                 }

//             }
//             System.out.print("\n");
//         }    
//     }
// }

//7 solid rhombus
// public class pattern{
//     public static void main(String[] args){      
//         int n=5;                                 
//         for (int i=1;i<=n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// pyramid
// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         // int num=1;
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*"+" ");
//             }
//             // num++;
//             System.out.print("\n");
//         }

//     }
// }

// paliondromic number pyramid
// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             for(int j=2;j<=i;j++){

//                 System.out.print(j+" ");
//             }

//             System.out.print("\n");
//         }

//     }
// }

//advance pattern 1
// public class pattern{
//     public static void main(String[] args){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1;j<=(2*n-2*i);j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }        
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1;j<=(2*n-2*i);j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//        }
//     }
// }

//hollow rhombus
// public class pattern{
//     public static void main(String[] args){      
//         int n=5;                                 
//         for (int i=1;i<=n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print(" "+" ");
//             }
//             for (int j=1;j<=n;j++){
//                 if (i==1 || i==n || j==1 || j==n){
//                    System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                 }   
//             }
//             System.out.print("\n");
//         }
//     }
// }

//hollow butterfly
public class pattern{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (j==1||j==i){
                   System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }   
            }
            for(int j=1;j<=(2*n-2*i);j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                if (j==1||j==i){
                   System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }   
            }
            System.out.println();
        }        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if (j==1||j==i){
                   System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }   
            }
            for(int j=1;j<=(2*n-2*i);j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                if (j==1||j==i){
                   System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }   
            }
            System.out.println();
       }
    }
}

// Cross line
// public class pattern {
//     public static void main(String[] args) {
//         int size = 6;      
//         for (int i = 1; i <= size; i++) {
//             for (int j = 1; j <= size; j++) {
//                 if (j == i || j == size - i + 1||(j==1)||(j==n)) {
//                     System.out.print("*"+" ");
//                 } else {
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         int n = 6;      
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if((i==j)||(j==(n-i+1))||(j==1)||(j==n)){
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//             System.out.println();

//     }
// }

// two space in each row
// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<(2*i-1);j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=i;j<=n;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<n;i++){
//             for(int j=1;j<(2*n-2*i)-1;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=i+1;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern
// {
//     public static void main(String args[])
//     {
//         int n=9;
// int i=1;
// while(i<=n)
// {
//     int j=1;
//     while(j<=n)
//     {
//         if(j==1&&i<=(n-1)/2+1 || i>=j&&i<=(n-1)/2+1 || i==(n-1)/2+1 || j+i>=n+1&&i<=(n-1)/2+1 
//         || j==n&&i<=(n-1)/2+1)
//         {
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//         j++;
//     }
//     System.out.println();
//     i++;
// }
/////////////////////////////////////////////////////////////////
// for(int i=1;i<=n;i++)
// {
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print("*");
//     }
//     for(int j=1;j<=n-i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n-i;j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }

//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         int i=1;
//         while(i<=n)
//         {
//             int j=1;
//             while(j<=n)
//             {
//                 if(i+j==(n-1)/2+2 || j-i==n/2 || i-j==(n-1)/2 || i+j==n+(n-1)/2+1)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//                 j++;
//             }
//             i++;
//             System.out.println();
//         }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < 2*n; j++) {
        //         if (j == n - i -1  || j==n+i-1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        
//     }
// }
// public class pattern {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<5;k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
//