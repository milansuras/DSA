package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter target to search for:-");
        int target=sc.nextInt();

        System.out.println("Enter elements in array");
        for(int i=0; i<n; i++){
            System.out.print("Enter element @ index [" + i + "] " + " = " );
            arr[i]=sc.nextInt();
        }

       // printArray(arr,n);
        int ans=linearSearch(arr,n,target);
        System.out.println("Elemrnt found @ the index" + ans);
    }

    public static void printArray(int[] arr, int n){

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static int  linearSearch(int[] arr, int n, int target){
        if(arr.length==0)
            return -1;

        for(int i=0; i<n; i++){
            if(arr[i]==target)
                return arr[i];
        }
        return 0;
    }

}
