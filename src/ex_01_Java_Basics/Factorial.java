package ex_01_Java_Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg){
        System.out.println("Welcome to Fact Prog");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        //System.out.println(n);
        int fact=1;

        for(int i =1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);






    }
}
