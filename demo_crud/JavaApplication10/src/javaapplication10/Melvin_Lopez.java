package javaapplication10;

public class Melvin_Lopez {
   
    public class vehiculoCamioneta extends Vehiculo{
    private int nPuertas;
    public vehiculoCamioneta(String marca, String color, int anio, int nLLantas) {
        super(marca, color, anio, nLLantas);
    }
    public int getnPuertas() {
        return nPuertas;
    }
     public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    }
}
