package com.dgm.roadmap.challenge004;
import java.util.Scanner;

/*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Challenge004 {

    public static boolean isPalindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        } else{
            char[] charArray = word1.toLowerCase().toCharArray();
            char[] charArray2 = word2.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray, charArray2);
        }
    }

    public static boolean isIsogram(String word){
        Set<Character> set = new HashSet<>();
        for (char ch : word.toLowerCase().toCharArray()) {
            if(!set.add(ch)) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        //VARIABLES
        String firstString = "Hello";
        String secondString = "World";
        String sentence = "Java,is,awesome";
        String text = "   Hello World!   ";
        String substring, newSubstring, union, joined, analysis, analysis2;
        Scanner scan = new Scanner(System.in);
        int count = 0;

        //STRING METHODS
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);
        System.out.println("Sentence to split: " + sentence);

        String [] words = sentence.split(",");
        System.out.println("Split example:" );
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Sentence to trim: \"" + text + "\"");
        System.out.println("After trim(): \"" + text.trim() + "\"");

        System.out.println("The first string is empty: " + firstString.isEmpty());

        System.out.println("The second string contains World: " + secondString.contains("World"));

        System.out.println("The first string starts with H: "+firstString.startsWith("H"));

        System.out.println("The second string ends with d: "+secondString.endsWith("d"));

        System.out.println("The first string equals hello (ignoring case): " + firstString.equalsIgnoreCase("hello"));

        System.out.println("Index of r in the second string: "+ secondString.indexOf('r'));

        System.out.println("Access to the third character (first string): " + firstString.charAt(2));

        joined = String.join(" - ", firstString, secondString);
        System.out.println("Joined strings: " + joined);

        System.out.println("Formatted string: "+ String.format("%s, %s!", firstString, secondString));

        substring = secondString.substring(1);
        System.out.println("Substring starting at index 1 (second string): " + substring);

        newSubstring= substring.replace('l','t');
        System.out.println("Replacing the character l by t in the new substring: " + newSubstring);

        System.out.println("Repeat the new substring thrice: " + newSubstring.repeat(3));

        union = firstString.concat(secondString);
        System.out.println("String concatenation: "+ union);

        System.out.println("Length of the concatenated string: " + union.length());

        System.out.println("First string to lowercase: " + firstString.toLowerCase());
        System.out.println("Second string to uppercase: " + secondString.toUpperCase());

        for(char ch: union.toCharArray()) {
            if (ch=='a'||ch=='e'||ch=='i'||ch == 'o'||ch=='u') {
                count++;
            }
        }
        System.out.println("Number of vowels in concatenated string: " + count);
        System.out.println();

        //EXTRA CHALLENGE WORD ANALYSIS

        System.out.println("===== WORD ANALYZER =====");
        System.out.println("Write the first word: ");
        analysis = scan.nextLine();
        System.out.println("Write a second word: ");
        analysis2 = scan.nextLine();
        System.out.println("The first word is a palindrome: "+isPalindrome(analysis));
        System.out.println("The second word is a palindrome: "+isPalindrome(analysis2));
        System.out.println("The first word is an isogram: "+isIsogram(analysis));
        System.out.println("The second word is an isogram: "+isIsogram(analysis2));
        System.out.println("Both words are palindromes: " + (isPalindrome(analysis) && isPalindrome(analysis2)));
        System.out.println("Both words are anagrams: "+isAnagram(analysis, analysis2));
        System.out.println("Both words are isograms: "+(isIsogram(analysis) && isIsogram(analysis2)));


    }




}
