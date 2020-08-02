package Bodegon;

public class preparacion extends consumible {
    

    private String detalles;

    public preparacion(String nombre, int precio, int cont, String detalles) {
        super(nombre, precio, cont);
        this.detalles = detalles;
        this.setTipo("preparacion");
    }
    
    @Override
    public String detallesCons() {
        return this.getNombre() + " " + this.getDetalles()+" $"+this.getPrecio(); 
    }
    
    public String detallesCocina(){
        return "Nombre: "+this.getNombre()
                +"\n Detalles: "+this.getDetalles();
    }
    

    public String getDetalles() {
        return detalles;
    }
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }



    

}
