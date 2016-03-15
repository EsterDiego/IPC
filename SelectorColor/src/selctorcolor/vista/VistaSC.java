/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selctorcolor.vista;

import java.awt.Color;
import selectorcolor.modelo.ModeloSC;

/**
 *
 * @author adrdelp
 */
public class VistaSC extends javax.swing.JFrame {
    private ControladorSC micontrolador;
    private ModeloSC mimodelo;
    private int codError=0;

    /**
     * Creates new form VistaSC
     */
    public VistaSC() {
        initComponents();
        mimodelo=new ModeloSC();
        micontrolador=new ControladorSC(this,mimodelo);
        actualiza();
    }
    public int getSlidRojoValue(){
        return slidRojo.getValue();
    }
    public int getSlidVerdeValue(){
        return slidVerde.getValue();
    }
    public int getSlidAzulValue(){
        return slidAzul.getValue();
    }
    public String getTextRojoText(){
        return textRojo.getText();
    }
    public String getTextVerdeText(){
        return textVerde.getText();
    }
    public String getTextAzulText(){
        return textAzul.getText();
    }
    public void setError(int codigo){
        codError=codigo;
    }
    public void actualiza(){
        etiqError1.setVisible(false);
        etiqError2.setVisible(false);
        etiqError3.setVisible(false);
        slidRojo.setValue(mimodelo.getRojo());
        textRojo.setText(String.valueOf(mimodelo.getRojo()));
        slidVerde.setValue(mimodelo.getVerde());
        textVerde.setText(String.valueOf(mimodelo.getVerde()));
        slidAzul.setValue(mimodelo.getAzul());
        textAzul.setText(String.valueOf(mimodelo.getAzul()));
        if (mimodelo.getPulsado()){
           System.out.println("Entro");
           textColor.setText(mimodelo.getRGB());
           micontrolador.procesaLeidoPulsado();
        }
        finalColor.setBackground(Color.decode(mimodelo.getRGB()));
        switch (codError){
            case 1: etiqError1.setVisible(true);
                    break;
            case 2: etiqError2.setVisible(true);
                    break;
            case 3: etiqError3.setVisible(true);
                    break;
        }
        this.setError(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqRojo = new javax.swing.JLabel();
        etiqVerde = new javax.swing.JLabel();
        etiqAzul = new javax.swing.JLabel();
        slidRojo = new javax.swing.JSlider();
        slidVerde = new javax.swing.JSlider();
        slidAzul = new javax.swing.JSlider();
        textRojo = new javax.swing.JTextField();
        textVerde = new javax.swing.JTextField();
        textAzul = new javax.swing.JTextField();
        botObtener = new javax.swing.JButton();
        textColor = new javax.swing.JTextField();
        finalColor = new javax.swing.JTextField();
        etiqError1 = new javax.swing.JLabel();
        etiqError2 = new javax.swing.JLabel();
        etiqError3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqRojo.setText("Rojo");

        etiqVerde.setText("Verde");

        etiqAzul.setText("Azul");

        slidRojo.setMaximum(255);
        slidRojo.setValue(128);
        slidRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidRojoStateChanged(evt);
            }
        });
        slidRojo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                slidRojoPropertyChange(evt);
            }
        });

        slidVerde.setMaximum(255);
        slidVerde.setToolTipText("");
        slidVerde.setValue(128);
        slidVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidVerdeStateChanged(evt);
            }
        });

        slidAzul.setMaximum(255);
        slidAzul.setValue(128);
        slidAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidAzulStateChanged(evt);
            }
        });

        textRojo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textRojoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textRojoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRojoKeyTyped(evt);
            }
        });

        textVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVerdeActionPerformed(evt);
            }
        });
        textVerde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textVerdeKeyReleased(evt);
            }
        });

        textAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAzulActionPerformed(evt);
            }
        });
        textAzul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAzulKeyReleased(evt);
            }
        });

        botObtener.setText("Obtener");
        botObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botObtenerActionPerformed(evt);
            }
        });

        textColor.setEditable(false);
        textColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorActionPerformed(evt);
            }
        });

        finalColor.setEditable(false);
        finalColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalColorActionPerformed(evt);
            }
        });

        etiqError1.setForeground(new java.awt.Color(255, 51, 51));
        etiqError1.setText("Debe ser un numero entero [0-255]");

        etiqError2.setForeground(new java.awt.Color(255, 51, 51));
        etiqError2.setText("Debe ser un numero entero [0-255]");

        etiqError3.setForeground(new java.awt.Color(255, 51, 51));
        etiqError3.setText("Debe ser un numero entero [0-255]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalColor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(etiqError3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botObtener)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etiqAzul)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(slidAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiqVerde)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(slidVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiqRojo)
                                    .addGap(28, 28, 28)
                                    .addComponent(slidRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textRojo)
                            .addComponent(textAzul)
                            .addComponent(textVerde)
                            .addComponent(etiqError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqError2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slidVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqRojo)
                            .addComponent(slidRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(etiqVerde))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiqError1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqError2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqAzul)
                    .addComponent(slidAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(finalColor)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(etiqError3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botObtener)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVerdeActionPerformed

    private void textAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAzulActionPerformed

    private void textColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColorActionPerformed

    private void slidRojoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slidRojoPropertyChange
        
    }//GEN-LAST:event_slidRojoPropertyChange

    private void slidRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidRojoStateChanged
        micontrolador.procesaSlidRojo();
    }//GEN-LAST:event_slidRojoStateChanged

    private void finalColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalColorActionPerformed

    private void slidVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidVerdeStateChanged
        micontrolador.procesaSlidVerde();
    }//GEN-LAST:event_slidVerdeStateChanged

    private void slidAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidAzulStateChanged
        micontrolador.procesaSlidAzul();
    }//GEN-LAST:event_slidAzulStateChanged

    private void textRojoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRojoKeyPressed

    }//GEN-LAST:event_textRojoKeyPressed

    private void textRojoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRojoKeyTyped
        //micontrolador.procesaTextRojo();
    }//GEN-LAST:event_textRojoKeyTyped

    private void textRojoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRojoKeyReleased
        micontrolador.procesaTextRojo();
    }//GEN-LAST:event_textRojoKeyReleased

    private void botObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botObtenerActionPerformed
        micontrolador.procesaPulsado();
    }//GEN-LAST:event_botObtenerActionPerformed

    private void textVerdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textVerdeKeyReleased
        micontrolador.procesaTextVerde();
    }//GEN-LAST:event_textVerdeKeyReleased

    private void textAzulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAzulKeyReleased
       micontrolador.procesaTextAzul();
    }//GEN-LAST:event_textAzulKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botObtener;
    private javax.swing.JLabel etiqAzul;
    private javax.swing.JLabel etiqError1;
    private javax.swing.JLabel etiqError2;
    private javax.swing.JLabel etiqError3;
    private javax.swing.JLabel etiqRojo;
    private javax.swing.JLabel etiqVerde;
    private javax.swing.JTextField finalColor;
    private javax.swing.JSlider slidAzul;
    private javax.swing.JSlider slidRojo;
    private javax.swing.JSlider slidVerde;
    private javax.swing.JTextField textAzul;
    private javax.swing.JTextField textColor;
    private javax.swing.JTextField textRojo;
    private javax.swing.JTextField textVerde;
    // End of variables declaration//GEN-END:variables
}