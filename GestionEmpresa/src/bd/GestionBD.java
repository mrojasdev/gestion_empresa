/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author Manuel Lopez Rojas
 */
public class GestionBD {
    // Host
    private final String HOST;
    // driver
    // usuario
    private final String USUARIO;
    // contraseña
    private final String PASSWORD;
    // Nombre de la BD
    private final String BD;
    // Puerto
    private final int PUERTO;
    // Conexión
    private Connection conexion;
    
    // Constructor

    public GestionBD(String HOST, String USUARIO, String PASSWORD, String BD, int PUERTO) {
        this.HOST = HOST;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
        this.BD = BD;
        this.PUERTO = PUERTO;
    }
    
    // Metodo conexion con la BD
    private boolean conectar(){
        boolean resultado = true;
        try{
            // Indicamos el driver que vamos a usar
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Inicializar la cadena de conexión
            conexion = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?serverTimezone=UTC",USUARIO,PASSWORD);
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el driver MySQL"+ex.getMessage());
            resultado = false;
        }catch(SQLException ex){
            System.out.println("Error conexión:"+ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    // Metodo Desconectar de la BD
    private boolean desconectar(){
        boolean resultado = true;
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error al desconectar. :"+ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    // Insertar empleado
    public boolean insertarEmpleado(Empleado emp){
        boolean resultadoInsertar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("INSERT INTO empleados(nombre, apellidos, idDepartamento, salario, email)"
                    + " VALUES ('%s','%s','%s','%s','%s')",
                    emp.getNombre(),
                    emp.getApellidos(),
                    emp.getDpto().getIdDepartamento(),
                    emp.getSalario(),
                    emp.getEmail());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoInsertar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar el empleado: "+ex.getMessage());
        }
        return resultadoInsertar;
    }
    
    public boolean insertarDepartamento(Departamento dep){
        boolean resultadoInsertar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("INSERT INTO departamentos(nombre)"
                    + " VALUES ('%s')",
                    dep.getNombre());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoInsertar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar departamento: "+ex.getMessage());
        }
        return resultadoInsertar;
    }
    
    // Método borrar empleado
    public boolean borrarEmpleado(Empleado emp){
        boolean resultadoBorrar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("DELETE FROM empleados WHERE idEmpleado='%s')"
                    ,emp.getIdEmpleado());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoBorrar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar departamento: "+ex.getMessage());
        }
        return resultadoBorrar;
    }
    
    // Método modificar empleado
    public boolean modificarEmpleado(Empleado emp, Empleado emp_new) {
        boolean resultadoModificar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("UPDATE empleados SET nombre='%s', apellidos='%s',"
                    + " idDepartamento= %s, salario= %s, email='%s' WHERE idEmpleado= %s ; ",
                    emp_new.getNombre(),
                    emp_new.getApellidos(),
                    emp_new.getDpto().getIdDepartamento(),
                    emp_new.getSalario(),
                    emp_new.getEmail(),
                    emp.getIdEmpleado());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoModificar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al modificar empleado: "+ex.getMessage());
        }
        return resultadoModificar;
    }
    
    public Empleados listarEmpleado(){
        Empleados listaEmpleados = new Empleados();
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("SELECT * FROM empleados");
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Empleado empleado = new Empleado(
                        rs.getInt("idEmpleado"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("email"),
                        new Departamento(rs.getInt("idDepartamento"), ""),
                        rs.getFloat("salario"));
                listaEmpleados.addEmpleado(empleado);
            }
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al listar empleados: "+ex.getMessage());
        }
        return listaEmpleados;
    }
    
    public boolean modificarDepartamento(Departamento depto, Departamento depto_new){
        boolean resultadoModificar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("UPDATE departamentos SET nombre='%s' WHERE idDepartamento='%s';",
                    depto_new.getNombre(),
                    depto.getIdDepartamento());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoModificar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al modificar empleado: "+ex.getMessage());
        }
        return resultadoModificar;
    }
    
    public boolean borrarDepartamento(Departamento depto){
        boolean resultadoBorrar=false;
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("DELETE FROM empleados WHERE idEmpleado='%s')"
                    ,depto.getIdDepartamento());
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            resultadoBorrar = stmt.execute(sql);
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al borrar departamento: "+ex.getMessage());
        }
        return resultadoBorrar;
    }
    
    public Departamentos listarDepartamentos(){
        Departamentos listaDepartamentos = new Departamentos();
        try {
            // Conectarnos a la BD
            conectar();
            // Creamos la sentencia
            Statement stmt = conexion.createStatement();
            // Preparar la sentencia SQL
            String sql = String.format("SELECT * FROM departamentos");
            // Mostramos la consulta por la consola
            System.out.println("Consulta SQL:"+sql);
            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                        listaDepartamentos.addDepartamento(new Departamento(
                        rs.getInt("idDepartamento"),
                        rs.getString("nombre")));
            }
            // Cerrar la sentencia
            stmt.close();
            // Cerrar la conexion
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al listar departamentos: "+ex.getMessage());
        }
        return listaDepartamentos;
    }
    
    public Departamento buscarDepartamento(String nombreDepto){
            Departamento deptoBuscado = null;
        try {
            conectar();
            Statement stmt = conexion.createStatement();
            String sql = String.format("SELECT * FROM departamentos");
            System.out.println("Consulta SQL:"+sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("idDepartamento") == nombreDepto){
                    Departamento departamento = new Departamento(
                            rs.getInt("idDepartamento"),
                            rs.getString("nombre"));
                    deptoBuscado = departamento;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar departamentos: "+ex.getMessage());
        }
        return deptoBuscado;
    }
    
}
