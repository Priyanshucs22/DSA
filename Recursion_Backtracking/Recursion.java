// public class Recursion {  // it is is based on the principle of mathematical induction and when we talk about no of ways 
//     public static void main(String[] args) {
//         int a  = rec(5);
//         System.out.println(a);
//     }
//     private static int rec(int n){
//         if(n == 0) return 1;
//         int b = rec(n-1);
//         return b*n;
//     }
// }    

// sorted array by rec
// public class Recursion{
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5};
//         System.out.println(sorted(arr,0));
//     }
//     private static boolean sorted(int arr[] , int i){
//         //base case
//         if(arr.length-1==i) return true; 
//         else if(arr[i]>arr[i+1]){
//             return false;      
//         }
//         //smaller problem
//         boolean b = sorted(arr, i+1);
//         //calculation
//         if(b) return true;
//         else return false;
//     }
// }

//number print by a recursion in reverse or simple order
// public class Recursion{
//     public static void main(String[] args) {
//         int n = 5;
//         pi(n);
//     }
//     private static void pi(int n) {
//         if(n==0) return;       
//         pi(n-1);
//         System.out.println(n);   //1,2,3,4,5
//     }
//     private static void pi(int n) {
//         if(n==0) return;
//         System.out.println(n);//5,4,3,2,1
//         pi(n-1);  
//     }
// }


//power by recursion
// public class Recursion {  
//     public static void main(String[] args) {
    //     int a  = rec(2,5);
    //     System.out.println(a);
    // }
    // private static int rec(int a,int b){
    //     if(b == 0) return 1;
    //     int c = rec(a,b-1);
    //     return a*c;
    // }
// }

//fibanacci series
// public class Recursion{
//     public static void main(String[] args) {
//         int n =5;
//         System.out.println(fib(n));
//     }
//     private static int fib(int n){
//         // if(n==0) return n;
//         // if(n==1) return n;
//         // int x=fib(n-1);
//         // int y=fib(n-2);
//         // return x+y;
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fib(n-1)+fib(n-2);
//     }
// }

//print all subsequesnce of a string
// public class Recursion{
//     public static void main(String[] args) {
//         String a = "abc";
//         sub(a,"");
//     }
//     private static void sub(String a,String n){
//         if(a.length()==0){
//             System.out.println(n);
//             return;
//         }
//         char c = a.charAt(0);
//         sub(a.substring(1),n+c);
//         sub(a.substring(1),n);
//     }
// }

// subsequesnce of array
// import java.util.ArrayList;
// public class Recursion{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3} ;   
//         ArrayList<Integer> a = new ArrayList<Integer>();
//         sub(arr,a,0);
//     }
//     private static void sub(int[] arr, ArrayList<Integer> a,int i){
//         if(arr.length == i){
//             System.out.println(a);
//             return;
//         }
//         int c = arr[i];
//         ArrayList<Integer> ab = new ArrayList<>(a);
//         ab.add(c);
//         sub(arr,ab,i+1);
//         sub(arr,a,i+1);
//     }
// }

//coin sequence
// public class Recursion {
//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println(sub(n, "", false));
//     }
//     public static int sub(int a, String current, boolean lastWasHead) {
//         if (a==0) {
//             System.out.println(current);
//             return 1;
//         }
//         int x = 0;
//         int y = 0;
//         if (!lastWasHead){    //(current.length()==0||current.charAt(current.length()-1)!='H') 
//             x = sub(a-1, current + "H", true);
//         }
//         y = sub(a-1, current + "T", false);
//         return x + y;
//     }
// }

//.....
// public class Recursion {
//     static final int MOD = 1000000007;

//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 4};
//         System.out.println(sumOfMins(arr));
//     }

//     private static int sumOfMins(int[] arr) {
//         int result = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int min = arr[i];
//             result = (result + min) % MOD;

//             for (int j = i + 1; j < arr.length; j++) {
//                 min = Math.min(min, arr[j]);
//                 result = (result + min) % MOD;
//             }
//         }

//         return result;
//     }
// }

// n-dice face problem with starting point-0 to ending point-4
// public class Recursion{
//     public static void main(String[] args) {
//         int n=6;
//         System.out.println(cou(n,0,""));
//     }
//     public static int cou(int n,int sum,String a){
//         if(sum==6){    
//             System.out.println(a);   
//             return 1;  
//         }
//         if(sum>6){
//             return 0;
//         }
//         int ways=0;
//         for(int i=1;i<=n;i++)
//             ways+=cou(n,sum+i,a+i);
//         return ways;
//     }
// }

//count how many ways tat (0,0) is to reach (m,n)
// public class Recursion{
//     public static void main(String[] args) {
//         System.out.println(count(3,3,0,0,""));
//     }
//     public static int count(int m,int n,int h,int v,String s){
//         if(h==m-1&&v==n-1){
//             System.out.println(s);
//             return 1;
//         }

//         // if(h>m-1||v>n-1){
//         //     return 0;
//         // }
//         // count(m,n,h+1,v,s+"H");
//         // count(m,n,h,v+1,s+"V");

//         //another trick
//         int x=0;
//         int y=0;
//         if(h<m-1) 
//         x=count(m,n,h+1,v,s+"V");
//         if(v<m-1) 
//         y=count(m,n,h,v+1,s+"H");
//         return x+y;
//     }
// }

//Lexico counting
// public class Recursion{
//     public static void main(String[] args) {
//         int n = 13;
//         lexico(n,0);
//     }
//     public static void lexico(int n,int curr){
//         if(curr>n) return;
//         int i=0;
//         System.out.println(curr);
//         if(curr==0) i=1;           
//         for(;i<=9;i++){
//             lexico(n,curr*10+i);
//         }
//     }
// }

//PCPH -1
// public class Recursion {
//     public static void main(String[] args) {
//         String s = "Priyanshu#sharma.is#a";
//         String b = "";
//         String[] a = s.split("\\#");     //s.split("[.#]"); // Split by '.' or '#'
//         for (int i = a.length - 1; i >= 0; i--) {
//             b += a[i];
//             if (i != 0) {
//                 b += ".";
//             }
//         }
//         System.out.println(b);
//     }
// }

//Permutation
// public class Recursion{
//     public static void per(String s,String perm){
//         if(s.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for (int j=0;j<s.length();j++){
//             char c = s.charAt(j);
//             String newstr = s.substring(0,j) + s.substring(j+1);
//             per(newstr,perm+c); //perm(s.substring(1),perm+c)
//         }
//     }
//     public static void main(String[] args){
//         String s = "abca";
//         per(s,"");
//     }
// }

//permutation with duplicacy
// public class Recursion {
//     public static void per(String s, String perm) {
//         int m = 0;
//         if (s.length() == 0) {
//             System.out.println(perm);
//             return;
//         }
//         for (int j = 0; j < s.length(); j++) {
//             char c = s.charAt(j);
//             m = 0;
//             for (int k = j + 1; k < s.length(); k++) { 
//                 if (c == s.charAt(k)) {
//                     m++;
//                     break;
//                 }
//             }
//             if (m == 0) {
//                 String newstr = s.substring(0, j) + s.substring(j + 1);
//                 per(newstr, perm + c);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String s = "abca";
//         per(s, "");
//     }
// }


//maze path (0,0) to (m,n);
// import java.util.Scanner;
// public class Recursion {
//     static int totalPaths = 0; // Variable to store the total number of paths

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N1 = scanner.nextInt();
//         int N2 = scanner.nextInt();

//         countPaths(N1, N2, 0, 0, "");
//         System.out.println(totalPaths); 
//     }

//     public static void countPaths(int N1, int N2, int row, int col, String path) {
//         if (row == N1 - 1 && col == N2 - 1) {
//             totalPaths++;
//             System.out.print(path + " ");
//             return;
//         }

//         if (col < N2 - 1)
//             countPaths(N1, N2, row, col+1, path + "V"); 
//         if (row < N1 - 1)
//             countPaths(N1, N2, row+1, col, path + "H");
//         if (row < N1 - 1 && col < N2 - 1)
//             countPaths(N1, N2, row + 1, col + 1, path + "D");
//     }
// }

//keypad
// public class Recursion{
//     public static void kc(String a,int i,String n,String[] keypad){
//         if(i==a.length()){
//             System.out.print(n+" ");
//             return;
//         }
//         char c = a.charAt(i);
//         String mapping = keypad[c-'0'];
//         for (int j=0;j<mapping.length();j++){
//             kc(a,i+1, n+mapping.charAt(j) ,keypad);
//         }
//     }
//     public static void main(String[] args){
//         String a="23";
//         String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//         kc(a,0,"",keypad);
//     }
// }

//permutation with Integer
// public class Recursion {
//     public static void per(int n, String perm) {
//         if (perm.length() == n) {
//             System.out.println(perm);
//             return;
//         }
//         for (int j = 1; j <= n; j++) {
//             if (!perm.contains(String.valueOf(j))) { 
//                 per(n, perm + j);
//             }
//         } 
//     } 
//     public static void main(String[] args) {
//         int n = 3; 
//         per(n, "");
//     } 
// }

//leet code 647
// import java.util.ArrayList;
// public class Recursion {
//     public static void main(String[] args) {
//         System.out.println(countSubstrings("abc"));
//     }
//     public static int countSubstrings(String s) {
//         ArrayList<String> substrings = new ArrayList<>();
//         generateSubstrings(s, "", 0, substrings);
//         int count = 0;
//         for (String substring : substrings) {
//             if (isPalindrome(substring)) {
//                 System.out.println(substring);
//                 count++;
//             }
//         }
//         return count;
//     }
//     private static void generateSubstrings(String s, String current, int index, ArrayList<String> substrings) {
//         if (index == s.length()) {
//             if (!current.isEmpty()) {
//                 substrings.add(current);
//             }
//             return;
//         }
//         generateSubstrings(s, current + s.charAt(index), index + 1, substrings);
//         generateSubstrings(s, current, index + 1, substrings);
//     }
//     private static boolean isPalindrome(String str) {
//         StringBuilder sb = new StringBuilder(str).reverse();
//         return str.equals(sb.toString());
//     }
// }




//subset sum
// import java.util.*;
// public class Recursion {
//     public static void main(String args[]) {
//         int n = 5;
//         int[] arr = {1, 4, 6, 5, 3};
//         int target = 10;
//         gen(arr, target, "", 0, 0);
//     }
//     public static void gen(int[] arr, int target, String ans, int sum, int idx) {
//         if (target == sum) {
// 			for(int i=ans.length()-1;i>=0;i--){
// 				System.out.print(ans.charAt(i)+" ");
// 			}
// 			System.out.println();
// 			return;
//         }
//         if (sum > target || idx >= arr.length) {
//             return;
//         }
//         gen(arr, target, ans, sum, idx + 1);
//         gen(arr, target, ans + arr[idx], sum + arr[idx], idx + 1);
//     }
// }

//subset with target using list
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3; 
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        sub(arr, l, a, target, 0);
        System.out.println(l); 
    }
    private static void sub(int[] arr, List<List<Integer>> l, List<Integer> a, int target, int sum) {
        if (sum == target) {
            l.add(new ArrayList<>(a)); 
            return;
        }
        if (sum > target || a.size() >= arr.length) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            ArrayList<Integer> ab = new ArrayList<>(a);
            ab.add(c);
            sub(arr, l, ab, target, sum + c);
        }
    }
}