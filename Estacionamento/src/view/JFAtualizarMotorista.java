/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.bean.Motorista;
import model.dao.MotoristaDAO;

/**
 *
 * @author 03969402000
 */
public class JFAtualizarMotorista extends javax.swing.JFrame {

    private static int idMotorista;

    /**
     * Creates new form JFAtualizarMotorista
     */
    public JFAtualizarMotorista(int idMotorista) {
        initComponents();

        MotoristaDAO mdao = new MotoristaDAO();
        Motorista m = mdao.read(idMotorista);
        lblidMotorista.setText(String.valueOf(m.getIdMotorista()));
        jBTNome.setText(m.getNome());
        jBTGenero.setText(m.getGenero());
        jBTCelular.setText(String.valueOf(m.getCelular()));
        jBTRG.setText(String.valueOf(m.getRG()));
        jBTCPF.setText(String.valueOf(m.getCPF()));
        jBTEmail.setText(m.getEmail());
        jBTSenha.setText(m.getSenha());
        
    }
    



/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTNome = new javax.swing.JTextField();
        Nome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBTGenero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBTRG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBTCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBTCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBTEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBTSenha = new javax.swing.JTextField();
        jBTCancelar = new javax.swing.JButton();
        jBTCadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblidMotorista = new javax.swing.JLabel();
        jBntLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar Motorista");

        jBTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNomeActionPerformed(evt);
            }
        });

        Nome.setText("nome");

        jLabel1.setText("genero");

        jLabel2.setText("RG");

        jLabel3.setText("CPF");

        jLabel4.setText("celular");

        jLabel5.setText("email");

        jLabel6.setText("senha");

        jBTCancelar.setText("cancelar");

        jBTCadastrar.setText("cadastrar");
        jBTCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Motorista atualizado");

        lblidMotorista.setText("jLabel8");

        jBntLimpar.setText("LIMPAR");
        jBntLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(112, 112, 112)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBTCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jBTRG)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBTNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBTGenero, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jBTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jBTEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jBTSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jBTCancelar)
                                                    .addComponent(jBTCadastrar)
                                                    .addComponent(jBntLimpar)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lblidMotorista))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nome)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel4)))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblidMotorista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jBntLimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNomeActionPerformed

    private void jBTCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCadastrarActionPerformed
        Motorista m = new Motorista();
        MotoristaDAO mdao = new MotoristaDAO();
        m.setIdMotorista(Integer.parseInt(lblidMotorista.getText()));
        m.setNome(jBTNome.getText());
        m.setGenero(jBTGenero.getText());
        m.setRG(Integer.parseInt(jBTRG.getText()));
        m.setCPF(Integer.parseInt(jBTCPF.getText()));
        m.setEmail(jBTEmail.getText());
        m.setSenha(jBTSenha.getText());
        m.setCelular(Integer.parseInt(jBTCelular.getText()));

             
        mdao.update(m);

// TODO add your handling code here:

        // TODO add your handling code here:

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jBTCadastrarActionPerformed

    private void jBntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLimparActionPerformed

        jBTNome.setText("");
        jBTCPF.setText("");
        jBTRG.setText("");
        jBTGenero.setText("");
        jBTEmail.setText("");
        jBTSenha.setText("");
        jBTCelular.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jBntLimparActionPerformed

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
            java.util.logging.Logger.getLogger(JFAtualizarMotorista.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAtualizarMotorista.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAtualizarMotorista.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAtualizarMotorista.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFAtualizarMotorista frame = new JFAtualizarMotorista(idMotorista);
               frame.setVisible(true);
            }
        });


        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome;
    private javax.swing.JTextField jBTCPF;
    private javax.swing.JButton jBTCadastrar;
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JTextField jBTCelular;
    private javax.swing.JTextField jBTEmail;
    private javax.swing.JTextField jBTGenero;
    private javax.swing.JTextField jBTNome;
    private javax.swing.JTextField jBTRG;
    private javax.swing.JTextField jBTSenha;
    private javax.swing.JButton jBntLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblidMotorista;
    // End of variables declaration//GEN-END:variables
}
