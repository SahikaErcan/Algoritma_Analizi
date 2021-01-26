
package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static int Search(int[] arr, int number){
        
        int left=0;
        int right=arr.length - 1;
        
        while(left <= right){
            
            int middle =(left+right)/2;
            
            if (number == arr[middle]) 
                return middle;
            else if(number < arr[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int[] arr={1,4,5,7,18,25,29,37,41,53,74,97};
        System.out.println("Dizi : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.print("Aramak istediğiniz sayıyı giriniz : ");
        int number = s.nextInt();
        
        System.out.println("Aradığınız sayı dizinin " + Search(arr, number) + ". indisinde yer alır.");
    }    
}
