package com.dgm.roadmap.challenge008;

/*
 * EJERCICIO:
 * Explora el concepto de clase y crea un ejemplo que implemente un inicializador,
 * atributos y una función que los imprima (teniendo en cuenta las posibilidades
 * de tu lenguaje).
 * Una vez implementada, créala, establece sus parámetros, modifícalos e imprímelos
 * utilizando su función.
 *
 * DIFICULTAD EXTRA (opcional):
 * Implementa dos clases que representen las estructuras de Pila y Cola (estudiadas
 * en el ejercicio número 7 de la ruta de estudio)
 * - Deben poder inicializarse y disponer de operaciones para añadir, eliminar,
 *   retornar el número de elementos e imprimir todo su contenido.
 */

import java.util.ArrayList;
import java.util.List;

public class Challenge008 {

    public static class Person{
        private int age;
        private String name;
        public Person(String name, int age){
            this.age = age;
            this.name = name;
        }
        public int getAge() {
            return this.age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void print(){
            System.out.println("Name: "+this.name+". Age: "+this.age);
        }
    }

    public static class Stack{
        private List<String> stack;
        public Stack(){
            stack = new ArrayList<>();
        }
        public void push(String value){
            stack.add(value);
        }
        public String pop(){
            if (stack.isEmpty()) {
                return null;
            }
            return stack.remove(stack.size()-1);
        }
        public int getSize(){
            return stack.size();
        }
        public void print(){
            System.out.println(stack);
        }
    }

    public static class Queue{
        private List<String> queue;
        public Queue(){
            queue = new ArrayList<>();
        }
        public void enqueue(String value){
            queue.add(value);
        }
        public String dequeue(){
            if (queue.isEmpty()) {
                return null;
            }
            return queue.remove(0);
        }
        public int getSize(){
            return queue.size();
        }
        public void print(){
            System.out.println(queue);
        }
    }

    static void main() {

        System.out.println("===== PERSON =====");
        Person person = new Person("Daniel", 34);
        person.print();

        person.setAge(35);
        person.setName("Mark");

        System.out.println("After modifying the attributes:");
        person.print();
        System.out.println();

        System.out.println("===== STACK =====");
        Stack stack = new Stack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.print();
        System.out.println("Removed: " + stack.pop());
        System.out.println("Size: " + stack.getSize());
        stack.print();

        System.out.println();

        System.out.println("===== QUEUE =====");
        Queue queue = new Queue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.print();

        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Size: " + queue.getSize());
        queue.print();


    }

}
