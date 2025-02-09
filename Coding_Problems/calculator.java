// import java.util.*;
// public class calculator {
//     public static void calc(int a,int b){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the operators(+,-,*,/):");
//         String op=sc.next();
//         switch(op){
//             case "+": System.out.println("Addition is:"+ (a+b));
//             break;
//             case "-": System.out.println("Subtraction is:" + (a-b));
//             break;
//             case "*": System.out.println("Multiplication is:"+(a*b));
//             break;
//             case "/": System.out.println("Division is:"+(a/b));
//             break;
//             default: System.out.println("Invalid operator");
//             sc.close();
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number is:");
//         int a=sc.nextInt();
//         System.out.println("Enter the second number is:");
//         int b=sc.nextInt();
//         calc(a, b);
//         sc.close();
//     }
// }


//Calculator by class
// public class calculator {
//     int result;

//     public void add(int num1, int num2) {
//         result = num1 + num2;
//     }

//     public void subtract(int num1, int num2) {
//         result = num1 - num2;
//     }

//     public int getResult() {
//         return result;
//     }


//     public static void main(String[] args) {
//         calculator calculator = new calculator();
//         int num1 = 10;
//         int num2 = 5;
//         calculator.add(num1, num2);
//         System.out.println("Addition result: " + calculator.getResult());
//         calculator.subtract(num1, num2);
//         System.out.println("Subtraction result: " + calculator.getResult());
//     }
// }