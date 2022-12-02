package cl.duoc.zoologico.Service.Implementacion;

import cl.duoc.zoologico.DTO.Jirafa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listaJirafa {
    public List<Jirafa> lista;
    
    public listaJirafa(){
        this.lista = new ArrayList();
    }
    
    public void agregarJirafa(Jirafa j){
        lista.add(j);
    }
    
    public String imprimirLista(){
        StringBuilder sr = new StringBuilder();
        //por cada jirafa en la lista se llama j
        for (Jirafa j : lista) {
            sr.append(j.toString()+ "\n");
        }
        return String.valueOf(sr);
    }
    
    public Jirafa buscarJirafa(int id){
        Jirafa jirafa = new Jirafa();
        for (Jirafa j : lista) {
            if(id == j.id){
                jirafa = j;
            }
        }
        return jirafa;
    }
    
    public void modificarJirafa(Jirafa jirafa){
        for (int i = 0; i < lista.size(); i++) {
            if(jirafa.id == lista.get(i).id){
                lista.set(i, jirafa);
            }
        }
    }
    
    public void eliminarId(int id){
        for (int i = 0; i < lista.size(); i++) {
            if(id == lista.get(i).id){
                lista.remove(i);
            }
        }
    }
}
