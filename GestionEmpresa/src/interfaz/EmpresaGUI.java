/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import bd.GestionBD;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author Manuel Lopez Rojas
 */
public class EmpresaGUI extends javax.swing.JFrame {
    
    // Objeto clase GestionBD para conectarnos a la BD
    GestionBD conexion;
    // Listados de departamentos y empleados
    Departamentos listadoDeptos;
    Empleados listadoEmpleados;
    // Modelos para Jlist y para Combobox
    DefaultListModel modeloJlistDeptos;
    DefaultComboBoxModel modeloComboDeptos;
    // Modelo JlistEmpleados
    DefaultListModel modeloJlistEmps;

    /**
     * Creates new form EmpresaGUI
     */
    public EmpresaGUI() {
        // Inicializamos los datos de Modelos
        modeloJlistDeptos = new DefaultListModel();
        modeloJlistEmps = new DefaultListModel();
        modeloComboDeptos = new DefaultComboBoxModel();
        
        // Inicializamos listado deptos
        listadoDeptos = new Departamentos();
        
        // Instanciamos la conexion
        conexion = new GestionBD("localhost","usuario","usuario","empresa",3306);
        // Cargamos los departamentos y empleados a los objetos
        listadoDeptos = conexion.listarDepartamentos();
        listadoEmpleados = conexion.listarEmpleado();
        cargarDepartamentos();
        cargarEmpleados();
        
        // Código generado por el diseñador
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TabEmpleados = new javax.swing.JPanel();
        PanelListadoEmpleados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEmpleados = new javax.swing.JList<>();
        PanelDetalleEmpleados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnBorrarEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellidosEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboDepartamentos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spinnerSalarioEmpleado = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtEmailEmpleado = new javax.swing.JTextField();
        TabDepartamentos = new javax.swing.JPanel();
        PanelListadoDepartamentos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDeptos = new javax.swing.JList<>();
        PanelDetalleDepartamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdDepto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDepto = new javax.swing.JTextField();
        btnGuardarDepto = new javax.swing.JButton();
        btnNuevoDepto = new javax.swing.JButton();
        btnBorrarDepto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelListadoEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado:"));

        jListEmpleados.setModel(modeloJlistEmps);
        jListEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEmpleadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListEmpleados);

        javax.swing.GroupLayout PanelListadoEmpleadosLayout = new javax.swing.GroupLayout(PanelListadoEmpleados);
        PanelListadoEmpleados.setLayout(PanelListadoEmpleadosLayout);
        PanelListadoEmpleadosLayout.setHorizontalGroup(
            PanelListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListadoEmpleadosLayout.setVerticalGroup(
            PanelListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoEmpleadosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDetalleEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado:"));

        jLabel3.setText("Id:");

        txtIdEmpleado.setEnabled(false);

        jLabel4.setText("Nombre:");

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnBorrarEmpleado.setText("Borrar");
        btnBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos");

        jLabel6.setText("Departamento:");

        comboDepartamentos.setModel(modeloComboDeptos);

        jLabel7.setText("Salario");

        spinnerSalarioEmpleado.setModel(new javax.swing.SpinnerNumberModel(950.0f, 950.0f, null, 1.0f));

        jLabel8.setText("Email");

        txtEmailEmpleado.setText("jTextField1");

        javax.swing.GroupLayout PanelDetalleEmpleadosLayout = new javax.swing.GroupLayout(PanelDetalleEmpleados);
        PanelDetalleEmpleados.setLayout(PanelDetalleEmpleadosLayout);
        PanelDetalleEmpleadosLayout.setHorizontalGroup(
            PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addComponent(txtEmailEmpleado)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBorrarEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarEmpleado)
                        .addContainerGap())
                    .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addComponent(txtApellidosEmpleado)
                        .addContainerGap())
                    .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                        .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboDepartamentos, 0, 162, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinnerSalarioEmpleado))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelDetalleEmpleadosLayout.setVerticalGroup(
            PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDetalleEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEmpleado)
                    .addComponent(btnNuevoEmpleado)
                    .addComponent(btnBorrarEmpleado))
                .addContainerGap())
        );

        javax.swing.GroupLayout TabEmpleadosLayout = new javax.swing.GroupLayout(TabEmpleados);
        TabEmpleados.setLayout(TabEmpleadosLayout);
        TabEmpleadosLayout.setHorizontalGroup(
            TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelListadoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDetalleEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TabEmpleadosLayout.setVerticalGroup(
            TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDetalleEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelListadoEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Empleados", TabEmpleados);

        PanelListadoDepartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado:"));

        jListDeptos.setModel(modeloJlistDeptos);
        jListDeptos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListDeptosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListDeptos);

        javax.swing.GroupLayout PanelListadoDepartamentosLayout = new javax.swing.GroupLayout(PanelListadoDepartamentos);
        PanelListadoDepartamentos.setLayout(PanelListadoDepartamentosLayout);
        PanelListadoDepartamentosLayout.setHorizontalGroup(
            PanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelListadoDepartamentosLayout.setVerticalGroup(
            PanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListadoDepartamentosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDetalleDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Departamento:"));

        jLabel1.setText("Id:");

        txtIdDepto.setEnabled(false);

        jLabel2.setText("Nombre:");

        txtNombreDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDeptoActionPerformed(evt);
            }
        });

        btnGuardarDepto.setText("Guardar");
        btnGuardarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDeptoActionPerformed(evt);
            }
        });

        btnNuevoDepto.setText("Nuevo");
        btnNuevoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDeptoActionPerformed(evt);
            }
        });

        btnBorrarDepto.setText("Borrar");
        btnBorrarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDeptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDetalleDepartamentoLayout = new javax.swing.GroupLayout(PanelDetalleDepartamento);
        PanelDetalleDepartamento.setLayout(PanelDetalleDepartamentoLayout);
        PanelDetalleDepartamentoLayout.setHorizontalGroup(
            PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleDepartamentoLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(btnBorrarDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarDepto)
                .addContainerGap())
        );
        PanelDetalleDepartamentoLayout.setVerticalGroup(
            PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleDepartamentoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDetalleDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDepto)
                    .addComponent(btnNuevoDepto)
                    .addComponent(btnBorrarDepto))
                .addContainerGap())
        );

        javax.swing.GroupLayout TabDepartamentosLayout = new javax.swing.GroupLayout(TabDepartamentos);
        TabDepartamentos.setLayout(TabDepartamentosLayout);
        TabDepartamentosLayout.setHorizontalGroup(
            TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelListadoDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDetalleDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TabDepartamentosLayout.setVerticalGroup(
            TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDetalleDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelListadoDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Departamentos", TabDepartamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDeptoActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        limpiarFormularioEmpleado();
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void jListEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEmpleadosValueChanged
        mostrarEmpleado(jListEmpleados.getSelectedIndex());
    }//GEN-LAST:event_jListEmpleadosValueChanged

    private void jListDeptosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListDeptosValueChanged
        mostrarDepartamento(this.jListDeptos.getSelectedIndex());
    }//GEN-LAST:event_jListDeptosValueChanged

    private void btnNuevoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDeptoActionPerformed
        // Limpiamos los campos del formulario
        limpiarFormularioDepartamento();
    }//GEN-LAST:event_btnNuevoDeptoActionPerformed

    private void btnGuardarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDeptoActionPerformed
        // Creamos un objeto departamento
        Departamento depto = new Departamento();
        // Asignamos los valores de la interfaz
        // Comprobamos que el id existe y no es cadena "
        if(!this.txtIdDepto.getText().isBlank()){
           depto.setIdDepartamento(Integer.parseInt(this.txtIdDepto.getText())); 
        }
        depto.setNombre(this.txtNombreDepto.getText());
        // Llamamos a guardar departamento en la BD
        guardarDepartamento(depto);
    }//GEN-LAST:event_btnGuardarDeptoActionPerformed

    private void btnBorrarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDeptoActionPerformed
        // Creamos un objeto departamento
        Departamento depto = new Departamento();
        // Asignamos valores de interfaz
        // Comprobamos que el id existe y no es cadena "
        if(!this.txtIdDepto.getText().isBlank()){
           depto.setIdDepartamento(Integer.parseInt(this.txtIdDepto.getText())); 
        }
        depto.setNombre(this.txtNombreDepto.getText());
        // Llamamos a borrar departamento en la BD
        borrarDepartamento(depto);
        
    }//GEN-LAST:event_btnBorrarDeptoActionPerformed

    private void btnBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEmpleadoActionPerformed
        // Crear un objeto Empleado
        Empleado emp = new Empleado();
        // Asignamos valores de la interfaz
        if(!txtIdEmpleado.getText().isEmpty()){ // Si no es vacio - No es nuevo
            emp.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
        }
        // Asignamos valores de interfaz en objeto Empleado
        borrarEmpleado(emp);
    }//GEN-LAST:event_btnBorrarEmpleadoActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        // Crear un objeto Empleado
        Empleado emp = new Empleado();
        // Asignamos valores de la interfaz
        // Comprobar que no es un empleado nuevo, es decir, id Empleado es distinto de "" o -1
        if(!txtIdEmpleado.getText().isEmpty()){
            emp.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
        }
        // Almaceno en el objeto emp cada uno de los textfield de la interfaz
        emp.setNombre(txtNombreEmpleado.getText());
        emp.setApellidos(txtApellidosEmpleado.getText());
        emp.setEmail(txtEmailEmpleado.getText());
        emp.setSalario(Float.parseFloat(spinnerSalarioEmpleado.getValue().toString()));
        emp.setDpto(listadoDeptos.getDepartamento(comboDepartamentos.getSelectedIndex()));
        // Pasamos el obketo empleado a guardar
        guardarEmpleado(emp);
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDetalleDepartamento;
    private javax.swing.JPanel PanelDetalleEmpleados;
    private javax.swing.JPanel PanelListadoDepartamentos;
    private javax.swing.JPanel PanelListadoEmpleados;
    private javax.swing.JPanel TabDepartamentos;
    private javax.swing.JPanel TabEmpleados;
    private javax.swing.JButton btnBorrarDepto;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnGuardarDepto;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnNuevoDepto;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JComboBox<String> comboDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListDeptos;
    private javax.swing.JList<String> jListEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spinnerSalarioEmpleado;
    private javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtEmailEmpleado;
    private javax.swing.JTextField txtIdDepto;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreDepto;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
    
    private void cargarDepartamentos(){
        // Limpiar el listado
        modeloJlistDeptos.clear();
        modeloComboDeptos.removeAllElements();
        // Actualizar el listado
        listadoDeptos = conexion.listarDepartamentos();
        
        // Debemos coger los datos de listadoDeptos y cargarlos en modeloJlistDeptos
        
        for (int i = 0; i < listadoDeptos.size(); i++) {
            // Añadimos cada departamento al jListDeptos
            modeloJlistDeptos.addElement(listadoDeptos.getDepartamento(i).getNombre());
            modeloComboDeptos.addElement(listadoDeptos.getDepartamento(i).getNombre());
        }
    }
    
    private void cargarEmpleados(){
        // Limpiar el modelo de empleados
        modeloJlistEmps.clear();
        // Actualizar el listado de empleados
        listadoEmpleados =  conexion.listarEmpleado();
        
        // Meterlo en el jList
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            // Añadimos cada empleado al modelo
            modeloJlistEmps.addElement(listadoEmpleados.getEmpleado(i).getNombre());
        }
    }
    
    private void mostrarDepartamento(int i){
        if(i>=0){
            Departamento deptoSel = new Departamento();
            // Recuperar los datos del departamento
            deptoSel = this.listadoDeptos.getDepartamento(i);
            // Establecer cada uno de los datos en los textfield de la interfaz
            this.txtIdDepto.setText(String.valueOf(deptoSel.getIdDepartamento()));
            this.txtNombreDepto.setText(deptoSel.getNombre());
            this.jListDeptos.setSelectedIndex(0);
        }
        
    }
    
    // Borrar el contenido de los campos del detalle de Departamentos
    private void limpiarFormularioDepartamento(){
        this.txtIdDepto.setText("");
        this.txtNombreDepto.setText("");
    }
    
    private void guardarDepartamento(Departamento depto){
        if(depto.getIdDepartamento() == -1){
            // Comprobar si se trata de un INSERT (Nuevo)
            conexion.insertarDepartamento(depto);
            // Actualizamos el listado de deptos
            cargarDepartamentos();
            // Mostramos el último departamento insertado
            this.jListDeptos.setSelectedIndex(this.listadoDeptos.size()-1);
        }else{
            // O se trata de un UPDATE (Modificando)
            conexion.modificarDepartamento(depto, depto);
            // Guardar la posicion actual jList
            int posSel = this.jListDeptos.getSelectedIndex();
            // Actualizamos el listado de deptos
            cargarDepartamentos();
            // Establecer posicion anterior del jList
            this.jListDeptos.setSelectedIndex(posSel);
        }
    }
    
    private void borrarDepartamento(Departamento depto){
        if(depto.getIdDepartamento()!=-1){
            conexion.borrarDepartamento(depto);
            // Actualizamos el listado de deptos
            cargarDepartamentos();
            this.jListDeptos.setSelectedIndex(this.listadoDeptos.size()-1);
        }
        
    }
    
    private void limpiarFormularioEmpleado(){
        txtIdEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtApellidosEmpleado.setText("");
        txtEmailEmpleado.setText("");
        comboDepartamentos.setSelectedItem(null);
        spinnerSalarioEmpleado.setValue(950);
    }
    
    private void mostrarEmpleado(int i){
        if(i>=0){
            Empleado empSel = new Empleado();
            // Recuperar los datos del Empleado
            empSel = listadoEmpleados.getEmpleado(i);
            // Asignar a los elementos de la GUI los valores del objeto Empleado
            txtIdEmpleado.setText(String.valueOf(empSel.getIdEmpleado()));
            txtNombreEmpleado.setText(empSel.getNombre());
            txtApellidosEmpleado.setText(empSel.getApellidos());
            txtEmailEmpleado.setText(empSel.getEmail());
            spinnerSalarioEmpleado.setValue(empSel.getSalario());
            comboDepartamentos.setSelectedItem(empSel.getDpto().getNombre());
        }
    }
    
    private void borrarEmpleado(Empleado emp){
        // Comprobar que el empleado a borrar tenga un id válido
        if(emp.getIdEmpleado()>-1){
            conexion.borrarEmpleado(emp);
            // Cargar el listado de empleados
            cargarEmpleados();
            // Seleccionar el ultimo empleado
            jListEmpleados.setSelectedIndex(this.listadoEmpleados.size()-1);
        }
    }
    
    private void guardarEmpleado(Empleado emp){
        if(emp.getIdEmpleado()==-1){ // Empleado NUEVO
            conexion.insertarEmpleado(emp);
            // Cargamos los empleados ya que puede haber uno nuevo
            cargarEmpleados();
            jListEmpleados.setSelectedIndex(listadoEmpleados.size()-1);
        }else{ // Modificación
            conexion.modificarEmpleado(emp, emp);
            // Guardamos la posicion
            int posSel = jListEmpleados.getSelectedIndex();
            // Cargamos el listado de empleados
            cargarEmpleados();
            // Establecemos la posicion del empleado modificado
            jListEmpleados.setSelectedIndex(posSel);
        }
    }

}
