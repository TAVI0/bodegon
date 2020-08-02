package Bodegon;

public class bebida extends consumible {

    private String tamaño;

    public bebida(String nombre, int precio, int cont, String tamaño) {
        super(nombre, precio, cont);
        this.tamaño = tamaño;
        this.setTipo("bebida");
    }

    @Override
    public String detallesCons() {
        return this.getNombre() + " " + this.tamaño+" $"+this.getPrecio();
        
    }

    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}
