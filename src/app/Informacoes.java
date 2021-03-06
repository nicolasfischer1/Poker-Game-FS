/*
Arquivo com JFrame da tela de Jogar
Última modificação em: 27/jun/21
*/

package app;

import javax.swing.JOptionPane;

// Classe da tela Home
public class Informacoes extends javax.swing.JFrame {

    // Construtor
    public Informacoes() {
        super.setTitle("Informações");  // título janela
        initComponents();               // inicializa componentes da janela
        setLocationRelativeTo(null);    // centraliza janela no meio e centro da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInformacoes = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblEscopoSobre = new javax.swing.JLabel();
        btnSiteUnisc1 = new javax.swing.JButton();
        lblUrlUNISC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Poker Game - Informações");

        javax.swing.GroupLayout panelInformacoesLayout = new javax.swing.GroupLayout(panelInformacoes);
        panelInformacoes.setLayout(panelInformacoesLayout);
        panelInformacoesLayout.setHorizontalGroup(
            panelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInformacoesLayout.setVerticalGroup(
            panelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );

        lblEscopoSobre.setText("<html><blockquote> <p>&nbsp; &nbsp; &nbsp;Este jogo foi desenvolvido com objetivo de cumprir o crit&eacute;rio avaliativo da disciplina F&aacute;brica de Software, da Universidade de Santa Cruz do Sul.</p> <p>&nbsp; &nbsp; &nbsp;Os alunos respons&aacute;veis pelo software s&atilde;o Nicolas Fischer e Bruno Bolzan, orientados pelos professores Ivan S. e Gilson H. com compet&ecirc;ncia 1/2021.</p> </blockquote></html>"); // NOI18N
        lblEscopoSobre.setToolTipText("");

        btnSiteUnisc1.setText("Acessar site");
        btnSiteUnisc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiteUnisc1.setRolloverEnabled(true);
        btnSiteUnisc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiteUnisc1ActionPerformed(evt);
            }
        });

        lblUrlUNISC.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblUrlUNISC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUrlUNISC.setText("www.unisc.br");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblEscopoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(panelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSiteUnisc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUrlUNISC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEscopoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSiteUnisc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUrlUNISC)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Evento de click sobre botão para acessar site
    private void btnSiteUnisc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiteUnisc1ActionPerformed

        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.unisc.br"));
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o site. Houve algum problema!");
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiteUnisc1ActionPerformed

    // Evento de click sobre botão para ir a HOME
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home().setVisible(true);    // Abre a tela Game
        this.dispose(); // Fecha a tela Home

        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    //Método principal
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
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSiteUnisc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEscopoSobre;
    private javax.swing.JLabel lblUrlUNISC;
    private javax.swing.JPanel panelInformacoes;
    // End of variables declaration//GEN-END:variables
}
