/*
Arquivo com JFrame da tela de Jogar
Última modificação em: 27/jun/21
*/
package app;

// Importação de pacotes e classes usadas de apoio
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import poker.*;

/**
---------> Classe Jogar <---------
Acesso: public
Prioridade: alta
Pacote: poker
Atributos: nJogadores, mesa, imagensCartas, labels
*/
public class Jogar extends javax.swing.JFrame {
    // atributos
    private static int nJogadores;          // nro jogadores
    private Mesa mesa;                      // mesa (cartas e jogadores)
    private ImageIcon[][] imagensCartas;    // matriz nomes e imagens das cartas
    private JLabel[] labels;                // vetor com labels de apoio
    
    /**
    ---------> Construtor Jogar <---------
    Acesso: public
    Entrada: int nJogadores
    Objetivo: Construir o objeto
    Saída: Modificação direta do objeto
    */
    public Jogar(int nJogadores) {
        super.setTitle("Poker");    // título da janela
        this.nJogadores = nJogadores;   // atribuindo nro de jogadores ao atributo do objeto
        this.mesa = new Mesa(nJogadores);   // instanciando mesa
        this.imagensCartas = new ImageIcon[4][13];  // instanciando imagens das cartas (na matriz)
        
        // preenchendo a matriz com as cartas a partir do diretório do projeto que tem os oarquivos com imagens delas
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 13; j++)
                // concatenação de strings e preenchimento
                this.imagensCartas[i][j] = new ImageIcon("src/app/images/" + Baralho.NAIPES[i] + (j + 1) + ".png");
        
        Jogador[] jogadores = this.mesa.comecarJogo();  // vetor de jogadores
        
        initComponents(); // inicializando componentes
        setLocationRelativeTo(null); // exibe tela no centro e meio da tela
        // preenchendo labels auxiliares em vetor
        this.labels = new JLabel[]{lblSaldoValorJ1, lblSaldoValorJ2, lblSaldoValorJ3, lblSaldoValorJ4};
        // caso o nro de jogadores seja 3 ocorre a desativação (ocultação) das cartas do (s) próximo (s) jogadores
        if(this.nJogadores == 3){
            // cartas jogador 4 desativadas
            lblJogador4.setText("");
            lblJogador4Carta1.setIcon(null);
            lblJogador4Carta2.setIcon(null);
            lblSaldoJ4.setText("");
            lblSaldoValorJ4.setText("");
        } else if(this.nJogadores == 2){    // caso o nro de jogadores seja 3 ocorre a desativação (ocultação) das cartas do (s) próximo (s) jogadores
             // cartas jogador 3 desativadas
            lblJogador3.setText("");
            lblJogador3Carta1.setIcon(null);
            lblJogador3Carta2.setIcon(null);
            lblSaldoJ3.setText("");
            lblSaldoValorJ3.setText("");
             // cartas jogador 4 desativadas
            lblJogador4.setText("");
            lblJogador4Carta1.setIcon(null);
            lblJogador4Carta2.setIcon(null);
            lblSaldoJ4.setText("");
            lblSaldoValorJ4.setText("");
        }
            
        
    }
    
    /**
    ---------> Método modificarCartasJogador <---------
    Acesso: private
    Entrada: número do jogador e cartas
    Objetivo: modificar as imagens de cartas do jogador
    Saída: -
    */
    private void modificarCartasJogador(int numJogador, ImageIcon[] cartas){
        switch(numJogador){
            case 1: // rotina de mofificação das cartas do jogador 1
                lblJogador1Carta1.setIcon(cartas[0]);
                lblJogador1Carta2.setIcon(cartas[1]);
                break;
            case 2: // rotina de mofificação das cartas do jogador 2
                lblJogador2Carta1.setIcon(cartas[0]);
                lblJogador2Carta2.setIcon(cartas[1]);
                break;
            case 3: // rotina de mofificação das cartas do jogador 3
                if(this.nJogadores > 2){
                    lblJogador3Carta1.setIcon(cartas[0]);
                    lblJogador3Carta2.setIcon(cartas[1]);
                }
                break;
            case 4: // rotina de mofificação das cartas do jogador 4
                if(this.nJogadores > 3){
                    lblJogador4Carta1.setIcon(cartas[0]);
                    lblJogador4Carta2.setIcon(cartas[1]);
                }
                break;
            default:
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabecalho = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        lblTituloJogo = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JButton();
        panelBotoesAposta = new javax.swing.JPanel();
        btnCall = new javax.swing.JButton();
        btnRaise = new javax.swing.JButton();
        btnFold = new javax.swing.JButton();
        panelReceberAposta1 = new javax.swing.JPanel();
        lblEmJogo = new javax.swing.JLabel();
        lblJogadorAtual = new javax.swing.JLabel();
        txfEntradaAposta1 = new javax.swing.JTextField();
        lblValorApostar1 = new javax.swing.JLabel();
        lblJogador1Carta1 = new javax.swing.JLabel();
        lblJogador1Carta2 = new javax.swing.JLabel();
        lblJogador2Carta1 = new javax.swing.JLabel();
        lblJogador2Carta2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMesaCarta1 = new javax.swing.JLabel();
        lblMesaCarta2 = new javax.swing.JLabel();
        lblMesaCarta3 = new javax.swing.JLabel();
        lblMesaCarta4 = new javax.swing.JLabel();
        lblMesaCarta5 = new javax.swing.JLabel();
        lblJogador4Carta1 = new javax.swing.JLabel();
        lblJogador4Carta2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblJogador3Carta2 = new javax.swing.JLabel();
        lblJogador3Carta1 = new javax.swing.JLabel();
        lblJogador3 = new javax.swing.JLabel();
        lblJogador1 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        lblJogador4 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        panelStatusValores = new javax.swing.JPanel();
        lblValorEmMesa = new javax.swing.JLabel();
        lblStatusValorEmMesa = new javax.swing.JLabel();
        lblSaldoJ1 = new javax.swing.JLabel();
        lblSaldoJ2 = new javax.swing.JLabel();
        lblSaldoJ3 = new javax.swing.JLabel();
        lblSaldoJ4 = new javax.swing.JLabel();
        lblSaldoValorJ1 = new javax.swing.JLabel();
        lblSaldoValorJ2 = new javax.swing.JLabel();
        lblSaldoValorJ3 = new javax.swing.JLabel();
        lblSaldoValorJ4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblTituloJogo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTituloJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloJogo.setText("Poker Game");

        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabecalhoLayout = new javax.swing.GroupLayout(panelCabecalho);
        panelCabecalho.setLayout(panelCabecalhoLayout);
        panelCabecalhoLayout.setHorizontalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTituloJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabecalhoLayout.setVerticalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(lblTituloJogo)
                    .addComponent(btnAjuda))
                .addGap(34, 34, 34))
        );

        btnCall.setText("Pagar");
        btnCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallActionPerformed(evt);
            }
        });

        btnRaise.setText("Aumentar");
        btnRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseActionPerformed(evt);
            }
        });

        btnFold.setText("Desistir");
        btnFold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoldActionPerformed(evt);
            }
        });

        lblEmJogo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmJogo.setText("Em jogo:");

        lblJogadorAtual.setText("Jogador 1");
        lblJogadorAtual.setToolTipText("");

        javax.swing.GroupLayout panelReceberAposta1Layout = new javax.swing.GroupLayout(panelReceberAposta1);
        panelReceberAposta1.setLayout(panelReceberAposta1Layout);
        panelReceberAposta1Layout.setHorizontalGroup(
            panelReceberAposta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReceberAposta1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblEmJogo)
                .addGap(18, 18, 18)
                .addComponent(lblJogadorAtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReceberAposta1Layout.setVerticalGroup(
            panelReceberAposta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReceberAposta1Layout.createSequentialGroup()
                .addGroup(panelReceberAposta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmJogo)
                    .addComponent(lblJogadorAtual))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        lblValorApostar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValorApostar1.setText("Valor a apostar (R$):");

        javax.swing.GroupLayout panelBotoesApostaLayout = new javax.swing.GroupLayout(panelBotoesAposta);
        panelBotoesAposta.setLayout(panelBotoesApostaLayout);
        panelBotoesApostaLayout.setHorizontalGroup(
            panelBotoesApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesApostaLayout.createSequentialGroup()
                .addComponent(panelReceberAposta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesApostaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBotoesApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotoesApostaLayout.createSequentialGroup()
                        .addComponent(lblValorApostar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfEntradaAposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotoesApostaLayout.createSequentialGroup()
                        .addComponent(btnFold, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCall, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnRaise)))
                .addGap(3, 11, Short.MAX_VALUE))
        );
        panelBotoesApostaLayout.setVerticalGroup(
            panelBotoesApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesApostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelReceberAposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(panelBotoesApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorApostar1)
                    .addComponent(txfEntradaAposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBotoesApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFold)
                    .addComponent(btnCall)
                    .addComponent(btnRaise)))
        );

        lblJogador1Carta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador1Carta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador2Carta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador2Carta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblMesaCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblMesaCarta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblMesaCarta3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblMesaCarta4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblMesaCarta5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblMesaCarta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesaCarta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesaCarta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesaCarta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesaCarta5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMesaCarta1)
                    .addComponent(lblMesaCarta2)
                    .addComponent(lblMesaCarta3)
                    .addComponent(lblMesaCarta4)
                    .addComponent(lblMesaCarta5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblJogador4Carta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador4Carta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador3Carta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador3Carta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows\\Documents\\NetBeansProjects\\PokerGame-main\\src\\app\\images\\carta-virada.png")); // NOI18N

        lblJogador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador3.setText("Jogador 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblJogador3Carta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJogador3Carta2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblJogador3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJogador3Carta2)
                    .addComponent(lblJogador3Carta1))
                .addContainerGap())
        );

        lblJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador1.setText("Jogador 1");

        lblJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador2.setText("Jogador 2");

        lblJogador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador4.setText("Jogador 4");

        lblValorEmMesa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValorEmMesa.setText("Valor em mesa (R$):");

        lblStatusValorEmMesa.setText("0,00");

        lblSaldoJ1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaldoJ1.setText("Saldo Jogador 1 (R$):");

        lblSaldoJ2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaldoJ2.setText("Saldo Jogador 2 (R$):");

        lblSaldoJ3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaldoJ3.setText("Saldo Jogador 3 (R$):");

        lblSaldoJ4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSaldoJ4.setText("Saldo Jogador 4 (R$):");

        lblSaldoValorJ1.setText("100,00");

        lblSaldoValorJ2.setText("100,00");

        lblSaldoValorJ3.setText("100,00");

        lblSaldoValorJ4.setText("100,00");

        javax.swing.GroupLayout panelStatusValoresLayout = new javax.swing.GroupLayout(panelStatusValores);
        panelStatusValores.setLayout(panelStatusValoresLayout);
        panelStatusValoresLayout.setHorizontalGroup(
            panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatusValoresLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaldoJ4)
                    .addComponent(lblSaldoJ3)
                    .addComponent(lblSaldoJ2)
                    .addComponent(lblSaldoJ1)
                    .addComponent(lblValorEmMesa, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatusValorEmMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoValorJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoValorJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoValorJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoValorJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        panelStatusValoresLayout.setVerticalGroup(
            panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusValoresLayout.createSequentialGroup()
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatusValoresLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblStatusValorEmMesa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatusValoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValorEmMesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoJ1)
                    .addComponent(lblSaldoValorJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoJ2)
                    .addComponent(lblSaldoValorJ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoJ3)
                    .addComponent(lblSaldoValorJ3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStatusValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldoValorJ4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelStatusValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJogador1Carta1)
                        .addGap(4, 4, 4)
                        .addComponent(lblJogador1Carta2))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(657, 657, 657)
                .addComponent(lblJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblJogador2Carta1)
                .addGap(6, 6, 6)
                .addComponent(lblJogador2Carta2)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblJogador4Carta1)
                .addGap(6, 6, 6)
                .addComponent(lblJogador4Carta2)
                .addGap(4, 4, 4)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelBotoesAposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelStatusValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJogador1)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJogador1Carta1)
                            .addComponent(lblJogador1Carta2))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJogador2)
                    .addComponent(lblJogador4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJogador2Carta1)
                    .addComponent(lblJogador2Carta2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJogador4Carta1)
                    .addComponent(lblJogador4Carta2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelBotoesAposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        new Home().setVisible(true);    // Abre a tela Game
        this.dispose(); // Fecha a tela Home

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        new Ajuda().setVisible(true);    // Abre a tela Game

    }//GEN-LAST:event_btnAjudaActionPerformed
    
    /**
    ---------> Método btnCallActionPerformed <---------
    Acesso: private
    Entrada: evento
    Objetivo: tratar da opção call
    Saída: -
    */
    private void btnCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallActionPerformed
        // armazena retorno boleano sobre se é suficiente o dinheiro do jogador para fazer a aposta desejada
        boolean isSuficiente = this.mesa.getJogadores()[this.mesa.getEmJogo()].apostar(this.mesa.getMaiorAposta());
        // se for sufuciente
        if(isSuficiente){
            JOptionPane.showMessageDialog(null, String.format("Apostou R$ %.2f!", this.mesa.getMaiorAposta())); // mensagem de valor apostado
            this.mesa.setAposta(this.mesa.getAposta() + this.mesa.getMaiorAposta());    // modifica valor da aposta (em mesa) com soma do anterior (já existente) com o apostado
            this.mesa.proximoJogador(this.labels);
            lblStatusValorEmMesa.setText(String.format("%.2f", this.mesa.getAposta())); // modifica label com o valor em mesa, formatando as casas decimais
            // verificar o jogador que terá o valor em saldo alterado
            switch(this.mesa.getJogadores()[this.mesa.getEmJogo()].getNumJogador()){
                case 1: // se for o jogador 1
                    lblSaldoValorJ1.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 2: // se for o jogador 2
                    lblSaldoValorJ2.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 3: // se for o jogador 3
                    lblSaldoValorJ3.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 4: // se for o jogador 4
                    lblSaldoValorJ4.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                default:
                    break;
            }
            // se o jogador atual for o primeiro da lista e se a etapa estiver concluída (último da etapa - primeiro da próxima etapa)
            if(this.mesa.isPrimeiro() && this.mesa.isEtapaTerminada()){
                // verifica etapa
                switch(this.mesa.getEtapa()){
                    case 0: // etapa de dar as cartas
                        this.mesa.darCartas();  // chama método para distribuir cartas
                        Jogador[] jogadores = this.mesa.getJogadores(); // atribuiu vetor ao "jogadores"
                        // percorre naipe, pegando imagens
                        for(int i = 0; i < jogadores.length; i++){
                            int naipe1 = 0, naipe2 = 0;
                            // percorre naipes 1 comparando o naipe do jogador ao vetor da classe Baralho para obter o inteiro do naipe
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[0].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe1 = j;
                            // percorre naipes 2 comparando o naipe do jogador ao vetor da classe Baralho para obter o inteiro do naipe
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[1].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe2 = j;
                            // Preenche imagem (diretório)
                            ImageIcon[] imagensCartasJogador = new ImageIcon[2];
                            imagensCartasJogador[0] = this.imagensCartas[naipe1][jogadores[i].getCartas()[0].getValor() - 1];
                            imagensCartasJogador[1] = this.imagensCartas[naipe2][jogadores[i].getCartas()[1].getValor() - 1];
                            // chama método de modificação das cartas
                            this.modificarCartasJogador(i + 1, imagensCartasJogador);
                         }
                        break;
                    case 1: // etapa de flop
                        {
                            this.mesa.flop();   // chama flop
                            int[] naipesCartas = new int[3];    // vetor com nro de naipes das cartas
                            // percore a qtd de naipes (3)
                            for(int i = 0; i < 3; i++){
                            // percorre naipes comparando o naipe do jogador ao vetor da classe Baralho para obter o inteiro do naipe
                                for(int j = 0; j < Baralho.NAIPES.length; j++)
                                    if(this.mesa.getCartasAtuais()[i].getNaipe().equals(Baralho.NAIPES[j]))
                                        naipesCartas[i] = j;
                            }
                            // modifica labels com imagens das cartas
                            lblMesaCarta1.setIcon(this.imagensCartas[naipesCartas[0]][this.mesa.getCartasAtuais()[0].getValor() - 1]);
                            lblMesaCarta2.setIcon(this.imagensCartas[naipesCartas[1]][this.mesa.getCartasAtuais()[1].getValor() - 1]);
                            lblMesaCarta3.setIcon(this.imagensCartas[naipesCartas[2]][this.mesa.getCartasAtuais()[2].getValor() - 1]);
                        }
                        break;
                    case 2: // etapa turn
                        {
                            this.mesa.turn(); // chama turn
                            int naipe = 0;
                            // percorre naipes  comparando o naipe do jogador ao vetor da classe Baralho para obter o inteiro do naipe
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                if(this.mesa.getCartasAtuais()[3].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // modifica label com imagem das carta
                            lblMesaCarta4.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[3].getValor() - 1]);
                        }
                        break;
                    case 3: // etapa river
                        {
                            this.mesa.river(); // chama river
                            int naipe = 0;
                            // modifica labels com imagens das cartas
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                if(this.mesa.getCartasAtuais()[4].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // modificando label com img
                            lblMesaCarta5.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[4].getValor() - 1]);
                        }
                        break;
                    case 4: // etapa de terminar jogo
                        if(this.mesa.terminarJogo()){   // validacao se jogo chegou ao final
                            Jogador jogadorGanhador = this.mesa.getJogadores()[0];  // armazena vencedor
                            for(Jogador jogador : this.mesa.getJogadores()) // percorre jogadores
                                if(jogador.getDinheiro() > 0.0f) // se achar alguém que ficou com dinheiro (ganhou)
                                    jogadorGanhador = jogador;
                            // informa vencedor
                            JOptionPane.showMessageDialog(null, "O ganhador final foi o jogador número " + jogadorGanhador.getNumJogador() + "!");
                            // inicializa tela home
                            new Home().setVisible(true);
                            // fecha tela atual
                            this.dispose();
                        }
                        this.reiniciarRodada(); // reiniciar rodada
                        this.mesa.setEtapa(this.mesa.getEtapa() - 1);   // volta etapa (para inicio)
                        break;
                    default:
                        break;
                }
                this.mesa.setEtapa(this.mesa.getEtapa() + 1);   // inicializa etapas
                this.mesa.setMaiorAposta(0.0f); // inicializa aposta
            }
            // modifica jogador em jogo (label de texto)
            lblJogadorAtual.setText("Jogador " + (this.mesa.getEmJogo() + 1));
        }else{  // caso dinheiro for insuficiente
            JOptionPane.showMessageDialog(null, "Dinheiro insuficiente!");
        }
    }//GEN-LAST:event_btnCallActionPerformed
    
    /**
    ---------> Método reiniciarRodada <---------
    Acesso: private
    Entrada: -
    Objetivo: reiniciar as cartas da rodada
    Saída: -
    */
    private void reiniciarRodada(){
        //recebe certa virada
        ImageIcon cartaVirada = new ImageIcon("src/app/images/carta-virada.png");
        // muda cartas (vira novamente)
        lblMesaCarta1.setIcon(cartaVirada);
        lblMesaCarta2.setIcon(cartaVirada);
        lblMesaCarta3.setIcon(cartaVirada);
        lblMesaCarta4.setIcon(cartaVirada);
        lblMesaCarta5.setIcon(cartaVirada);
        
        // organiza jogadores
        for(int i = 1; i <= this.nJogadores; i++)
            this.modificarCartasJogador(i, new ImageIcon[]{cartaVirada, cartaVirada});
        
        lblJogadorAtual.setText("Jogador 1");   // atualiza jogador em jogo
    }
    
    /**
    ---------> Método btnFoldActionPerformed <---------
    Acesso: private
    Entrada: evento
    Objetivo: tratar da opção fold
    Saída: -
    */
    private void btnFoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoldActionPerformed

        // se sobrar mais de 2 jogadores
        if(this.mesa.getJogadoresRestantes() > 2){
            ImageIcon cartaVirada = new ImageIcon("src/app/images/carta-virada.png");   // carta virada
            switch(this.mesa.getEmJogo()){  // jogadores em logo
            // reseta cartas
                case 0:
                    lblJogador1Carta1.setIcon(cartaVirada);
                    lblJogador1Carta2.setIcon(cartaVirada);
                    break;
                case 1:
                    lblJogador2Carta1.setIcon(cartaVirada);
                    lblJogador2Carta2.setIcon(cartaVirada);
                    break;
                case 2:
                    lblJogador3Carta1.setIcon(cartaVirada);
                    lblJogador3Carta2.setIcon(cartaVirada);
                    break;
                case 3:
                    lblJogador4Carta1.setIcon(cartaVirada);
                    lblJogador4Carta2.setIcon(cartaVirada);
                    break;
                default:
                    break;
            }
            
            this.mesa.removerJogadorEmJogo(this.labels); // remove jogador
            JOptionPane.showMessageDialog(null, "Jogador desistiu!");   // jogador desistiu 
            lblStatusValorEmMesa.setText(String.format("%.2f", this.mesa.getAposta())); // atualiza valor em mesa
            // atualiza saldo em relação ao nro do jogador
            switch(this.mesa.getJogadores()[this.mesa.getEmJogo()].getNumJogador()){
                case 1:
                    lblSaldoValorJ1.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 2:
                    lblSaldoValorJ2.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 3:
                    lblSaldoValorJ3.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 4:
                    lblSaldoValorJ4.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                default:
                    break;
            }
            // se tiver no começo de uma etapa
            if(this.mesa.isPrimeiro() && this.mesa.isEtapaTerminada()){
                switch(this.mesa.getEtapa()){
                    case 0: // dar as cartas
                        this.mesa.darCartas();
                        Jogador[] jogadores = this.mesa.getJogadores(); // referência aos jogadores da mesa
                        for(int i = 0; i < jogadores.length; i++){ // percorre os jogadores
                            int naipe1 = 0, naipe2 = 0;
                            // definir o naipe1
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[0].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe1 = j;
                            // definir o naipe2
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[1].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe2 = j;
                            // configura as imagens das cartas
                            ImageIcon[] imagensCartasJogador = new ImageIcon[2];
                            imagensCartasJogador[0] = this.imagensCartas[naipe1][jogadores[i].getCartas()[0].getValor() - 1];
                            imagensCartasJogador[1] = this.imagensCartas[naipe2][jogadores[i].getCartas()[1].getValor() - 1];
                            if(!jogadores[i].isDesistiu())
                                modificarCartasJogador(i + 1, imagensCartasJogador);
                        }
                        
                        break;
                    case 1: // caso de flop
                        {
                            this.mesa.flop();
                            int[] naipesCartas = new int[3];
                            for(int i = 0; i < 3; i++){
                                //definir o naipe
                                for(int j = 0; j < Baralho.NAIPES.length; j++)
                                    if(this.mesa.getCartasAtuais()[i].getNaipe().equals(Baralho.NAIPES[j]))
                                        naipesCartas[i] = j;
                            }
                            // configura as imagens das cartas
                            lblMesaCarta1.setIcon(this.imagensCartas[naipesCartas[0]][this.mesa.getCartasAtuais()[0].getValor() - 1]);
                            lblMesaCarta2.setIcon(this.imagensCartas[naipesCartas[1]][this.mesa.getCartasAtuais()[1].getValor() - 1]);
                            lblMesaCarta3.setIcon(this.imagensCartas[naipesCartas[2]][this.mesa.getCartasAtuais()[2].getValor() - 1]);
                        }
                        break;
                    case 2: // caso de turn
                        {
                            this.mesa.turn();
                            int naipe = 0;
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                //definir o naipe
                                if(this.mesa.getCartasAtuais()[3].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // configura a imagem da carta
                            lblMesaCarta4.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[3].getValor() - 1]);
                        }
                        break;
                    case 3: // caso de river
                        {
                            this.mesa.river();
                            int naipe = 0;
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                //definir o naipe
                                if(this.mesa.getCartasAtuais()[4].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // configura a imagem da carta
                            lblMesaCarta5.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[4].getValor() - 1]);
                        }
                        break;
                    case 4: // caso de showdown
                        // termina o jogo
                        if(this.mesa.terminarJogo()){
                            Jogador jogadorGanhador = this.mesa.getJogadores()[0];
                            // determina o jogador que não perdeu tudo
                            for(Jogador jogador : this.mesa.getJogadores())
                                if(jogador.getDinheiro() > 0.0f)
                                    jogadorGanhador = jogador;
                            JOptionPane.showMessageDialog(null, "O ganhador final foi o jogador número " + jogadorGanhador.getNumJogador() + "!" +
                                                                "\nVocê voltará à tela inicial!");
                            new Home().setVisible(true); // cria a janela da tela inicial
                            this.dispose(); // destrói a janela de jogo
                        }
                        this.reiniciarRodada(); // reinicia rodada
                        break;
                    default:
                        break;
                }
                this.mesa.setEtapa(this.mesa.getEtapa() + 1); // avança uma etapa
                this.mesa.setMaiorAposta(0.0f); // zera o valor mínimo para aposta
            }
        }else{
            this.mesa.removerJogadorEmJogo(this.labels); // remove o jogador atual
            // termina o jogo
            if(this.mesa.terminarJogo()){
                Jogador jogadorGanhador = this.mesa.getJogadores()[0];
                // determina o jogador que não perdeu tudo
                for(Jogador jogador : this.mesa.getJogadores())
                    if(jogador.getDinheiro() > 0.0f)
                        jogadorGanhador = jogador;
                    JOptionPane.showMessageDialog(null, "O ganhador final foi o jogador número " + jogadorGanhador.getNumJogador() + "!" +
                                                        "\nVocê voltará à tela inicial!");
                    new Home().setVisible(true); // cria a janela da tela inicial
                    this.dispose(); // destrói a janela de jogo
                }
            this.reiniciarRodada(); // reinicia rodada
            return;
        }
        
        lblJogadorAtual.setText("Jogador " + (this.mesa.getEmJogo() + 1)); // atualiza o jogador em jogo na tela
    }//GEN-LAST:event_btnFoldActionPerformed
    
    /**
    ---------> Método btnRaiseActionPerformed <---------
    Acesso: private
    Entrada: evento
    Objetivo: tratar da opção raise
    Saída: -
    */
    private void btnRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseActionPerformed
        String valorEmString = txfEntradaAposta1.getText(); // lê o texto da caixa de entrada
        float valorAposta = 0.0f;
        try{
            valorAposta = Float.parseFloat(valorEmString); // tenta ler um valor do tipo float
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Digite um valor numérico!"); // caso a entrada do usuário seja inadequada
            return;
        }
        boolean isSuficiente = this.mesa.getJogadores()[this.mesa.getEmJogo()].apostar(valorAposta); // tenta realizar aposta
        // se o jogador pagou o valor, mas ele não era maior que a aposta mínima
        if(isSuficiente && valorAposta <= this.mesa.getMaiorAposta()){
            // devolve o valor ao jogador
            this.mesa.getJogadores()[this.mesa.getEmJogo()].receberGanhos(valorAposta);
        }
        // se o jogador possui dinheiro suficiente para a aposta e se ela representa um aumento
        if(isSuficiente && valorAposta > this.mesa.getMaiorAposta()){
            JOptionPane.showMessageDialog(null, String.format("Apostou R$ %.2f!", valorAposta)); // informa que a aposta ocorreu
            // ajusta a aposta mínima
            if(valorAposta > this.mesa.getMaiorAposta())
                this.mesa.setMaiorAposta(valorAposta);
            // ajusta o valor em mesa
            this.mesa.setAposta(this.mesa.getAposta() + valorAposta);
            // avança para o próximo jogador
            this.mesa.proximoJogador(this.labels);
            lblStatusValorEmMesa.setText(String.format("%.2f", this.mesa.getAposta())); // ajusta o valor em mesa na tela
            // ajusta o saldo de cada jogador na tela
            switch(this.mesa.getJogadores()[this.mesa.getEmJogo()].getNumJogador()){
                case 1:
                    lblSaldoValorJ1.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 2:
                    lblSaldoValorJ2.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 3:
                    lblSaldoValorJ3.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                case 4:
                    lblSaldoValorJ4.setText(String.format("%.2f", this.mesa.getJogadores()[this.mesa.getEmJogo()].getDinheiro()));
                    break;
                default:
                    break;
            }
            // se passar para outra etapa
            if(this.mesa.isPrimeiro() && this.mesa.isEtapaTerminada()){
                // trata as etapas
                switch(this.mesa.getEtapa()){
                    case 0: // dar as cartas
                        this.mesa.darCartas();
                        Jogador[] jogadores = this.mesa.getJogadores(); // referência aos jogadores da mesa
                        for(int i = 0; i < jogadores.length; i++){ // percorre os jogadores
                            int naipe1 = 0, naipe2 = 0;
                            // definir o naipe1
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[0].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe1 = j;
                            // definir o naipe2
                            for(int j = 0; j < Baralho.NAIPES.length; j++)
                                if(!jogadores[i].isDesistiu() && jogadores[i].getCartas()[1].getNaipe().equals(Baralho.NAIPES[j]))
                                    naipe2 = j;
                            // configura as imagens das cartas
                            ImageIcon[] imagensCartasJogador = new ImageIcon[2];
                            imagensCartasJogador[0] = this.imagensCartas[naipe1][jogadores[i].getCartas()[0].getValor() - 1];
                            imagensCartasJogador[1] = this.imagensCartas[naipe2][jogadores[i].getCartas()[1].getValor() - 1];
                            if(!jogadores[i].isDesistiu())
                                modificarCartasJogador(i + 1, imagensCartasJogador);
                        }
                        
                        break;
                    case 1: // caso de flop
                        {
                            this.mesa.flop();
                            int[] naipesCartas = new int[3];
                            for(int i = 0; i < 3; i++){
                                //definir o naipe
                                for(int j = 0; j < Baralho.NAIPES.length; j++)
                                    if(this.mesa.getCartasAtuais()[i].getNaipe().equals(Baralho.NAIPES[j]))
                                        naipesCartas[i] = j;
                            }
                            // configura as imagens das cartas
                            lblMesaCarta1.setIcon(this.imagensCartas[naipesCartas[0]][this.mesa.getCartasAtuais()[0].getValor() - 1]);
                            lblMesaCarta2.setIcon(this.imagensCartas[naipesCartas[1]][this.mesa.getCartasAtuais()[1].getValor() - 1]);
                            lblMesaCarta3.setIcon(this.imagensCartas[naipesCartas[2]][this.mesa.getCartasAtuais()[2].getValor() - 1]);
                        }
                        break;
                    case 2: // caso de turn
                        {
                            this.mesa.turn();
                            int naipe = 0;
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                //definir o naipe
                                if(this.mesa.getCartasAtuais()[3].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // configura a imagem da carta
                            lblMesaCarta4.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[3].getValor() - 1]);
                        }
                        break;
                    case 3: // caso de river
                        {
                            this.mesa.river();
                            int naipe = 0;
                            for(int i = 0; i < Baralho.NAIPES.length; i++)
                                //definir o naipe
                                if(this.mesa.getCartasAtuais()[4].getNaipe().equals(Baralho.NAIPES[i]))
                                    naipe = i;
                            // configura a imagem da carta
                            lblMesaCarta5.setIcon(this.imagensCartas[naipe][this.mesa.getCartasAtuais()[4].getValor() - 1]);
                        }
                        break;
                    case 4: // caso de showdown
                        // termina o jogo
                        if(this.mesa.terminarJogo()){
                            Jogador jogadorGanhador = this.mesa.getJogadores()[0];
                            // determina o jogador que não perdeu tudo
                            for(Jogador jogador : this.mesa.getJogadores())
                                if(jogador.getDinheiro() > 0.0f)
                                    jogadorGanhador = jogador;
                            JOptionPane.showMessageDialog(null, "O ganhador final foi o jogador número " + jogadorGanhador.getNumJogador() + "!" +
                                                                "\nVocê voltará à tela inicial!");
                            new Home().setVisible(true); // cria a janela da tela inicial
                            this.dispose(); // destrói a janela de jogo
                        }
                        this.reiniciarRodada(); // reinicia rodada
                        this.mesa.setEtapa(this.mesa.getEtapa() - 1); // muda a etapa
                        break;
                    default:
                        break;
                }
                this.mesa.setEtapa(this.mesa.getEtapa() + 1); // ajusta a etapa
            }

            lblJogadorAtual.setText("Jogador " + (this.mesa.getEmJogo() + 1)); // ajusta o jogador atual
        }else{
            JOptionPane.showMessageDialog(null, "Dinheiro insuficiente!"); // informa que o dinheiro é insuficiente
        }
    }//GEN-LAST:event_btnRaiseActionPerformed

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
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogar(nJogadores).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCall;
    private javax.swing.JButton btnFold;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRaise;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmJogo;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador1Carta1;
    private javax.swing.JLabel lblJogador1Carta2;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblJogador2Carta1;
    private javax.swing.JLabel lblJogador2Carta2;
    private javax.swing.JLabel lblJogador3;
    private javax.swing.JLabel lblJogador3Carta1;
    private javax.swing.JLabel lblJogador3Carta2;
    private javax.swing.JLabel lblJogador4;
    private javax.swing.JLabel lblJogador4Carta1;
    private javax.swing.JLabel lblJogador4Carta2;
    private javax.swing.JLabel lblJogadorAtual;
    private javax.swing.JLabel lblMesaCarta1;
    private javax.swing.JLabel lblMesaCarta2;
    private javax.swing.JLabel lblMesaCarta3;
    private javax.swing.JLabel lblMesaCarta4;
    private javax.swing.JLabel lblMesaCarta5;
    private javax.swing.JLabel lblSaldoJ1;
    private javax.swing.JLabel lblSaldoJ2;
    private javax.swing.JLabel lblSaldoJ3;
    private javax.swing.JLabel lblSaldoJ4;
    private javax.swing.JLabel lblSaldoValorJ1;
    private javax.swing.JLabel lblSaldoValorJ2;
    private javax.swing.JLabel lblSaldoValorJ3;
    private javax.swing.JLabel lblSaldoValorJ4;
    private javax.swing.JLabel lblStatusValorEmMesa;
    private javax.swing.JLabel lblTituloJogo;
    private javax.swing.JLabel lblValorApostar1;
    private javax.swing.JLabel lblValorEmMesa;
    private javax.swing.JPanel panelBotoesAposta;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelReceberAposta1;
    private javax.swing.JPanel panelStatusValores;
    private javax.swing.JTextField txfEntradaAposta1;
    // End of variables declaration//GEN-END:variables

}