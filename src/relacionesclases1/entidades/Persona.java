package relacionesclases1.entidades;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

    public Persona crearPersona() {
        Scanner read = new Scanner(System.in);
        Persona person = new Persona();
        //System.out.println("Ingrese el nombre de la persona:");
        person.setNombre("Facundo");
//        System.out.println("Ingrese el apellido de la persona: ");
//        person.setApellido(read.next());
//        System.out.println("Ingrese la edad del a persona: ");
//        person.setEdad(read.nextInt());
//        System.out.println("Ingrese el dni de la persona: ");
//        person.setDocumento(read.nextInt());
//        person.setPerro(perro);

        return person;
    }

    public void mostrarPersonaYmascota(Persona person) {
        System.out.println(person.getNombre());
        System.out.println(person.getApellido());
        System.out.println(person.getEdad());
        System.out.println(person.getDocumento());
        System.out.println(person.getPerro());

    }

}
