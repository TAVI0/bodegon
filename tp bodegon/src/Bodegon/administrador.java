package Bodegon;

public class administrador extends persona{
    
    stockPersonas pr = stockPersonas.getInstancia();
    menuFinal mn = menuFinal.getInstancia();
    
    public administrador(String nombre, String codigo, String contraseña) {
        super(nombre, codigo, contraseña);
        this.setTipo("administrador");
    }
    
    @Override
    public void trabajar() {
        String opc="";
        boolean trabajar= true;
        do{
            opc = entradaSalida.leerString(this.getNombre()+"\n[1]Dar precio al menu\n[2]Dar de alta empleado\n[3]Cargar bebidas\n[4]Cierre de caja\n[0]SALIR");
            if("1".equals(opc))
                darPrecio(mn);
            if("2".equals(opc))
                altaEmpleado(pr);
            if("3".equals(opc))
                cargarBebida(mn);
            if("4".equals(opc))
                
            if("0".equals(opc))
                trabajar=false;
        }while(trabajar);
    }
    
    void cierreCaja(){
        preparacion pr=null;
        int mayorVenta=0;
        for (consumible receta : mn.getMenu()) {
            if(receta.getTipo().equals("preparacion")){
                if(receta.getCont()>mayorVenta){
                    pr =(preparacion) receta;
                    mayorVenta = receta.getCont();
                }
            }
        }
        
        bebida be=null;
        int mayorBebidaVenta=0;
        for (consumible beb : mn.getMenu()) {
            if(beb.getTipo().equals("bebida")){
                if(beb.getCont()>mayorBebidaVenta){
                    be =(bebida) beb;
                    mayorBebidaVenta = beb.getCont();
                }
            }
        }
        
        camarero mayorCam=null;
        int mayorServicio=0;
        for (persona per : this.pr.getEmpleados()) {
            if(per.getTipo().equals("camarero")){
                camarero cam = (camarero) per;
                if(cam.getCont()>mayorServicio){
                    mayorCam = cam;
                    mayorServicio = cam.getCont();
                }
            }
        }
        
        
        entradaSalida.mostrarString("Recaudacion total: "+mn.getRecaudacion()+"\n");
        entradaSalida.mostrarString("Preparacion mas vendida: "+pr.getNombre()+" con "+pr.getCont()+"unidades\n");
        entradaSalida.mostrarString("Bebida mas vendida: "+be.getNombre()+" con "+be.getCont()+"unidades\n");
        entradaSalida.mostrarString("Camarero que mas Atendio: "+mayorCam.getNombre()+" con "+mayorCam.getCont()+"pedidos atendidos\n");
    }
    
    void cargarBebida(menuFinal mn){      
        bebida be = new bebida("", 0, 0, "");
        be.setNombre(entradaSalida.leerString(be.detallesCons()+"\nIngrese el nombre de la bebida"));
        be.setTamaño(entradaSalida.leerString(be.detallesCons()+"\nIngrese el detalle de la bebida"));
        be.setPrecio(entradaSalida.leerInt(be.detallesCons()+"\nIngrese el precio de la bebida"));
        
        mn.agregar(be);  
        }
    
    void darPrecio(menuFinal mn){
        if(!mn.getMenu().isEmpty()){
            int opc=entradaSalida.leerInt(mn.listaMenuAdmin()+"\nSelecciona receta");
            mn.getMenu().get(opc).setPrecio(entradaSalida.leerInt(mn.listaMenuAdmin()+"\nReceta "+opc+" precio:"));
        }else{
            entradaSalida.mostrarString("El menu esta vacio");
        }
    }
    
    void altaEmpleado(stockPersonas empl){
        int opc = 0;
        int confirm =0;
        do{
        opc =entradaSalida.leerInt("Que desea agregar?\n[1]Cocinero\n[2]Camarero\n\n [0]SALIR");
        }while(opc != 0 && opc != 1 && opc != 2);
        if (opc==1){
            cocinero co = new cocinero("", "", "");
            do{
            co.setNombre(entradaSalida.leerString("Ingrese el nombre del Cocinero"));
            co.setCodigo(entradaSalida.leerString("Ingrese el codigo del Cocinero"));
            co.setContraseña(entradaSalida.leerString("Ingrese la contraseña del Cocinero"));
            
            confirm = entradaSalida.leerInt("Son los datos correctos?[0]No [1]Si");
            }while(confirm==0);
            empl.agregar(co);
            entradaSalida.mostrarString("El Cocinero fue agregado");
        }
        
        if (opc==2){
            camarero ca = new camarero("", "", "");
            do{
            ca.setNombre(entradaSalida.leerString("Ingrese el nombre del Camarero"));
            ca.setCodigo(entradaSalida.leerString("Ingrese el codigo del Camarero"));
            ca.setContraseña(entradaSalida.leerString("Ingrese la contraseña del Camarero"));
            
            confirm = entradaSalida.leerInt("Son los datos correctos?[0]No [1]Si");
            }while(confirm==0);
            empl.agregar(ca);
            entradaSalida.mostrarString("El Camarero fue agregado");
        }
    }
}
