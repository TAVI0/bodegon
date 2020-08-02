
package Bodegon;

public abstract class persona {
    private String nombre;
    private String codigo;
    private String contraseña;  
    private String tipo;
    
    public persona(String nombre, String codigo, String contraseña) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contraseña = contraseña;
    }
    
    public abstract void trabajar();
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
}
