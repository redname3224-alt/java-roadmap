package com.dgm.roadmap.challenge000;

/* EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 */
public class Challenge000 {
    static void main(String[] args) {
        //Java website: https://www.java.com/

        //This is a single line comment

        /*
         * This is multiple line
         * comment
         */

        final double FINAL_VALUE = 400;

        int intValue = 5;
        double realValue = 5.0;
        byte byteValue = 89;
        short shortValue = 123;
        long longValue = 347L;
        float floatValue = 123.45f;
        char charValue = 'a';
        boolean booleanValue = true;
        String language = "Java";
        String message = "¡Hola, " + language + "!";


        System.out.println(message);
    }

}
