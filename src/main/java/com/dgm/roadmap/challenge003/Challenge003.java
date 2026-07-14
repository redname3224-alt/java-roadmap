package com.dgm.roadmap.challenge003;
import java.util.*;
/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */


public class Challenge003 {

    public static boolean validatePhoneNumber(String phoneNumber) {
        boolean valid = true;
        if (!phoneNumber.matches("\\d{1,11}")) {
            System.out.println("Invalid phone number");
            valid = false;
        }
        return valid;
    }

    public static String getContact(Map<String, String>map,String name){
        return map.get(name);
    }

    public static void addContact(Map<String, String>map,String name, String phone){
        if(validatePhoneNumber(phone)) {
            if (map.containsKey(name)) {
                System.out.println("Contact already exists");
            } else {
                map.put(name, phone);
                System.out.println("Contact added successfully");
            }
        }
    }

    public static void updateContact(Map<String, String>map,String name, String phone){
        if(validatePhoneNumber(phone)) {
            if (map.containsKey(name)) {
                map.put(name, phone);
                System.out.println("Contact updated successfully");
            }else{
                System.out.println("Contact not found");
            }
        }
    }

    public static void removeContact(Map<String, String>map,String name){
        if (map.containsKey(name)){
            map.remove(name);
            System.out.println("Contact removed successfully");
        }else{
            System.out.println("Contact not found");
        }
    }

    static void main() {

        //VARIABLES
        Scanner input = new Scanner(System.in);
        Map<String, String> contactBook = new TreeMap<>();
        int option=0;
        String name,phone;

        //LISTS EXAMPLE
        System.out.println("===== ARRAYLIST EXAMPLE =====");
        List<String> list = new ArrayList<>();
        System.out.println("Empty String list created");
        System.out.println("Current list: "+list);
        System.out.println("Adding names to the list");
        list.add("John");
        list.add("Mark");
        list.add("Jane");
        System.out.println("After insertion: "+list);
        System.out.println("Updating the first element");
        list.set(0, "Antoine");
        System.out.println("After update: "+list);
        System.out.println("Removing a name from the list");
        list.remove("Antoine");
        System.out.println("After removal: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
        System.out.println();

        //SETS EXAMPLE
        // TreeSet keeps elements sorted automatically.
        System.out.println("===== TREESET EXAMPLE =====");
        Set<String> set = new TreeSet<>();
        System.out.println("Creating a set");
        set.add("John");
        set.add("Mark");
        set.add("Jane");
        System.out.println("After insertion set: "+set);
        set.add("John");
        System.out.println("After attempting to add a duplicate: "+set);
        System.out.println("Contains Jane: "+set.contains("Jane"));
        set.remove("Jane");
        System.out.println("After removal: "+set);
        System.out.println();


        System.out.println("===== QUEUE EXAMPLE =====");
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Mark");
        queue.offer("Jane");
        System.out.println("After insertion: " + queue);
        System.out.println("First element: " + queue.peek());
        queue.poll();
        System.out.println("After removing the first element: " + queue);
        System.out.println();

        // MAP EXAMPLE (TreeMap)
        // The contact book uses a TreeMap, demonstrating insertion, search,
        // update, removal and automatic key ordering.
        do {
            System.out.println("""
                    ===== CONTACT BOOK =====
                     1.Search a contact
                     2.Add a contact
                     3.Update a contact
                     4.Delete a contact
                     5.Exit
                    """);
            System.out.print("Enter option: ");
            try {
                option = input.nextInt();
                input.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Enter contact name: ");
                        name = input.nextLine();
                        phone = getContact(contactBook,name);

                        if(phone!=null){
                            System.out.println(name+":"+phone);
                        }else{
                            System.out.println("No contact found with that name");
                        }
                        break;
                    case  2:
                        System.out.println("Enter contact name: ");
                        name = input.nextLine();
                        System.out.println("Enter contact phone: ");
                        phone = input.nextLine();
                        addContact(contactBook,name, phone);
                        break;
                    case 3:
                        System.out.println("Enter contact name: ");
                        name = input.nextLine();
                        System.out.println("Enter contact phone: ");
                        phone = input.nextLine();
                        updateContact(contactBook,name, phone);
                        break;
                    case 4:
                        System.out.println("Enter contact name: ");
                        name = input.nextLine();
                        removeContact(contactBook,name);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }catch(InputMismatchException e){
                System.out.println("Invalid input. Try again.");
                input.nextLine();
            }
        } while(option!=5);

    }
}
