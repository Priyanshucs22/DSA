import java.util.*;
public class numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0,n,sum=0;
        n=t;
        while(n>0){
            n/=10;  
            c++;
        } 
        n=t;
        while(n>0){
            int last=n%10;
            sum +=(Math.pow(last,c));
            n/=10;
        }    
        if (sum==t){
            System.out.println("armstrong");
        }   
        else{
            System.out.println("no");
        } 
        sc.close();
    }
}
