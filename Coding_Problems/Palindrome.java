// public class Palindrome {
//     public static void main(String[] args) {
//         String myString = "anna";
//         StringBuilder buffer = new StringBuilder(myString);
//         buffer.reverse();
//         String data = buffer.toString();
//         if(myString.equals(data)){
//            System.out.println("Given String is palindrome");
//         } else {
//            System.out.println("Given String is not palindrome");
//         }
//     }
// }


// public class Palindrome {
//     public static String longestPalindrome(String s) {
//         int start_i = 0;
//         int max = 0;
//         int end_i = 0;

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) { 
//                 if (j - i > max && isPalindrome(s, i, j - 1)) { 
//                     max = j - i;
//                     start_i = i;
//                     end_i = j;
//                 }
//             }
//         }

//         return s.substring(start_i, end_i); 
//     }

//     private static boolean isPalindrome(String s, int start, int end) {
//         while (start < end) {
//             if (s.charAt(start) != s.charAt(end)) {
//                 return false;
//             }
//             start++;
//             end--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s="ababca";
//         System.out.println(longestPalindrome(s));
//   

// class main{  
// public static void main(String args[])  
// {    
//  int n1=0,n2=1,n3,i,count=10;    
//  System.out.print(n1+" "+n2);  
    
//  for(i=2;i<count;++i) 
//  {    
//   n3=n1+n2;    
//   System.out.print(" "+n3);    
//   n1=n2;    
//   n2=n3;    
//  }    
  
// }}  




// import java.util.Scanner;

// public class StudentIDGenerator {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the student's name: ");
//         String name = scanner.nextLine();

//         System.out.println("Enter the course selected: ");
//         String course = scanner.nextLine();

//         String id = "";
//         switch (course) {
//             case "Java":
//                 id = "JAVA" + generateRandomNumber(4);
//                 break;
//             case "Python":
//                 id = "PYTHON" + generateRandomNumber(4);
//                 break;
//             case "PHP":
//                 id = "PHP" + generateRandomNumber(4);
//                 break;
//             default:
//                 System.out.println("Invalid course selected.");
//                 return;
//         }

//         System.out.println("The student ID is: " + id);
//     }

//     private static int generateRandomNumber(int n) {
//         return (int) (Math.random() * 10000) % 10000;
//     }
// }


