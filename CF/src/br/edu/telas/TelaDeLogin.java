
package br.edu.telas;


import javax.swing.*;


public class TelaDeLogin extends javax.swing.JFrame {

    public TelaDeLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtextUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JSenha = new javax.swing.JPasswordField();
        MostrarSenha = new javax.swing.JCheckBox();
        LabelTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtextUsuario.setBackground(new java.awt.Color(196, 229, 246));
        JtextUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JtextUsuario.setBorder(null);
        JtextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(JtextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 250, 40));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 170, 60));

        JSenha.setBackground(new java.awt.Color(196, 229, 246));
        JSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JSenha.setBorder(null);
        JSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(JSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 260, 50));

        MostrarSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MostrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        MostrarSenha.setText("Visualizar Senha");
        MostrarSenha.setBorder(null);
        MostrarSenha.setContentAreaFilled(false);
        MostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        LabelTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/Login.png"))); // NOI18N
        getContentPane().add(LabelTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JtextUsuario.getText().equals("Roger")&& JSenha.getText().equals("java")){
          JOptionPane.showMessageDialog(null, "Login Efetuado!");
           abrirTelaDeEscolha();
        }
        else{
            JOptionPane.showMessageDialog (null,"Nao foi possivel validar o seu login", "Erro no login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void abrirTelaDeEscolha(){
         this.dispose();
         TelaDeEscolha novaJanela = new TelaDeEscolha();
         novaJanela.setVisible(true);
    }
    
    private void JtextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextUsuarioActionPerformed
        
    }//GEN-LAST:event_JtextUsuarioActionPerformed

    private void JSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSenhaActionPerformed
 
    }//GEN-LAST:event_JSenhaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
  
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved
    
    private void MostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarSenhaActionPerformed

        if (MostrarSenha.isSelected()) {
             JSenha.setEchoChar((char) 0);
             } else {
              JSenha.setEchoChar('•'); 
                }
     
    }//GEN-LAST:event_MostrarSenhaActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JSenha;
    private javax.swing.JTextField JtextUsuario;
    private javax.swing.JLabel LabelTelaLogin;
    private javax.swing.JCheckBox MostrarSenha;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
