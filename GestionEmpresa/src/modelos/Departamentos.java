/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Manuel Lopez Rojas
 */
public class Departamentos {
    ArrayList<Departamento> lista;
    
    // Constructores
    public Departamentos(){
        lista = new ArrayList();
    }
    
    // Métodos SET
    // Añadir
    public void addDepartamento(Departamento dpto){
        lista.add(dpto);
    }
    
    public boolean removeDepartamento( int idDep){
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getIdDepartamento() == idDep){
                lista.remove(i);
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    // Métodos GET
    /**
     * Devuelve el departamento, si no lo encuentra devuelve nulo.
     * @param idDep id del departamento a buscar.
     * @return el objeto departamento si se encuentra, nulo si no.
     */
    /*
    Departamento getDepartamento( int idDep){
        Departamento dptoEncontrado = null;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getIdDepartamento() == idDep){
                dptoEncontrado = lista.get(i);
            }
        }
        return dptoEncontrado;
    }
    */
    
    public int size(){
        return lista.size();
    }
    
    public Departamento getDepartamento(int posicion){
        return lista.get(posicion);
    }
    
}
