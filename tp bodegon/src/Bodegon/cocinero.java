package Bodegon;

public class cocinero extends persona{
    menuFinal mn = menuFinal.getInstancia();
    
    public cocinero(String nombre, String codigo, String contraseña) {
        super(nombre, codigo, contraseña);
        this.setTipo("cocinero");
    }
        
    void crearReceta(menuFinal mn){      
        preparacion pr = new preparacion("", 0, 0, "");
        pr.setNombre(entradaSalida.leerString(pr.detallesCocina()+"\nIngrese el nombre de la receta"));
        pr.setDetalles(entradaSalida.leerString(pr.detallesCocina()+"\nIngrese el detalle de la receta"));
        
        mn.agregar(pr);  
        }

    @Override
    public void trabajar() {
        boolean trabajar = true;
        int opc;
        do{
            opc = entradaSalida.leerInt(this.getNombre()+"\n[1]Cargar Receta\n[0]Salir");
            if(opc==1)
                crearReceta(mn);
            if(opc==0)
                trabajar=false;
        }while (trabajar);            
            
        
    }
     
}
