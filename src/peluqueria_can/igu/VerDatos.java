/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peluqueria_can.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peluqueria_can.logic.Controlador;
import peluqueria_can.logic.Mascota;


public class VerDatos extends javax.swing.JFrame {
    
    Controlador control=null;

 
    public VerDatos() {
        control= new Controlador ();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascota = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Blackletter", 1, 36)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        tblMascota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMascota);

        btnEliminar.setIcon(new javax.swing.ImageIcon("A:\\DESARROLLO EN SISTEMAS\\III CICLO IDAT\\APLICACIONES I\\DAA_1\\PRACTICA\\Peluqueria_can\\src\\peluqueria_can\\img\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon("A:\\DESARROLLO EN SISTEMAS\\III CICLO IDAT\\APLICACIONES I\\DAA_1\\PRACTICA\\Peluqueria_can\\src\\peluqueria_can\\img\\cerrar-sesion.png")); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEditar2.setIcon(new javax.swing.ImageIcon("A:\\DESARROLLO EN SISTEMAS\\III CICLO IDAT\\APLICACIONES I\\DAA_1\\PRACTICA\\Peluqueria_can\\src\\peluqueria_can\\img\\editar.png")); // NOI18N
        btnEditar2.setText("Editar");
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(468, 468, 468)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //getRowCount (Cuenta la cantidad de filas de la tabla)
        if (tblMascota.getRowCount()>0){
            //controlo que se seleccione uno si es -1 es porque no hay nada si es distinto se puede proceder a eliminar 
            if (tblMascota.getSelectedRow()!=-1){
               //trae la fila seleccionada en la columna 0 trae el valor y convertir luego en string 
                int num_cliente= Integer.parseInt(String.valueOf(tblMascota.getValueAt(tblMascota.getSelectedRow(),0)));
                //Llama al metodo borrar
                control.borrarMascota(num_cliente);
                
                //aviso al usuario que borro correctamente
                mostrarMensaje("Mascota eliminada correctamente","Info","Borrado de Mascotas");
                //Actualiza la tabla
                cargarTabla();
                            
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error ", "Error al eliminar");
                
            }
        }
        
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error","Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
       
            if (tblMascota.getRowCount()>0){
                if (tblMascota.getSelectedRow()!=-1){
                int num_cliente= Integer.parseInt(String.valueOf(tblMascota.getValueAt(tblMascota.getSelectedRow(),0)));
                
                    ModificarDatos pantallamodif= new ModificarDatos(num_cliente);
                    pantallamodif.setVisible(true);
                    pantallamodif.setLocationRelativeTo(null);
                    this.dispose();
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error ", "Error al eliminar");
                
            }
        }
        
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error","Error al eliminar");
        }
            
        
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal princi = new Principal();
        this.setVisible(false);
       
        
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        JOptionPane optionPane=new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);    
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascota;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //Definimos el modelo de la tabla
        //Este metodo personaliza 
        DefaultTableModel modeloTabla= new DefaultTableModel(){
            //Que filas y columnas no sean editables
           
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        
        //Metodo cargar tabla. Esto hará que no permita la modificación, establecemos nombre de las columnas
        //En un vector, después de esto los establecemos a la tabla
        //traemos la lista de mascota y la logica de la base de datos
        //Creamos  una lista, creamos un array con cada uno de los datos. Agregamos esto a un objeto
        //que se agregara a una tabla
        
        
        //Establecemos los nombres de las columnas
        
        String titulos[]={"Num","Nombre","Raza","Alergico","Atencion","Dueño","Celular"};
        
        //Esto setea establece las columnas
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la BD
        List <Mascota> listaMascotas= control.traerMascotas();
        
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMascotas!=null){
            for(Mascota masco:listaMascotas ){
            Object[] objeto ={masco.getNum_cliente(),masco.getNombre(),masco.getRaza(),masco.getAlergico(),masco.getAtencion_especial(),
            masco.getUnDueno().getNombre(), masco.getUnDueno().getCelDueno()};
            
            modeloTabla.addRow(objeto);
            }
            
        }
      
        tblMascota.setModel(modeloTabla);
        
        

    }
}
