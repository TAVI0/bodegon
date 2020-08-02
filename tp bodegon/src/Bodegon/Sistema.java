package Bodegon;

public class Sistema {
    stockPersonas pr = stockPersonas.getInstancia();
    menuFinal mn = menuFinal.getInstancia();

    
    persona arranque(stockPersonas pr){
        boolean verif;
        String cod = entradaSalida.leerString("Ingrese codigo de usuario");
        verif = pr.buscarUsuario(cod);

        if (verif){
            String contr = entradaSalida.leerPassword("Ingrese contraseña de usuario");
            verif = pr.comparaContraseña(cod, contr);
            if(verif){
                return pr.selectUsuario(cod, contr);

            }else entradaSalida.mostrarString("Codigo y contraseña no coinciden");
        }else entradaSalida.mostrarString("Codigo no enconrado");
        
        return null;
        }
}