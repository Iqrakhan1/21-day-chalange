// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static void swap(int a , int b){
        int temp = a ;
        a=b;
        b=temp;
        
    }
   static void reverse(int i ,int arr[] , int n ){
        if(i>n/2) return;
        
        swap(arr[i] , arr[i]-i - 1 );
        reverse(i+1 , arr , n);
       
        
    }
    public static void main(String[] args) {
        
        int n ; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        
        n = sc.nextInt();
        
       int arr[] = new int[n]; 
       for(int i = 0; i<n; i++){
           arr[i]= sc.nextInt();
       }
       reverse(0 , arr , n);
       System.out.println("array is :");
       
    for(int i = 0; i<n; i++){
        
        System.out.print( arr[i] + "   ");
    }
  
    }
}
