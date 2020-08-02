package Bodegon;

public abstract class consumible {
    
    private String nombre;
    private int precio;
    private int cont;
    private String tipo;

    public consumible(String nombre, int precio, int cont) {
        this.nombre = nombre;
        this.precio = precio;
        this.cont = cont;
    }
    
    public abstract String detallesCons();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
