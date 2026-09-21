package com.agenda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private static final String FILE_NAME = "contactos.txt";
    private List<Contact> contacts = new ArrayList<>();

    public ContactManager() {
        load();
    }

    public void add(Contact contact) {
        contacts.add(contacts);
        save();
    }

    public List<Contact> listAll() {
        // TODO 3: devuelve la lista de contactos.
        return null;
    }

    private void save() {
        // TODO 4: escribe cada contacto de "contacts" en el archivo FILE_NAME,
        // una linea por contacto, usando contact.toFileLine().
        //
        // Pista: usa try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) { ... }
        // y dentro, para cada contacto: writer.write(...); writer.newLine();
        // No olvides el catch (IOException e) para manejar errores.
    }

    private void load() {
        // TODO 5: si el archivo FILE_NAME existe, leelo linea por linea
        // y por cada linea crea un Contact con Contact.fromFileLine(linea)
        // y agregalo a "contacts".
        //
        // Pista: usa try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) { ... }
        // File file = new File(FILE_NAME); if (!file.exists()) return;
    }
}
