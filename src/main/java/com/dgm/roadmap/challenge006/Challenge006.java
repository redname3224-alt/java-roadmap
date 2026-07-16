package com.dgm.roadmap.challenge006;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la
 *   sucesión de Fibonacci (la función recibe la posición).
 */

public class Challenge006 {

    private static void numberPrint(int number){
        System.out.println(number);
        if (number== 0){
            return;
        }
        numberPrint(number - 1);
    }

    private static long factorial(int number){
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (number <= 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

    private static int fibonacciCalc(int position){
        if (position < 0) {
            throw new IllegalArgumentException("Position must be non-negative.");
        }
        if (position <= 1) {
            return position;
        }
        return fibonacciCalc(position - 1) +  fibonacciCalc(position - 2);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean exit;

        System.out.println("Recursive method that prints numbers from 100 to 0: ");
        numberPrint(100);

        do{
            exit = true;
            System.out.print("Enter number to calculate its factorial: ");
            try {
                int number = sc.nextInt();
                System.out.println(number+"!= "+ factorial(number));
            }catch(InputMismatchException im){
                System.out.println("Please enter an integer");
                sc.nextLine();
                exit = false;
            }catch(IllegalArgumentException ia){
                System.out.println(ia.getMessage());
                exit = false;
            }
        }while(!exit);

        do{
            exit = true;
            System.out.print("Enter a position in the fibonacci sequence to calculate its value: ");
            try {
                int position = sc.nextInt();
                System.out.println(fibonacciCalc(position));
            }catch(InputMismatchException im){
                System.out.println("Please enter an integer");
                sc.nextLine();
                exit = false;
            }catch(IllegalArgumentException ia){
                System.out.println(ia.getMessage());
                exit = false;
            }
        }while(!exit);


    }
}
