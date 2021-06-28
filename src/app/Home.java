/*
Arquivo com JFrame da tela home
Última modificação em: 27/jun/21
*/
package app;

import javax.swing.JOptionPane;

// Classe da tela Home
public class Home extends javax.swing.JFrame {

    // Construtor
    public Home() {
        super.setTitle("Poker");         // título da janela
        initComponents();               // inicializa componentes
        setLocationRelativeTo(null);    // exibe tela no centro e meio da tela
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        lblBemVindo = new javax.swing.JLabel();
        lblSaudacao1 = new javax.swing.JLabel();
        lblSaudacao2 = new javax.swing.JLabel();
        panelJogadores = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        txtNJogadores = new javax.swing.JLabel();
        txfNJogadores = new javax.swing.JTextField();
        lblSaudacao = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        btnInformacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBemVindo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem-vind@ ao Poker Game!");

        lblSaudacao1.setText("Que legal ter você aqui comigo.");
        lblSaudacao1.setAutoscrolls(true);

        lblSaudacao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaudacao2.setText("Selecione um botão abaixo:");

        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        txtNJogadores.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtNJogadores.setText("Quantos jogadores?");

        txfNJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNJogadoresActionPerformed(evt);
            }
        });

        lblSaudacao.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblSaudacao.setText("Você pode optar por 2 - 4 jogadores.");

        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnInformacoes.setText("Informações");
        btnInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJogadoresLayout = new javax.swing.GroupLayout(panelJogadores);
        panelJogadores.setLayout(panelJogadoresLayout);
        panelJogadoresLayout.setHorizontalGroup(
            panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJogadoresLayout.createSequentialGroup()
                .addComponent(btnAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInformacoes))
            .addGroup(panelJogadoresLayout.createSequentialGroup()
                .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJogadoresLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnJogar))
                    .addGroup(panelJogadoresLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaudacao)
                            .addGroup(panelJogadoresLayout.createSequentialGroup()
                                .addComponent(txtNJogadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfNJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelJogadoresLayout.setVerticalGroup(
            panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjuda)
                    .addComponent(btnInformacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNJogadores)
                    .addComponent(txfNJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJogar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBemVindo)
                            .addComponent(panelJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSaudacao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaudacao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblBemVindo)
                .addGap(18, 18, 18)
                .addComponent(lblSaudacao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaudacao2)
                .addGap(18, 18, 18)
                .addComponent(panelJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Evento de click sobre botão AJUDA
    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        new Ajuda().setVisible(true);    // Abre a tela Game
    }//GEN-LAST:event_btnAjudaActionPerformed

    // Evento de click sobre botão INFORMAÇÕES
    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        new Informacoes().setVisible(true);    // Abre a tela Game
        this.dispose(); // Fecha a tela Home

    }//GEN-LAST:event_btnInformacoesActionPerformed

    // Evento de click sobre botão JOGAR
    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        int jogadores = 0;  // inicializa variável de controle
        try{
            jogadores = Integer.parseInt(txfNJogadores.getText()); // Converte a entrada para inteiro
            if (jogadores < 5 && jogadores > 1){ // Compara se o valor está entre 0 e 4 (menor que 5 e maior que 0)
                JOptionPane.showMessageDialog(null, "Fico feliz que você digitou um número válido. Vamos lá!\nCada jogador iniciará com um saldo de R$ 100,00!");  // Exibe mensagem de sucesso
                new Jogar(jogadores).setVisible(true);    // Abre a tela Game
                this.dispose(); // Fecha a tela Home
            } else {
                JOptionPane.showMessageDialog(null, "Número incompatível!");  // Exibe mensagem de erro quando número for inválido
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Opa. Você não digitou um número!");  // Exibe mensagem erro na conversão
        }
    }//GEN-LAST:event_btnJogarActionPerformed

    private void txfNJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNJogadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNJogadoresActionPerformed

    // Método principal
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnJogar;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblSaudacao1;
    private javax.swing.JLabel lblSaudacao2;
    private javax.swing.JPanel panelJogadores;
    private javax.swing.JTextField txfNJogadores;
    private javax.swing.JLabel txtNJogadores;
    // End of variables declaration//GEN-END:variables
}
