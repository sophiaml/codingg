package com.agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Agenda de Contactos ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefono: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    manager.add(new Contact(name, phone, email));
                    System.out.println("Contacto agregado.");
                    break;
                case "2":
                    if (manager.listAll() == null || manager.listAll().isEmpty()) {
                        System.out.println("No hay contactos todavia.");
                    } else {
                        for (Contact c : manager.listAll()) {
                            System.out.println(c);
                        }
                    }
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }

        scanner.close();
    }
}
