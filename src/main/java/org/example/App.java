package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibonacci(i)+" ");
        }
    }
}
