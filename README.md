# Agenda de Contactos

Proyecto en Java para aprender POO y manejo de archivos.

Permite agregar contactos (nombre, telefono, email) y verlos, guardandolos
en un archivo de texto `contactos.txt` para que no se pierdan al cerrar el programa.

## Como ejecutar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.agenda.Main"
```

O compilando el jar:

```bash
mvn package
java -jar target/agenda-contactos.jar
```

## Estructura

- `Contact.java`: representa un contacto individual.
- `ContactManager.java`: maneja la lista de contactos y su guardado/carga en archivo.
- `Main.java`: menu por consola para interactuar con la agenda.
