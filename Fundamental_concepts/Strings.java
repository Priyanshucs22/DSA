package Fundamental_concepts;

// reverse a string
// import java.util.*;
// public class Strings {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         StringBuilder sb = new StringBuilder(a);
//         for( int i = 0; i < sb.length()/2;i++){
//             int f=i;
//             int b=sb.length() - i -1;
//             char fc = sb.charAt(f);
//             char bc= sb.charAt(b);
//             sb.setCharAt(f,bc);
//             sb.setCharAt(b,fc);
//         }
//         System.out.print(sb);
//     }
// }

// public class Strings{
//     public static void main(String[] args) {
//         String s =new String("abcabcd");
//         int l=0;
//         for(int i=0;i<s.length();i++){
//             int c=1;
//             for(int j=i+1;j<s.length();j++){
//                 if(s.charAt(i)!=s.charAt(j)){
//                     String a = Character.toString(s.charAt(i)) + Character.toString(s.charAt(j));;
//                     if (a.indexOf(s.charAt(j))==-1){
//                         c++;
//                     }
//                 }
//                 if (c>l){
//                     l=c;
//                 }
//             }
//         }
//         System.out.println(l);
//     }
// }

// public class Strings {
//     public static void main(String[] args) {
//         String s = "abcabcd";
//         int maxLength = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int c = 1;
//             for (int j = i + 1; j < s.length(); j++) {
//                 boolean isRepeated = false;
//                 for (int k = i; k < j; k++) {
//                     if (s.charAt(j) == s.charAt(k)) {
//                         isRepeated = true;
//                         break;
//                     }
//                 }
//                 if (!isRepeated) {
//                     c++;
//                 } else {
//                     break;
//                 }
//             }
//             if (c > maxLength) {
//                 maxLength = c;
//             }
//         }
//         System.out.println(maxLength);
//     }
// }

//
// public class Strings{
//     public static void main(String[] args) {
//         int[][] lists={{1,4,5},{1,3,4},{2,6}}; 
//         int c=0;
//         for (int i=0; i<lists.length; i++) {
//             c+=lists[i].length;
//         }
//         int[] arr = new int[c];
//         int k=0;
//         for (int i=0;i<lists.length ; i++){
//             for (int l=0 ; l<(lists[i].length);l++){
//                 arr[k]=lists[i][l];
//                 k++;
//             }
//         }
//         int t;
//         for (int i = 0; i < arr.length-1; i++){
//             for (int j = 0; j < arr.length-1-i; j++){
//                 if (arr[j]>arr[j+1]){
//                    t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                 }
//             }
//         }
//         for(int element : arr){
//             System.out.print(element+" ");
//         }
//     }
// }

//replace white space
// public class Strings {
//     public static void main(String[] args) {
//         String s = "Sjdsnf*^jb$%";
//         s = s.replaceAll("[a-zA-Z0-9]", "");
//         System.out.println(s);
//     }
// }
