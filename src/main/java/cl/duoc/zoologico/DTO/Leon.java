package cl.duoc.zoologico.DTO;

public class Leon extends Animal{
    private int largoMelena;

    public Leon(int largoMelena, int id, String nombre, String raza, String color, int edad, boolean vegano) {
        super(id, nombre, raza, color, edad, vegano);
        this.largoMelena = largoMelena;
    }

    public Leon(int largoMelena) {
        super();
        this.largoMelena = largoMelena;
    }
    
      public Leon() {
        super();
        this.largoMelena = 0;
    }

    public int getLargoMelena() {
        return largoMelena;
    }

    public void setLargoMelena(int largoMelena) {
        this.largoMelena = largoMelena;
    }
    
      
    @Override
    public String toString() {
        return "El/la leon/a "+this.nombre+ " tiene "+this.edad + 
                ", de color "+ this.color+ 
                " tiene una melena de "+ this.largoMelena+
                (this.isVegano()? " si":" no")+ " es vegano/a";
    }
    
    
}
