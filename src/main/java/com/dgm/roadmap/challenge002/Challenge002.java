package com.dgm.roadmap.challenge002;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */

// Java does not support nested methods.

public class Challenge002 {
    private static final String LANGUAGE = "Java";

    public static int fizzBuzzCustom (String str1, String str2){
        int count=0;
        for(int i=1;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i+"."+str1.concat(str2));
            } else if (i % 5 == 0){
                System.out.println(i+"."+str2);
            } else if(i % 3 == 0){
                System.out.println(i+"."+str1);
            }else{
                System.out.println(i+".");
                count++;
            }
        }
        return count;
    }

    public static void printDayOfWeek(){
        System.out.println("Today is "+ LocalDateTime.now().getDayOfWeek());
    }

    public static void printTable(int table){
        for(int i=1;i<=10;i++){
            System.out.println(table+" X "+i+" = "+table*i);
        }
    }

    public static int fortyPlusOneThousand(){
        return (40+1000);
    }


    static void main() {

        //VARIABLES
        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String str;
        int count = 0;
        int count2, result;

        do{
            System.out.print("Enter a string(it cannot be blank): ");
            str = input.nextLine();
            if(!str.isBlank()){
                list.add(str);
                count++;
            }
        } while(str.isBlank() || count <= 1);
        System.out.println();

        System.out.println("Example of a method with a return value and several parameters:");
        count2 = fizzBuzzCustom(list.get(0), list.get(1));
        System.out.println("Number of times the number was printed with no sentences: "+count2);
        System.out.println();


        System.out.println("Example of a method with no return value and no parameters:");
        printDayOfWeek();
        System.out.println();

        System.out.println("Example of a method with no return value and one parameter:");
        printTable(4);
        System.out.println();

        System.out.println("Example of a method with a return value and no parameters:");
        result = fortyPlusOneThousand();
        System.out.println("40+1000= " + result);

        System.out.println(LANGUAGE+" exercise completed");

    }
}
