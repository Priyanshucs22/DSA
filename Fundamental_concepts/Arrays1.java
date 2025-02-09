package Fundamental_concepts;

//linear search for a number
// import java.util.*;
// public class Arrays1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];
//         for(int i=0;i<size;i++){
//             a[i] = sc.nextInt();
//         }
//         int x=sc.nextInt();
//         for(int i=0;i<size;i++){
//             if (a[i]==x){
//                 System.out.println(x + " is find at index " + i);
//             }
//         }
//     }
// }

//minimum amd maximum number i a aarray
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];
//         for (int i = 0; i < size; i++){
//             a[i]=sc.nextInt();
//         }
//         int max=a[0];
//         int min=a[0];
//         for (int i = 0; i < a.length; i++){
//             if (a[i]>max){
//                 max=a[i];
//             } 
//             if (a[i] < min) {
//                 min = a[i];
//             }  
//         }
//         System.out.println("min and max number in array is:"+ max+" "+ min);
//     }
// }

//sorted array 
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];
//         for (int i = 0; i < size; i++){
//             a[i]=sc.nextInt();
//         }
//         int t;
//         for (int i = 0; i < (a.length); i++){
//             for (int j = 0; j < size-1; j++){
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

//check array is sorted or not
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];
//         for (int i = 0; i < size; i++){
//             a[i]=sc.nextInt();
//         }
//         int t=0;
//         for ( int i=0;i<(a.length-1);i++){
//             if (a[i]>a[i+1]){
//                 t=1;
//             }
//         }c
//         if (t==0){
//             System.out.println("array is sorted");
//         }
//         else{
//             System.out.println("array is not sorted");
//         }
//     }
// }    

//2d array:=
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int a[][]=new int[m][n];
//         for (int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         int x=sc.nextInt();
//         for (int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if (x==a[i][j]){
//                     System.out.println(x + " " + "is located at ("+ i + ", " + j+")");
//                 }
//             }
//         }

//     }
// }

// transpose of a matrix
// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int a[][]=new int[m][n];
//         for (int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for (int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(a[j][i]+" ");              
//             }
//         }

//     }
// }

// import java.util.*;
// public class Arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int a[] = new int[size];

//         int t = sc.nextInt();
//         for(int i=0;i<size;i++){
//             a[i] = sc.nextInt();
//         }
// for(int i=0;i<size;i++){

//     for(int j=i+1;j<size;j++){
//         if ( a[i]+a[j]==t){
//             System.out.println(i+","+j);

//         }
//     }
// }
//         sc.close();
//     }
// }

// import java.util.Arrays;
// public class Arrays1 {
//     public static void main(String[] args) {
//         int[] l1 = {9, 9, 9, 9, 9, 9, 9};
//         int[] l2 = {9, 9, 9, 9};
// int x = Math.max(l1.length, l2.length);
// if (l1.length > l2.length){ 
//     l2 = Arrays.copyOf(l2, l1.length);
//     for(int i=l2.length ; i<l1.length ; i++){
//         l2[i]=0;
//     }
// }
// else{
//     l1 = Arrays.copyOf(l1, l2.length);
//     for(int i=l2.length ; i<l1.length;i++){
//         l1[i]=0;
//     }
// }

// int[] b = new int[x];
// int[] a = new int[x];
// int[] c = new int[x+1];
// int[] c1 = new int[x+1];

// for (int i = x - 1; i >= 0; i--) {
//     b[x - 1 - i] = l1[i];
// }

// for (int i = x - 1; i >= 0; i--) {
//     a[x - 1 - i] = l2[i];
// }

// int carry = 0;
// for (int i = x - 1; i >= 0; i--) {
//     c[i + 1] = (a[i] + b[i] + carry) % 10;
//     carry = (a[i] + b[i] + carry) / 10;
// }

// c[0] = carry; // Assign any remaining carry to the first element

// for (int i = x; i >= 0; i--) {
//     c1[x - i] = c[i];
// }

// for (int num : c1) {
//     System.out.print(num);
// }
//     }
// }

// insert element at index array
// import java.util.Scanner;
// public class Arrays1 {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int[] arr = new int[n + 1];
//                 for (int i = 0; i < n; i++) {
//                         arr[i] = sc.nextInt();
//                 }
//                 int element = sc.nextInt();
//                 int position = sc.nextInt();//3
//                 for (int i = n-1; i >= position-1; i--) {
//                         arr[i+1]=arr[i];
//                 }
//                 arr[position - 1] = element;
//                 for (int e : arr) {
//                         System.out.print(e + " ");
//                 }
//                 sc.close();
//             }
//         }                

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays
// public class Sorting{
//     public static void main(String[] args) {
//         int[] nums1={1,2};
//         int[] nums2={3,4};
//         int c = nums1.length + nums2.length;
//         int[] nums3=new int[c];
//         int x = nums1.length;
//         for (int i=0;i<nums1.length;i++){
//             nums3[i]=nums1[i];
//         }
//         for (int i=0;i<nums2.length;i++){
//             nums3[x]=nums2[i];
//             x++;
//         }
//         int t;
//         for (int i = 0; i < c; i++){
//             for (int j = 0; j <c-1; j++){
//                 if (nums3[j]>nums3[j+1]){
//                    t=nums3[j];
//                    nums3[j]=nums3[j+1];
//                    nums3[j+1]=t;
//                 }
//             }
//         }       
//         if(c%2==0){
//             int mid = c/2;
//             System.out.println((float) (nums3[mid-1]+nums3[mid])/2);
//         }
//         else{
//             System.out.println( nums3[c/2]);
//         }
//     }
// }

// public class Arrays1{
//     public static void main(String[] args) {
//         int c=0;
//         int[] arr= {1,1,0,2,2,0,1,2,0};
//         int x = arr.length;
//         int[] arr2=new int[x];
//         int i=0;
//         while(c!=arr.length){
//             while(i<arr.length-1){
//                 arr2[i]=arr[i];
//                 if(arr[i]==0){
//                   arr2[i+1]=0;
//                     c+=1;
//                     i=i+1;
//                 }
//                 else{
//                     i=i+1;
//                 }
//                 c+=1;
//             }
//         }
//         for(int e:arr2){
//             System.out.print(e);
//         }
//         System.out.println("hello");
//     }
// }

// public class Arrays1{
//     public static void main(String[] args) {
//         int m=3;
//         int n=2;
//         int[] nums1 = {1,3,2};
//         int[] nums2 = {4,2};
//         int a=m+n;
//         int[] nums3= new int[a];
//         for(int i=0;i<a;i++){
//             if(i<m){
//                 nums3[i]=nums1[i];
//             }
//             else{
//                 nums3[i]=nums2[i];
//             }
//         }
//         for(int i=0;i<a-1;i++){
//             for(int j=0;j<a-1-i;j++){
//                 if(nums3[j]>nums3[j+1]){
//                     int t=nums3[j];
//                     nums3[j]=nums3[j+1];
//                     nums3[j+1]=t;
//                 }
//             }
//         }
//         for(int e:nums3){
//             System.out.println(e);
//         }
//     }
// }

// public class Arrays1 {
//     public static void main(String[] args) {
//         int m = 3;
//         int n = 2;
//         int[] nums1 = {1, 3, 2};
//         int[] nums2 = {4, 2};
//         int a = m + n;
//         int[] nums3 = new int[a];

//         // Copy elements from nums1 and nums2 into nums3
//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while (i < m && j < n) {
//             if (nums1[i] < nums2[j]) {
//                 nums3[k++] = nums1[i++];
//             } else {
//                 nums3[k++] = nums2[j++];
//             }
//         }

//         // Copy any remaining elements from nums1
//         while (i < m) {
//             nums3[k++] = nums1[i++];
//         }

//         // Copy any remaining elements from nums2
//         while (j < n) {
//             nums3[k++] = nums2[j++];
//         }

//         // Sort nums3 if necessary (it's already sorted in this case, so sorting is not needed)

//         // Print the merged and sorted array
//         for (int e : nums3) {
//             System.out.println(e);
//         }
//     }
// }

// public class Arrays1{
//     public static void main(String[] args) {
//         int[] nums = {1,3,4,5,3,6,3};
//         int val = 3;
//         int[] arr=new int[nums.length];
//         int j=0;
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=val){
//                 arr[j]=nums[i];
//                 j+=1;
//                 c+=1;
//             }
//         }
//         System.out.println(c);
//         for(int e:arr){
//             System.out.print(e);
//         }
//     }
// }

// public class Arrays1{
//     public static void main(String[] args) {
//         int[] arr = {1,3,4,2,4,3,2,1};
//         int[] arr2 = new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             if(arr2(arr[i])==-1){
//                 arr2[i]=arr[i];
//             }
//         }
//         for(int e:arr2){
//             System.out.println(e);
//         }
//     }
// }
// import java.util.*;

// public class Arrays1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] p = new int[n];
//         for (int i = 1; i <= n; i++) {
//             p[i - 1] = i;
//         }
//         for (int i = 0; i < p.length; i += 2) {
//             if (p[i] < p[i + 1]) {
//                 int t = p[i + 1];
//                 p[i + 1] = p[i];
//                 p[i] = t;
//             }
//         }
//         if (n == 1) {
//             System.out.println(-1);
//         } else {
//             for (int i : p) {
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }