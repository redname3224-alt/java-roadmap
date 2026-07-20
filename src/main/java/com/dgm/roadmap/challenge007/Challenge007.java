package com.dgm.roadmap.challenge007;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * EJERCICIO:
 * Implementa los mecanismos de introducción y recuperación de elementos propios de las
 * pilas (stacks - LIFO) y las colas (queue - FIFO) utilizando una estructura de array
 * o lista (dependiendo de las posibilidades de tu lenguaje).
 *
 * DIFICULTAD EXTRA (opcional):
 * - Utilizando la implementación de pila y cadenas de texto, simula el mecanismo adelante/atrás
 *   de un navegador web. Crea un programa en el que puedas navegar a una página o indicarle
 *   que te quieres desplazar adelante o atrás, mostrando en cada caso el nombre de la web.
 *   Las palabras "adelante", "atrás" desencadenan esta acción, el resto se interpreta como
 *   el nombre de una nueva web.
 * - Utilizando la implementación de cola y cadenas de texto, simula el mecanismo de una
 *   impresora compartida que recibe documentos y los imprime cuando así se le indica.
 *   La palabra "imprimir" imprime un elemento de la cola, el resto de palabras se
 *   interpretan como nombres de documentos.
 */



public class Challenge007 {

    private static void push (List<String>stack, String value){
        stack.add(value);
    }

    private static String pop (List<String>stack){
        if (stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    private static String peek (List<String>stack){
        if (stack.isEmpty()){
            return null;
        }
        return stack.get(stack.size()-1);
    }

    private static void enqueue(List<String>queue, String value){
        queue.add(value);
    }

    private static String dequeue(List<String>queue){
        if (queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    private static String peekQueue(List<String>queue){
        if (queue.isEmpty()){
            return null;
        }
        return queue.get(0);
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        List<String> backStack = new ArrayList<>();
        List<String> forwardStack = new ArrayList<>();
        List<String> printer = new ArrayList<>();
        String currentPage = "www.google.com";
        String order;

        //STACK EXAMPLE
        List<String> stack = new ArrayList<>();
        System.out.println("===== STACK EXAMPLE =====");
        System.out.println("List created. It will be used like a stack. Adding elements to the list");
        push(stack, "A");
        push(stack, "B");
        push(stack, "C");
        System.out.println("List: " + stack);
        System.out.println("Top element: " + peek(stack));
        System.out.println("Popping: " + pop(stack));
        System.out.println("List after the changes: "+ stack);
        System.out.println();

        //QUEUE EXAMPLE
        List<String> queue = new ArrayList<>();
        System.out.println("===== QUEUE EXAMPLE =====");
        System.out.println("List created. It will be used like a queue. Adding elements to the list");
        enqueue(queue, "A");
        enqueue(queue, "B");
        enqueue(queue, "C");
        System.out.println("List: " + queue);
        System.out.println("Front element: " + peekQueue(queue));
        System.out.println("Dequeue: " + dequeue(queue));
        System.out.println("List after the changes: "+ queue);
        System.out.println();

        System.out.println("===== WEB BROWSER =====");
        do{
            System.out.println("Current page: " + currentPage);
            System.out.println("Type 'back', 'forward', 'exit' or enter a website: ");
            order = in.nextLine();
            if (order.equalsIgnoreCase("back")) {
                if(backStack.isEmpty()){
                    System.out.println("No previous page");
                }else {
                    push(forwardStack, currentPage);
                    currentPage = pop(backStack);
                }
            }else if (order.equalsIgnoreCase("forward")) {
                if(forwardStack.isEmpty()){
                    System.out.println("No next page");
                }else{
                    push(backStack, currentPage);
                    currentPage = pop(forwardStack);
                }
            } else if (!order.equalsIgnoreCase("exit")) {
                push(backStack, currentPage);
                currentPage = order;
                forwardStack.clear();

            }

        }while(!order.equalsIgnoreCase("exit"));
        System.out.println();

        System.out.println("===== PRINTER =====");
        do{
            System.out.println("Commands(print,exit) or write the document name to send it to the queue: ");
            order = in.nextLine();
            if (order.equalsIgnoreCase("print")) {
                if(printer.isEmpty()){
                    System.out.println("No documents in the queue");
                    System.out.println();
                }else{
                    System.out.println("Printed: "+dequeue(printer));
                    System.out.println();
                }
            } else if (!order.equalsIgnoreCase("exit")) {
                enqueue(printer, order);
                System.out.println("Document added to the queue");
                System.out.println();
            }
        } while(!order.equalsIgnoreCase("exit"));

    }
}
