package cl.duoc.zoologico.Service.Implementacion;

import cl.duoc.zoologico.DTO.Leon;
import java.util.ArrayList;
import java.util.List;

public class listaLeon {
    List<Leon> lista;
    
    public listaLeon(){
        this.lista = new ArrayList();
    }
    
    public void agregarLeon(Leon leon){
        lista.add(leon);
    }
    
    public String imprimirLista(){
    StringBuilder sr = new StringBuilder();
    //por cada Leon instanciado en la lista
    for (Leon leon : lista) {
        sr.append(leon.toString()+ "\n");
    }
    return String.valueOf(sr);
    }
    
    public Leon buscarLeon(int id){
    Leon leon = new Leon();
    for (Leon l : lista) {
        if(id == l.id){
            leon = l;
        }
    }
    return leon;
    }
    
    public void modificarLeon(Leon leon){
        for (int i = 0; i < lista.size(); i++) {
            if(leon.id == lista.get(i).id){
                lista.set(i, leon);
            }
        }
    }
    
    
    public void eliminarLeon(int id){
        for (int i = 0; i < lista.size(); i++) {
            if(id == lista.get(i).id){
                lista.remove(i);
            }
        }
    }
    
}
