/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confpantalla.Vista;

import confpantalla.Modelo.ModeloCP;

/**
 *
 * @author electra
 */
public class VistaCP extends javax.swing.JFrame {

    ControladorCP control;
    ModeloCP modelo;
    /**
     * Creates new form VistaCP
     */
    public VistaCP() {
        
        modelo = new ModeloCP();
        control = new ControladorCP(this,modelo);
        initComponents();
        ocultarErrores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelBrilloContr = new javax.swing.JPanel();
        jSliderBrillo = new javax.swing.JSlider();
        jSliderContraste = new javax.swing.JSlider();
        jLabelBrillo = new javax.swing.JLabel();
        jLabelContraste = new javax.swing.JLabel();
        jPanelGiro = new javax.swing.JPanel();
        giroHor = new javax.swing.JRadioButton();
        giroVert = new javax.swing.JRadioButton();
        giroHorInvert = new javax.swing.JRadioButton();
        giroVertInvert = new javax.swing.JRadioButton();
        jPanelResolucion = new javax.swing.JPanel();
        jComboBoxResolucion = new javax.swing.JComboBox();
        jPanelColores = new javax.swing.JPanel();
        jComboBoxColores = new javax.swing.JComboBox();
        etiqResolucion = new javax.swing.JLabel();
        etiqColores = new javax.swing.JLabel();
        etiqGiro = new javax.swing.JLabel();
        jButtonAplicar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelErrorColor = new javax.swing.JLabel();
        jLabelErrorResolucion = new javax.swing.JLabel();
        jLabelNotificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBrilloContr.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelBrillo.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabelBrillo.setText("Brillo");

        jLabelContraste.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabelContraste.setText("Contraste");

        javax.swing.GroupLayout jPanelBrilloContrLayout = new javax.swing.GroupLayout(jPanelBrilloContr);
        jPanelBrilloContr.setLayout(jPanelBrilloContrLayout);
        jPanelBrilloContrLayout.setHorizontalGroup(
            jPanelBrilloContrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBrilloContrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBrilloContrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBrilloContrLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSliderContraste, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBrilloContrLayout.createSequentialGroup()
                        .addGroup(jPanelBrilloContrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBrillo)
                            .addComponent(jLabelContraste))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBrilloContrLayout.setVerticalGroup(
            jPanelBrilloContrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBrilloContrLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelBrillo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabelContraste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderContraste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanelGiro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonGroup1.add(giroHor);
        giroHor.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        giroHor.setSelected(true);
        giroHor.setText("Horizontal (0º)");

        buttonGroup1.add(giroVert);
        giroVert.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        giroVert.setText("Vertical (90º)");

        buttonGroup1.add(giroHorInvert);
        giroHorInvert.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        giroHorInvert.setText("Horizontal invertido(180º)");

        buttonGroup1.add(giroVertInvert);
        giroVertInvert.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        giroVertInvert.setText("Vertical invertido (270º)");
        giroVertInvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giroVertInvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGiroLayout = new javax.swing.GroupLayout(jPanelGiro);
        jPanelGiro.setLayout(jPanelGiroLayout);
        jPanelGiroLayout.setHorizontalGroup(
            jPanelGiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(giroHor)
                    .addComponent(giroVert)
                    .addComponent(giroHorInvert)
                    .addComponent(giroVertInvert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGiroLayout.setVerticalGroup(
            jPanelGiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGiroLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(giroHor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giroVert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giroHorInvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giroVertInvert)
                .addGap(16, 16, 16))
        );

        jPanelResolucion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBoxResolucion.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jComboBoxResolucion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "R1152x768", "R1024x768", "R896x600", "R800x600" }));

        javax.swing.GroupLayout jPanelResolucionLayout = new javax.swing.GroupLayout(jPanelResolucion);
        jPanelResolucion.setLayout(jPanelResolucionLayout);
        jPanelResolucionLayout.setHorizontalGroup(
            jPanelResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResolucionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanelResolucionLayout.setVerticalGroup(
            jPanelResolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResolucionLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jComboBoxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanelColores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBoxColores.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jComboBoxColores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CMYK", "RGB", "HSB" }));

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jComboBoxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jComboBoxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etiqResolucion.setText("Resolución");

        etiqColores.setText("Colores");

        etiqGiro.setText("Giro");

        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelErrorColor.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorColor.setText("Color no soportado");

        jLabelErrorResolucion.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorResolucion.setText("Resolucion no soportada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanelBrilloContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqGiro)
                            .addComponent(jPanelGiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqResolucion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqColores)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelErrorColor)
                                    .addComponent(jLabelErrorResolucion))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAplicar)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiqGiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBrilloContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelErrorColor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelErrorResolucion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqColores)
                            .addComponent(etiqResolucion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelColores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelResolucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonAplicar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giroVertInvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giroVertInvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giroVertInvertActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        control.aceptar();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        control.cancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarActionPerformed
        control.aplicar();
    }//GEN-LAST:event_jButtonAplicarActionPerformed

    public void actualizar(){
        jSliderBrillo.setValue(modelo.getBrillo());
        jSliderContraste.setValue(modelo.getContraste());
        jComboBoxColores.setSelectedItem(modelo.getColor());
        jComboBoxResolucion.setSelectedItem(modelo.getResolucion());
        jLabelNotificacion.setText("Valores actuales: Brillo:"+modelo.getBrillo()+
                " Contraste:"+modelo.getContraste()+" Giro:"+modelo.getGiro()+
                " Resolucion:"+modelo.getResolucion()+" Color:"+modelo.getColor());
    }
    
    
    public int getBrillo(){
        return jSliderBrillo.getValue();
    }
    public int getContraste(){
        return jSliderContraste.getValue();
    }
    public int getGiro(){
        int g = 0;
        
        if(giroHor.isSelected()){
            g = 0;
        }
        if(giroHorInvert.isSelected()){
            g = 180;
        }
        if(giroVert.isSelected()){
            g = 90;
        }
        if(giroVertInvert.isSelected()){
            g = 270;
        }
        return g;
    }
    public String getColor(){
        return String.valueOf(jComboBoxColores.getSelectedItem());
    }
    public String getResolucion(){
        return String.valueOf(jComboBoxResolucion.getSelectedItem());
    }
    
    public void mostrarErrorColor(){
        jLabelErrorColor.setVisible(true);
    }
    public void mostrarErrorResol(){
        jLabelErrorResolucion.setVisible(true);
    }
    public void ocultarErrores(){
        jLabelErrorColor.setVisible(false);
        jLabelErrorResolucion.setVisible(false);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiqColores;
    private javax.swing.JLabel etiqGiro;
    private javax.swing.JLabel etiqResolucion;
    private javax.swing.JRadioButton giroHor;
    private javax.swing.JRadioButton giroHorInvert;
    private javax.swing.JRadioButton giroVert;
    private javax.swing.JRadioButton giroVertInvert;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox jComboBoxColores;
    private javax.swing.JComboBox jComboBoxResolucion;
    private javax.swing.JLabel jLabelBrillo;
    private javax.swing.JLabel jLabelContraste;
    private javax.swing.JLabel jLabelErrorColor;
    private javax.swing.JLabel jLabelErrorResolucion;
    private javax.swing.JLabel jLabelNotificacion;
    private javax.swing.JPanel jPanelBrilloContr;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JPanel jPanelGiro;
    private javax.swing.JPanel jPanelResolucion;
    private javax.swing.JSlider jSliderBrillo;
    private javax.swing.JSlider jSliderContraste;
    // End of variables declaration//GEN-END:variables
}
