package com.agenda;

public class Contact {

    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Convierte el contacto a una linea de texto para guardarlo en el archivo.
    // Ejemplo: "Ana;123456789;ana@mail.com"
    public String toFileLine() {
        return name + ";" + phone + ";" + email;
    }

    // Reconstruye un Contact a partir de una linea leida del archivo.
    public static Contact fromFileLine(String line) {
        String[] parts = line.split(";");
        return new Contact(parts[0], parts[1], parts[2]);
    }

    @Override
    public String toString() {
        return name + " | Tel: " + phone + " | Email: " + email;
    }
}
