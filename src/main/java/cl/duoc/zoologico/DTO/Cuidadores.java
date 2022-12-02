package cl.duoc.zoologico.DTO;

import java.time.LocalDate;

public class Cuidadores {
    private static int uid;
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private int rut;
    private int telefono;
    private boolean estadoCivil;

    public Cuidadores(int id, String nombre, String apellido, LocalDate fechaDeNacimiento, int rut, int telefono, boolean estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.rut = rut;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
    }
    
    public Cuidadores() {
        this.id = uid;
        uid = uid + 10;
        this.nombre = "";
        this.apellido = "";
        this.fechaDeNacimiento = LocalDate.now();
        this.rut = 0;
        this.telefono = 0;
        this.estadoCivil = false;
    }

    public static int getUid() {
        return uid;
    }

    public static void setUid(int uid) {
        Cuidadores.uid = uid;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
