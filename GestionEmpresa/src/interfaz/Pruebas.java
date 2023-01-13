/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import bd.GestionBD;
import java.util.ArrayList;
import modelos.Departamento;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author Manuel Lopez Rojas
 */
public class Pruebas {
    
    public static void main(String[] args){
        GestionBD gbd = new GestionBD("localhost","usuario","usuario","empresa",3306);
        Departamento dpto = new Departamento(1, "Servicios Generales");
//        gbd.insertarDepartamento(dpto);
//        Empleado emp = new Empleado(0, "Jose", "Sanchez", "js@company.com", dpto, 999);
//        gbd.insertarEmpleado(emp);
          Empleados empleados = gbd.listarEmpleado();
          empleados.toString();
    }
}
