/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.zoologico.GUI;

import cl.duoc.zoologico.DTO.Jirafa;
import cl.duoc.zoologico.Service.Implementacion.listaJirafa;
import cl.duoc.zoologico.Utils.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class vwJirafa extends javax.swing.JInternalFrame {

    Validaciones validar = new Validaciones();
    listaJirafa lista = new listaJirafa();
    
    int idModificar = 0;
    int id = 10;
    boolean modificar = false;
    
    /**
     * Creates new form vwJirafa
     */
    public vwJirafa() {
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

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        raza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        color = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        vegano = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        largo = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoLista = new javax.swing.JTextArea();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modificacion = new javax.swing.JTextField();
        eliminacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cuidadores = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agendar Jirafa");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Raza:");

        raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Africana", "Australiana", "Chilena" }));

        jLabel3.setText("Color:");

        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Amarilla", "Café", "Roja" }));

        jLabel4.setText("Edad:");

        jLabel5.setText("Vegano:");

        jLabel6.setText("Largo Cuello:");

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        textoLista.setColumns(20);
        textoLista.setRows(5);
        jScrollPane1.setViewportView(textoLista);

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese ID a modificar:");

        jLabel8.setText("Ingrese ID a eliminar:");

        jLabel9.setText("Seleccione cuidador:");

        cuidadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Juanito", "AlanBrito", "Leno" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuidadores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(largo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vegano)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(raza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminacion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(vegano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuidadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonLimpiar)
                            .addComponent(botonEnviar))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonModificar)
                            .addComponent(jLabel7)
                            .addComponent(modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonEliminar)
                                .addComponent(eliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
        String nombres = nombre.getText();
        String razas = String.valueOf(raza.getSelectedItem());
        String colores = String.valueOf(color.getSelectedItem());
        int edades = Integer.parseInt(edad.getText());
        boolean veganos = vegano.isSelected();
        int largoCuello = Integer.parseInt(largo.getText());  
        
        if(!razas.contains("seleccione")&&!nombres.isBlank()){
            if(validar.largoMinimoPalabra(3, nombres)){
                Jirafa jirafa1 = new Jirafa();
                jirafa1.setNombre(nombres);
                jirafa1.setEdad(edades);
                jirafa1.setRaza(razas);
                jirafa1.setColor(colores);
                jirafa1.setLargoCuello(largoCuello);
                jirafa1.setVegano(veganos);
                if(!modificar){ 
                    jirafa1.setId(id);
                    lista.agregarJirafa(jirafa1);
                    id = id + 10;
                    JOptionPane.showMessageDialog(this, "Jirafa guardada");
                }else{
                    jirafa1.setId(idModificar);
                    lista.modificarJirafa(jirafa1);
                    botonEnviar.setText("Enviar");
                    modificar = false;
                }
                limpiarJirafa();
                textoLista.setText(lista.imprimirLista());
            }else{
                JOptionPane.showMessageDialog(null, "El largo del nombre no es valido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una raza o coloque un nombre");
        }
    }//GEN-LAST:event_botonEnviarActionPerformed
    
    private void limpiarJirafa(){
        nombre.setText("");
        edad.setText("");
        largo.setText("");
        raza.setSelectedIndex(0);
        color.setSelectedIndex(0);
        vegano.setSelected(false);
    }
    
    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarJirafa();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        try{
            int jirafaid = Integer.parseInt(modificacion.getText());
            modificacion.setText("");
            Jirafa jirafa = new Jirafa();
            jirafa = lista.buscarJirafa(jirafaid);
            idModificar = jirafa.id;
            if(jirafa.id > 0){
                modificar = true;
                botonEnviar.setText("Guardar");
                nombre.setText(jirafa.nombre);
                edad.setText(String.valueOf(jirafa.getEdad()));
                largo.setText(String.valueOf(jirafa.getLargoCuello()));
                raza.setSelectedItem(jirafa.getRaza());
                color.setSelectedItem(jirafa.getColor());
                vegano.setSelected(jirafa.isVegano());
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
            int jirafaid = Integer.parseInt(eliminacion.getText());
            eliminacion.setText("");
            Jirafa jirafa = new Jirafa();
            jirafa = lista.buscarJirafa(jirafaid);
            if(jirafa.id > 0){
                lista.eliminarId(jirafa.id);
                textoLista.setText(lista.imprimirLista());
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
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JComboBox<String> cuidadores;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField eliminacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largo;
    private javax.swing.JTextField modificacion;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> raza;
    private javax.swing.JTextArea textoLista;
    private javax.swing.JCheckBox vegano;
    // End of variables declaration//GEN-END:variables
}
