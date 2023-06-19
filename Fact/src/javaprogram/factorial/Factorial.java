package javaprogram.factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial");
        int n=c.nextInt();
        int fact=1;
        for( int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }


}
