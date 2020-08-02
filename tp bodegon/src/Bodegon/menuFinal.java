package Bodegon;

import java.util.ArrayList;
import java.util.List;

public class menuFinal {
    private List <consumible> menu;
    private int recaudacion=0;
    
    private static menuFinal instancia;
    
    private menuFinal() {
        menu = new ArrayList();
    }
    
    public static menuFinal getInstancia(){
        if(instancia == null)
            instancia = new menuFinal();
        return instancia;
    }
    
    public String listaMenuFinal(){
        String lista = "";
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getPrecio()!=0 || "preparacion".equals(menu.get(i).getTipo())){
                lista += "[" + i + "] " + menu.get(i).detallesCons()+"\n";
            }
        }
        return lista;
    }
    public String listaBebidasFinal(){
        String lista = "";
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getPrecio()!=0 || "bebidas".equals(menu.get(i).getTipo())){
                lista += "[" + i + "] " + menu.get(i).detallesCons()+"\n";
            }
        }
        return lista;
    }
     
    public String listaMenuAdmin(){
        String lista = "";
        for (int i = 0; i < menu.size(); i++) {
            lista += "[" + i + "] " + menu.get(i).detallesCons()+"\n";
            
        }
        return lista;
    }
    
    void agregar(consumible e){
        menu.add(e);
    }
    
    public List <consumible> getMenu() {
        return menu;
    }
    public void setMenu(List <consumible> menu) {
        this.menu = menu;
    }

    /**
     * @return the recaudacion
     */
    public int getRecaudacion() {
        return recaudacion;
    }

    /**
     * @param recaudacion the recaudacion to set
     */
    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
    }
}
