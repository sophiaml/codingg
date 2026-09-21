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
        contacts.add(contact);
        save();
    }

    public List<Contact> listAll() {
        return contacts;
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
        public String getFILE_NAME(){
            Contact.fromFileLine(linea);
            contacts.add(Contact);

        // Pista: usa try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) { ... }
        // File file = new File(FILE_NAME); if (!file.exists()) return;
    }
}
