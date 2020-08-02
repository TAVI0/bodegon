package Bodegon;

public class bodegon {
    
    public static void main(String[] args) {
        stockPersonas pr= stockPersonas.getInstancia();
        menuFinal mn =  menuFinal.getInstancia();
        persona per = null;

        
        if(pr.getEmpleados().isEmpty()){
            administrador adm = new administrador("Juan Carlos", "juanca1234", "123");
            adm.setNombre(entradaSalida.leerString("Ingrese nombre del Admin"));
            adm.setCodigo(entradaSalida.leerString("Ingrese codigo del Admin"));
            adm.setContraseña(entradaSalida.leerPassword("Ingrese contraseña del Admin"));
            
            pr.agregar(adm);
        }
                 
        Sistema sist =new Sistema();
        do{
            do{
                per = sist.arranque(pr);
            }while(per==null);
        
            per.trabajar();
            entradaSalida.mostrarString("Hasta pronto!");
        }while (true);            
            
        }
        
}
    
    

