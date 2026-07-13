package com.dgm.roadmap.challenge001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class Challenge001 {
    static void main() {
        //VARIABLE
        double firstVariable = 5;
        double secondVariable = 3;
        double thirdVariable = 2;
        int fourthVariable = 4;
        boolean booleanVariable = true;
        boolean booleanVariable2 = false;
        String greeting = "Hello World!";
        String switchResult = "";
        Scanner input = new Scanner(System.in);
        String answer;

        //ARITHMETIC OPERATORS
        double addition = firstVariable + secondVariable;
        double subtraction = firstVariable - secondVariable;
        double multiplication = firstVariable * secondVariable;
        double division = firstVariable / secondVariable;
        double remainder = firstVariable % secondVariable;

        //UNARY OPERATORS
        double unaryPlus = +firstVariable;
        double unaryMinus = -firstVariable;
        double increment = ++thirdVariable;
        double decrement = --thirdVariable;
        boolean logicalNot = !booleanVariable;

        //BIT OPERATORS
        int bitwiseComplement = ~(int) firstVariable;
        int bitwiseAND = (int) firstVariable & (int) secondVariable;
        int bitwiseOR = (int) firstVariable | (int) secondVariable;
        int bitwiseXOR = (int) firstVariable ^ (int) secondVariable;
        int leftShift = (int) firstVariable << (int) secondVariable;
        int rightShift = (int) firstVariable >> (int) secondVariable;
        int unsignedRightShift = (int) firstVariable >>> (int) secondVariable;

        //ASSIGNMENT OPERATORS
        double additionAssignment = thirdVariable += firstVariable;
        double subtractionAssignment = thirdVariable -= secondVariable;
        double multiplicationAssignment = thirdVariable *= secondVariable;
        double divisionAssignment = thirdVariable /= secondVariable;
        double remainderAssignment = thirdVariable %= secondVariable;

        //RELATIONAL OPERATORS
        boolean equal = firstVariable == secondVariable;
        boolean notEqual = firstVariable != secondVariable;
        boolean greaterThan = firstVariable > secondVariable;
        boolean lessThan = firstVariable < secondVariable;
        boolean greaterThanOrEqual = firstVariable >= secondVariable;
        boolean lessThanOrEqual = firstVariable <= secondVariable;

        //LOGICAL OPERATORS
        boolean logicalAnd = booleanVariable && booleanVariable2;
        boolean logicalOr = booleanVariable || booleanVariable2;

        //CONDITIONAL OPERATOR
        int ternary = firstVariable > secondVariable ? 99 : -99;

        //TYPE OPERATOR
        boolean type = greeting instanceof String;

        //IF ELSE AND FOR (EXTRA CHALLENGE)
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i < 56; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                list.add(i);
            }
        }

        //SWITCH
        switch (fourthVariable) {
            case 0:
                switchResult = "The fourth variable is equal to 0";
                break;
            case 4:
                switchResult = "The fourth variable is equal to 4";
                break;
        }

        System.out.printf("===== VARIABLES =====\n" +
                "firstVariable = %.2f\n" +
                "secondVariable = %.2f\n" +
                "thirdVariable = 2\n" +
                "fourthVariable = %d\n" +
                "booleanVariable = %b\n" +
                "booleanVariable2 = %b\n" +
                "String greeting = %s\n", firstVariable, secondVariable, fourthVariable, booleanVariable, booleanVariable2, greeting);

        System.out.printf("===== ARITHMETIC OPERATORS (FIRST AND SECOND VARIABLE) =====\n" +
                "Addition: %.2f\n" +
                "Subtraction: %.2f\n" +
                "Multiplication: %.2f\n" +
                "Division: %.2f\n" +
                "Remainder: %.2f\n", addition, subtraction, multiplication, division, remainder);

        System.out.printf("===== UNARY OPERATORS =====\n" +
                "Unary Plus (firstVariable): %.2f\n" +
                "Unary Minus (firstVariable): %.2f\n" +
                "Increment (thirdVariable): %.2f\n" +
                "Decrement (thirdVariable): %.2f\n" +
                "Logical Not (booleanVariable): %b\n", unaryPlus, unaryMinus, increment, decrement, logicalNot);

        System.out.printf("===== BIT OPERATORS (FIRST AND SECOND VARIABLE) =====\n" +
                "Bitwise Complement: %d\n" +
                "BitwiseAND: %d\n" +
                "Bitwise OR: %d\n" +
                "Bitwise XOR: %d\n" +
                "Left Shift: %d\n" +
                "Right Shift: %d\n" +
                "Unsigned Right Shift: %d", bitwiseComplement, bitwiseAND, bitwiseOR, bitwiseXOR, leftShift, rightShift, unsignedRightShift);

        System.out.printf("===== ASSIGNMENT OPERATORS =====\n" +
                "Addition Assignment(thirdVariable += firstVariable): %.2f\n" +
                "Subtraction Assignment(thirdVariable -= secondVariable): %.2f\n" +
                "Multiplication Assignment (thirdVariable *= secondVariable): %.2f\n" +
                "Division Assignment(thirdVariable /= secondVariable): %.2f\n" +
                "Remainder Assignment(thirdVariable %%= secondVariable): %.2f\n", additionAssignment, subtractionAssignment, multiplicationAssignment, divisionAssignment, remainderAssignment);

        System.out.printf("===== RELATIONAL OPERATORS(FIRST AND SECOND VARIABLE) =====\n" +
                "Equal: %b\n" +
                "Not equal: %b\n" +
                "Greater than: %b\n" +
                "Less than: %b\n" +
                "Greater than or equal: %b\n" +
                "Less than or equal: %b\n", equal, notEqual, greaterThan, lessThan, greaterThanOrEqual, lessThanOrEqual);

        System.out.printf("===== LOGICAL OPERATORS(BOOLEANVARIABLE AND BOOLEANVARIABLE2) =====\n" +
                "Logical And:%b\n" +
                "Logical Or:%b\n", logicalAnd, logicalOr);

        System.out.printf("===== CONDITIONAL OPERATOR(FIRST AND SECOND VARIABLE) =====\n" +
                "Ternary(firstVariable > secondVariable? 99 : -99): %d\n", ternary);

        System.out.printf("===== TYPE OPERATOR =====\n" +
                "Instance of(greeting instanceof String): %b\n", type);

        System.out.println("===== IF ELSE AND FOR (EXTRA CHALLENGE) =====");
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("===== SWITCH (FOURTH VARIABLE) =====");
        System.out.println(switchResult);

        System.out.println("===== DO WHILE =====");
        do {
            System.out.print("Did you enjoy this challenge?(write yes or no): ");
            answer = input.nextLine();

        } while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));


    }
}
