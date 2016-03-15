/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import Modelo.ModeloNA;
/**
 *
 * @author adrdelp
 */
public class VistaNA extends javax.swing.JFrame {

    private ControladorNA micontrol;
    private ModeloNA mimodelo;
    /**
     * Creates new form NewJFrame
     */
    public VistaNA() {
        initComponents();
        mimodelo=new ModeloNA();
        micontrol=new ControladorNA(this,mimodelo);
    }
    public String getNumero1(){
        return textnum1.getText();
    }
    public String getNumero2(){
        return textnum2.getText();
    }
    public void actualiza(){
        textnum3.setText(String.valueOf(mimodelo.getResult()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqnum1 = new javax.swing.JLabel();
        etiqnum2 = new javax.swing.JLabel();
        etiqnum3 = new javax.swing.JLabel();
        textnum1 = new javax.swing.JTextField();
        textnum2 = new javax.swing.JTextField();
        textnum3 = new javax.swing.JTextField();
        botsumar = new javax.swing.JButton();
        botborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqnum1.setText("Numero 1");

        etiqnum2.setText("Numero 2");

        etiqnum3.setText("Resultado:");

        textnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnum2ActionPerformed(evt);
            }
        });

        textnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnum3ActionPerformed(evt);
            }
        });

        botsumar.setText("Sumar");
        botsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botsumarActionPerformed(evt);
            }
        });

        botborrar.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqnum1)
                    .addComponent(etiqnum2)
                    .addComponent(etiqnum3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botsumar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(botborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textnum2)
                    .addComponent(textnum3)
                    .addComponent(textnum1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqnum1)
                    .addComponent(textnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqnum2)
                    .addComponent(textnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqnum3)
                    .addComponent(textnum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botsumar)
                    .addComponent(botborrar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textnum1, textnum2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnum2ActionPerformed

    private void textnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnum3ActionPerformed

    private void botsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsumarActionPerformed
        // TODO add your handling code here:
        micontrol.procesaEventoSumar();
    }//GEN-LAST:event_botsumarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botborrar;
    private javax.swing.JButton botsumar;
    private javax.swing.JLabel etiqnum1;
    private javax.swing.JLabel etiqnum2;
    private javax.swing.JLabel etiqnum3;
    private javax.swing.JTextField textnum1;
    private javax.swing.JTextField textnum2;
    private javax.swing.JTextField textnum3;
    // End of variables declaration//GEN-END:variables
}
