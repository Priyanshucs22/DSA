// buuble sorting in ascenmding order
// import java.util.*;
// public class Sorting{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];         //for string we convert it into char arry by str.toCharArray();
//         for (int i = 0; i < size; i++){
//             a[i]=sc.nextInt();
//         }
//         int t;
//         for (int i = 0; i < a.length-1; i++){
//             for (int j = 0; j < size-1-i; j++){
//                 if (a[j]>a[j+1]){
//                    t=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=t;
//                 }
//             }
//         }
//         for ( int i = 0; i < a.length; i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }


//Selection sorting
// public class Sorting {
//     public static void main(String[] args) {
//         int arr[] = {3, 4, 1, 2, 5};
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smallestIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[smallestIndex]) {
//                     smallestIndex = j;
//                 }
//             }
//             int temp = arr[smallestIndex];
//             arr[smallestIndex] = arr[i];
//             arr[i] = temp;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]); 
//         }
//     }
// }


//insertion sort
// public class Sorting{
//     public static void main(String[] args){
//         int arr[] = {2,5,3,4,1};
//         for (int i=1; i<arr.length; i++){
//             int c = arr[i];
//             int j=i-1;
//             while(j>=0 && c<arr[j]){  //7 8 | 3 4 1
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=c;
//         }
//         for(int i:arr){
//             System.out.println(i);
//         }
//     }
// }



public class Sorting{
        public static void main(String[] args) {
                int[] arr = {1,4,2,8,1};
                for(int i=0;i<arr.length;i++){
                        int min = i;
                        for(int j=i+1;j<arr.length;j++){
                                if(arr[j]<arr[min]){
                                        min = j;
                                }
                        }
                        int temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
                }
                for(int e:arr){
                        System.out.println(e);
                }
        }
}