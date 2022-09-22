package SaboorSirTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numOfElements = sc.nextInt();
        int arr[] = new int[numOfElements];
        for (int i=0;i<numOfElements;i++){
        }
        System.out.println("Enter "+ arr.length + " integer values:");

        for(int i=0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        for (int k=0;k<arr.length;k++){

                sum+=arr[k];

        }

       if (sum>10){
           System.out.println("awesome performance");
       }
       if (sum==10){
           System.out.println("Good");
       }
       if (sum<10){
           System.out.println("The average of given integers is "+sum/arr.length);
       }




    }}