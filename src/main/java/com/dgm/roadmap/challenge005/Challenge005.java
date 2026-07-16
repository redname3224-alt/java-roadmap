package com.dgm.roadmap.challenge005;

/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */


public class Challenge005 {

    private static class Person {
        private String firstName;
        private String lastName;
        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    private static void changePersonName(Person person){
        person.firstName = "Adrián";
    }

    public static void replacePerson(Person person) {
        person = new Person("John", "Smith");
    }

    private static void changeNumber(int number) {
        number = 100;
    }

    private static int[] returnNumbers(int number1, int number2) {
        return new int[]{number2, number1};
    }
    private static Person[] returnPersons(Person person1, Person person2) {
        return new Person[]{person2, person1};
    }

    static void main() {
        // PRIMITIVE VARIABLES
        int a = 10;
        int b = 20;

        System.out.println("Variable x: " + a);
        System.out.println("Variable y: " + b);
        b = a;
        System.out.println("y = x");
        System.out.println("Variable x: " + a);
        System.out.println("Variable y: "+ b);
        System.out.println("Variable y now has the value of x");
        System.out.println();

        //OBJECTS
        Person person1 = new Person("Daniel","García");
        Person person2 = person1;

        System.out.println("Created Person object person1: " + person1);
        System.out.println("person2 = person1");

        person2.firstName = "Mark";
        System.out.println("person2 new first name: Mark");
        System.out.println("person1: "+person1);
        System.out.println("person2: "+person2);
        System.out.println("There is only one Person object in memory, and both variables reference it");
        System.out.println();

        //METHODS
        int number = 10;
        System.out.println("Variable number: " + number);
        System.out.println("Before: " + number);
        changeNumber(number);
        System.out.println("Calling the method changeNumber(number)");
        System.out.println("After: " + number);
        System.out.println("The method only changes its local copy of the value. The original variable is unchanged.");
        System.out.println();

        System.out.println("person1: "+person1);
        System.out.println("Using the method changePersonName(person1) to change its name");
        changePersonName(person1);
        System.out.println("After: "+person1);
        System.out.println("The method receives a copy of the reference to the object and modifies that object.");
        System.out.println();

        System.out.println("person1: "+person1);
        System.out.println("Using the method replacePerson(person1). It creates a new Person and assigns it to its local parameter.");
        replacePerson(person1);
        System.out.println("After: "+person1);
        System.out.println("The original variable still points to the original object. The new object is lost because only the local parameter referenced it.");
        System.out.println();

        //EXTRA CHALLENGE
        int x = 40;
        int y = 50;
        System.out.println("Variable x: " + x);
        System.out.println("Variable y: " + y);
        System.out.println("Using the method returnNumbers. It receives both values, swaps them and returns the swapped values in an array.");
        int[] array = returnNumbers(x, y);
        System.out.println("Original variable x: "+ x);
        System.out.println("Returned variable x: "+ array[0]);
        System.out.println("Original variable y: "+ y);
        System.out.println("Returned variable y: "+ array[1]);
        System.out.println();

        Person personA = new Person("Juliet","Fernandez");
        Person personB = new Person("Jonathan","Herrera");
        System.out.println("person A: "+personA);
        System.out.println("person B: "+personB);
        System.out.println("Using the method returnPersons. It receives both object references, swaps them and returns the swapped references in an array.");
        Person[] array2 = returnPersons(personA, personB);
        System.out.println("Original person A: "+personA);
        System.out.println("Returned person A: "+array2[0]);
        System.out.println("Original person B: "+personB);
        System.out.println("Returned person B: "+array2[1]);





    }
}
