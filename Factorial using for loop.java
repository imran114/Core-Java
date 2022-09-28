package Practice;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        for (int i=n-1;i>0;i--){
            if (n == 0 || n == 1){
                System.out.println("Factorial of given number is "+n);
                continue;
            }
                n*=i;
        }
        System.out.println("Factorial of given number is "+n);
    }

}
