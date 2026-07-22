package com.dgm.roadmap.challenge009;
/*
 * EJERCICIO:
 * Explora el concepto de herencia según tu lenguaje. Crea un ejemplo que
 * implemente una superclase Animal y un par de subclases Perro y Gato,
 * junto con una función que sirva para imprimir el sonido que emite cada Animal.
 *
 * DIFICULTAD EXTRA (opcional):
 * Implementa la jerarquía de una empresa de desarrollo formada por Empleados que
 * pueden ser Gerentes, Gerentes de Proyectos o Programadores.
 * Cada empleado tiene un identificador y un nombre.
 * Dependiendo de su labor, tienen propiedades y funciones exclusivas de su
 * actividad, y almacenan los empleados a su cargo.
 */

public class Challenge009 {

    static void main() {
        System.out.println("===== ANIMAL INHERITANCE =====");
        System.out.println("Polymorphism example:");
        Animal genericAnimal = new Animal("Parrot");
        Animal dog = new Dog("Max");
        Animal cat = new Cat("Luna");
        genericAnimal.cry();
        dog.cry();
        cat.cry();

        System.out.println();

        System.out.println("===== COMPANY HIERARCHY =====");
        Manager manager = new Manager("Alice", 1);
        ProjectManager projectManager = new ProjectManager("Bob", 2, "Python roadmap");
        Programmer programmer1 = new Programmer("Daniel", 3, "Java");
        Programmer programmer2 = new Programmer("Mark", 4, "C#");

        manager.addEmployee(programmer1);
        manager.addEmployee(programmer2);

        projectManager.addEmployee(programmer1);
        projectManager.addEmployee(programmer2);

        System.out.println();

        manager.printInfo();
        manager.holdMeeting();
        manager.showTeam();

        System.out.println();

        projectManager.printInfo();
        projectManager.showProject();
        projectManager.holdMeeting();
        projectManager.showTeam();

        System.out.println();

        programmer1.printInfo();
        programmer1.writeCode();

        System.out.println();

        programmer2.printInfo();
        programmer2.writeCode();

    }
}
