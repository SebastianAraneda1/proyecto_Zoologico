package cl.duoc.zoologico.DTO;

public abstract class Animal {
    public int id;
    public String nombre;
    private String raza;
    public String color;
    public int edad;
    private boolean vegano;

    public Animal(int id, String nombre, String raza, String color, int edad, boolean vegano) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.vegano = vegano;
    }
    
    public Animal() {
        this.id = 0;
        this.nombre = "";
        this.raza = "";
        this.color = "";
        this.edad = 0;
        this.vegano = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }
    
    @Override
    public abstract String toString();
}
