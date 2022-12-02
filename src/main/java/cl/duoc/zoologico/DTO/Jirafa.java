package cl.duoc.zoologico.DTO;

public class Jirafa extends Animal{
    private int largoCuello;

    public Jirafa(int id, String nombre, String raza, String color, int edad, boolean vegano) {
        super(id, nombre, raza, color, edad, vegano);
    }
    
    public Jirafa(int largoCuello) {
        super ();
        this.largoCuello = largoCuello;
    }
    
    public Jirafa() {
        super ();
        this.largoCuello = 0;
    }

    public int getLargoCuello() {
        return largoCuello;
    }

    public void setLargoCuello(int largoCuello) {
        this.largoCuello = largoCuello;
    }
  
    
    @Override
    public String toString() {
        return "ID: "+this.id +" - "+ this.nombre +" es una jirafa que "+ (this.isVegano()? "si":"no")+
                " es vegano/a y el largo de su cuello es de: "+ this.largoCuello+ " cm";
    }
    
}
