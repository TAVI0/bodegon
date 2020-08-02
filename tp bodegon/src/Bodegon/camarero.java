package Bodegon;

public class camarero extends persona{
    
    stockPersonas pr = stockPersonas.getInstancia();
    menuFinal mn = menuFinal.getInstancia();
    private int cont=0;

    public camarero(String nombre, String codigo, String contraseña) {
        super(nombre, codigo, contraseña);
        this.setTipo("camarero");
    }
    
    @Override
    public void trabajar() {
        boolean trabajar = true;
        int opc;
        do{
            opc = entradaSalida.leerInt(this.getNombre()+"\n[1]Cargar Pedido\n[0]Salir");
            if(opc==1)
                cargarPedido(mn);
            if(opc==0)
                trabajar=false;
        }while (trabajar);            
            
        
    }
    
    void cargarPedido(menuFinal mn){
        int opc = entradaSalida.leerInt(mn.listaMenuFinal()+"\nSeleccione receta");
        int cont = mn.getMenu().get(opc).getCont();
        int precio =mn.getMenu().get(opc).getPrecio();
        mn.getMenu().get(opc).setCont(cont++);
        mn.setRecaudacion(mn.getRecaudacion() + precio);
        this.cont++;
        
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }



}
