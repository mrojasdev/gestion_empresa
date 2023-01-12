/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Manuel Lopez Rojas
 */
public class Empleado {
    // Atributos clase
    private int idEmpleado;
    private String nombre, apellidos, email;
    private Departamento dpto;
    private float salario;
    
    // Constructores
    public Empleado(int idEmpleado, String nombre, String apellidos, String email, Departamento dpto, float salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dpto = dpto;
        this.salario = salario;
    }
    
    public Empleado() {
        this.idEmpleado = -1;
        this.nombre = null;
        this.apellidos = null;
        this.email = null;
        this.dpto = null;
        this.salario = 0;
    }
    
    // Metodos SET

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // Metodos GET

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public float getSalario() {
        return salario;
    }

    
    
    
    
    
    
}
