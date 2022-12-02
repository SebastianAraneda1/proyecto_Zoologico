/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.zoologico.GUI;

import cl.duoc.zoologico.DTO.Leon;
import cl.duoc.zoologico.Service.Implementacion.listaLeon;
import cl.duoc.zoologico.Utils.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class vwLeon extends javax.swing.JInternalFrame {

    Validaciones validar = new Validaciones();
    listaLeon lista = new listaLeon();
    
    int idModificar = 0;
    int id = 10;
    boolean modificar = false;
    /**
     * Creates new form vwLeon
     */
    public vwLeon() {
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

        textoNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoLargo = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboRaza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboColor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textoEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkVegano = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLeones = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        textoModificacion = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textoEliminacion = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agendar Leon");

        jLabel6.setText("Largo Melena:");

        jLabel2.setText("Raza:");

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Africano", "Australiano", "Chileno" }));

        jLabel3.setText("Color:");

        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Amarillo", "Café", "Rojo" }));

        jLabel4.setText("Edad:");

        jLabel5.setText("Vegano:");

        jLabel1.setText("Nombre:");

        listaLeones.setColumns(20);
        listaLeones.setRows(5);
        jScrollPane1.setViewportView(listaLeones);

        jLabel7.setText("Ingrese id a modificar:");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrese id a eliminar:");

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkVegano)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboRaza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEnviar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(textoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoEliminacion, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(textoModificacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(checkVegano)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textoModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(textoEliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEnviar)
                        .addComponent(jButton2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
        String nombre = textoNombre.getText();
        String raza = String.valueOf(comboRaza.getSelectedItem());
        String color = String.valueOf(comboColor.getSelectedItem());
        int edad = Integer.parseInt(textoEdad.getText());
        boolean vegano = checkVegano.isSelected();
        int melena = Integer.parseInt(textoLargo.getText());
        
        try{
            if(!raza.contains("seleccionar")&&!nombre.isBlank()){
                if(validar.largoMinimoPalabra(3, nombre)){
                    Leon leon = new Leon();
                    leon.setNombre(nombre);
                    leon.setRaza(raza);
                    leon.setColor(color);
                    leon.setEdad(edad);
                    leon.setVegano(vegano);
                    leon.setLargoMelena(melena);
                    if(!modificar){
                        leon.setId(id);
                        lista.agregarLeon(leon);
                        id = id + 10;
                        JOptionPane.showMessageDialog(this, "Leon guardado");
                    }else{
                        leon.setId(idModificar);
                        lista.modificarLeon(leon);
                        botonEnviar.setText("Enviar");
                        modificar = false;

                    }
                    limpiarLeon();
                    listaLeones.setText(lista.imprimirLista());
                }else{
                    JOptionPane.showMessageDialog(null,"El largo del nombre no es valido");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese una raza o nombre valido");
            }    
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente denuevo");
        }
        
    }//GEN-LAST:event_botonEnviarActionPerformed
    private void limpiarLeon(){
        textoNombre.setText(" ");
        comboRaza.setSelectedIndex(0);
        comboColor.setSelectedIndex( 0);
        textoEdad.setText("");
        checkVegano.setSelected(false);
        textoLargo.setText(" ");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarLeon();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        try{
            int leonid = Integer.parseInt(textoModificacion.getText());
            textoModificacion.setText("");
            Leon leon = new Leon();
            leon = lista.buscarLeon(leonid);
            idModificar = leon.id;
            if(leon.id > 0){
                modificar = true;
                botonEnviar.setText("Guardar");
                textoNombre.setText(leon.nombre);
                textoEdad.setText(String.valueOf(leon.getEdad()));
                textoLargo.setText(String.valueOf(leon.getLargoMelena()));
                comboRaza.setSelectedItem(leon.getRaza());
                comboColor.setSelectedItem(leon.getColor());
                checkVegano.setSelected(leon.isVegano());
            }else{
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID incorrecto");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
         try{
            int leonid = Integer.parseInt(textoEliminacion.getText());
            textoEliminacion.setText("");
            Leon leon = new Leon();
            leon = lista.buscarLeon(leonid);
            if(leon.id > 0){
                lista.eliminarLeon(leon.id);
                listaLeones.setText(lista.imprimirLista());
            }else{
                JOptionPane.showMessageDialog(null, "ID inexistente");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ID incorrecto");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JCheckBox checkVegano;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JComboBox<String> comboRaza;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listaLeones;
    private javax.swing.JTextField textoEdad;
    private javax.swing.JTextField textoEliminacion;
    private javax.swing.JTextField textoLargo;
    private javax.swing.JTextField textoModificacion;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
