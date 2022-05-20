package relacionesclases1.entidades;

import java.util.Scanner;

public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private Integer tamanio;
    private Integer juan;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Integer tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    public Perro crearPerro() {
        Scanner read = new Scanner(System.in);
        Perro perr = new Perro();
        System.out.println("Ingrese el nombre de su perro:");
        perr.setNombre(read.next());
        System.out.println("Ingrese la edad de su perro");
        perr.setEdad(read.nextInt());
        System.out.println("Ingrese la raza de su perro:");
        perr.setRaza(read.next());
        System.out.println("Ingrese el tamanio de su perro");
        perr.setTamanio(read.nextInt());

        return perr;
    }

}
