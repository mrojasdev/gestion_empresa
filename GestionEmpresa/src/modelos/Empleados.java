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
public class Empleados {
    private ArrayList<Empleado> lista;
    
    // Constructores
    public Empleados(){
        lista = new ArrayList();
    }
    
    // Métodos GET
    /*
    public Empleado getEmpleado(int idEmpleado){
        Empleado encontrado = null;
        // Recorremos el listado de empleados
        for (int i = 0; i < lista.size(); i++) {
            // Comprobamos el que tiene el idEmplado que nos proporcionan
            if(idEmpleado == lista.get(i).getIdEmpleado()){
                encontrado = lista.get(i);
            }
        }
        return encontrado;
    }
*/
    public Empleado getEmpleado(int posicion){
        return lista.get(posicion);
    }
    
    // Método SET
    public boolean removeEmpleado(int idEmpleado){
        return lista.remove(this.getEmpleado(idEmpleado));
    }
    
    public boolean addEmpleado(Empleado emp){
        return lista.add(emp);
    }
    
    public int size(){
        return lista.size();
    }
}
