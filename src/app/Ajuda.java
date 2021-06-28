/*
Arquivo com JFrame da tela de ajuda
Última modificação em: 27/jun/21
*/
package app;

import javax.swing.JOptionPane;


public class Ajuda extends javax.swing.JFrame {

    
    public Ajuda() {
        super.setTitle("Ajuda");    // título da janela
        initComponents();           // inicializa componentes
        setLocationRelativeTo(null);// exibe tela no centro e meio da tela
    }

    // Desenho gráfico, gerado pela IDE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAjuda = new javax.swing.JLabel();
        lblEscopoAjuda = new javax.swing.JLabel();
        btnSiteAjuda = new javax.swing.JButton();
        lblUrlAjuda = new javax.swing.JLabel();
        btnSiteAjuda1 = new javax.swing.JButton();
        lblUrlAjuda1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAjuda.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjuda.setText("Poker Game - Ajuda");

        lblEscopoAjuda.setText("<html>\n<div>\n<p>&nbsp; &nbsp; &nbsp;O jogo de Poker &eacute; considerado o jogo de cartas mais popular do mundo. Ele consiste em etapas, nas quais, ocorrem apostas entre jogadores, a partir da distribui&ccedil;&atilde;o de cartas. Veja cada passo a baixo para entender melhor o jogo.</p>\n</div>\n<div>\n<p>&nbsp; &nbsp; &nbsp;1) &Eacute; realizada uma aposta cega.</p>\n<p>&nbsp; &nbsp; &nbsp;2) Os jogadores recebem suas cartas, anteriormente embaralhadas.</p>\n<p>&nbsp; &nbsp; &nbsp;3) Todos apostam novamente, tendo em vista suas cartas.</p>\n<p>&nbsp; &nbsp; &nbsp;4) O respons&aacute;vel por embaralhar e distribuir as cartas, ir&aacute; p&ocirc;r &agrave;s tr&ecirc;s primeiras cartas da mesa.</p>\n<p>&nbsp; &nbsp; &nbsp;5) Todos apostam novamente, tendo as &uacute;ltimas cartas postas.</p>\n<p>&nbsp; &nbsp; &nbsp;6) &Eacute; posta a quarta carta na mesa.</p>\n<p>&nbsp; &nbsp; &nbsp;7) Todos apostam novamente, tendo vista a &uacute;ltima carta posta.</p>\n<p>&nbsp; &nbsp; &nbsp;8) P&otilde;e-se a quinta carta na mesa.</p>\n<p>&nbsp; &nbsp; &nbsp;9) Aposta-se novamente, tendo em vista todas as cartas.</p>\n<p>&nbsp; &nbsp; &nbsp;10) Todos os jogadores mostram suas cartas e &eacute; definido o vencedor.</p>\n<p>&nbsp; &nbsp; &nbsp;11) O vencedor leva todo valor apostado!</p>\n</div>\n</html>"); // NOI18N
        lblEscopoAjuda.setToolTipText("");

        btnSiteAjuda.setText("Saber mais");
        btnSiteAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiteAjudaActionPerformed(evt);
            }
        });

        lblUrlAjuda.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblUrlAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUrlAjuda.setText("www.pt.wikipedia.org/wiki/P%C3%B4quer");

        btnSiteAjuda1.setText("Combinações de cartas");
        btnSiteAjuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiteAjuda1ActionPerformed(evt);
            }
        });

        lblUrlAjuda1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblUrlAjuda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUrlAjuda1.setText("https://bit.ly/3gZ1gCa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblEscopoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnSiteAjuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnSiteAjuda)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUrlAjuda1)
                .addGap(118, 118, 118)
                .addComponent(lblUrlAjuda)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblAjuda)
                .addGap(17, 17, 17)
                .addComponent(lblEscopoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiteAjuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSiteAjuda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUrlAjuda)
                    .addComponent(lblUrlAjuda1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnSiteAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiteAjudaActionPerformed

        try{
            // Análisando ação
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://pt.wikipedia.org/wiki/P%C3%B4quer"));
        }catch (Exception erro){
            // Caso o site não possa ser aberto
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o site. Houve algum problema!");
        }

    }//GEN-LAST:event_btnSiteAjudaActionPerformed

    private void btnSiteAjuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiteAjuda1ActionPerformed
        
        try{
            // Análisando ação
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://bit.ly/3gZ1gCa"));
        }catch (Exception erro){
            // Caso o site não possa ser aberto
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o site. Houve algum problema!");
        }
    }//GEN-LAST:event_btnSiteAjuda1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajuda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiteAjuda;
    private javax.swing.JButton btnSiteAjuda1;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblEscopoAjuda;
    private javax.swing.JLabel lblUrlAjuda;
    private javax.swing.JLabel lblUrlAjuda1;
    // End of variables declaration//GEN-END:variables
}
