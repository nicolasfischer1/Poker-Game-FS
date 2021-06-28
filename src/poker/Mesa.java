package poker;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
---------> Classe Mesa <---------
Acesso: public
Prioridade: alta
Pacote: poker
Atributos: baralho, jogadores, cartasAtuais, emJogo, aposta, maiorAposta,
*          numJogadores, jogadoresRestantes, etapa e jogadasNaEtapa
*/
public class Mesa extends MesaDeJogo{
    // atributos


    private float aposta;
    private float maiorAposta;
    private int numJogadores;
    private int jogadoresRestantes;
    private int etapa;
    private int jogadasNaEtapa;
    
    /**
    ---------> Construtor Mesa <---------
    Acesso: public
    Entrada: int numJogadores
    Objetivo: Construir o objeto
    Saída: Modificação direta do objeto
    */
    public Mesa(int numJogadores){
        this.baralho = new Baralho();
        this.jogadores = new Jogador[numJogadores];
        this.cartasAtuais = new Carta[5];
        this.emJogo = 0;
        this.numJogadores = numJogadores;
        this.jogadoresRestantes = numJogadores;
        this.aposta = 0.0f;
        this.maiorAposta = 0.0f;
        this.etapa = 0;
        this.jogadasNaEtapa = 0;
    }
    
    /**
    ---------> Método comecarJogo <---------
    * Obs: Reescrita do método comecarJogo()
    Acesso: public
    Entrada: -
    Objetivo: começar a rodada do jogo
    Saída: lista dos jogadores participantes
    */
    @Override
    public Jogador[] comecarJogo(){
        this.aposta = 0.0f;
        this.maiorAposta = 0.0f;
        this.baralho.embaralhar(); // embaralha cartas
        // dá as cartas aos jogadores
        for(int i = 0; i < numJogadores; i++){
            this.jogadores[i] = new Jogador(i + 1);
            this.jogadores[i].receberCartas(this.baralho.darCarta(), this.baralho.darCarta());
        }
        return this.jogadores; // retorna os jogadores
    }
    
    /**
    ---------> Método flop <---------
    Acesso: public
    Entrada: -
    Objetivo: definir as cartas do flop
    Saída: -
    */
    public void flop(){
        // define as cartas do flop
        for(int i = 0; i < 3; i++)
            this.cartasAtuais[i] = this.baralho.darCarta();
    }
    
    /**
    ---------> Método turn <---------
    Acesso: public
    Entrada: -
    Objetivo: definir a carta do turn
    Saída: -
    */
    public void turn(){
        // define as cartas do turn
        this.cartasAtuais[3] = this.baralho.darCarta();
    }
    
    /**
    ---------> Método river <---------
    Acesso: public
    Entrada: -
    Objetivo: definir a carta do river
    Saída: -
    */
    public void river(){
        // define as cartas do river
        this.cartasAtuais[4] = this.baralho.darCarta();
    }
    
    /**
    ---------> Método verificarVencedor <---------
    * Resscrita do método verificarVencedor()
    Acesso: public
    Entrada: -
    Objetivo: verificar qual jogador foi o vencedor da rodada
    Saída: -
    */
    @Override
    public void verificarVencedor(){
        // se está em showdown
        if(etapa >= 4 && this.jogadoresRestantes > 1){
            // vetor de resultados
            Jogador.Resultado[] resultados = new Jogador.Resultado[this.jogadoresRestantes];
            int pos = 0;
            // calcula o valor da mão de cada jogador
            for(int i = 0; i < this.numJogadores; i++)
                if(!this.jogadores[i].isDesistiu()){
                    resultados[pos] = this.jogadores[i].calcularMao(this.cartasAtuais);
                    pos++;
                }
            Jogador.Resultado maiorResultado = resultados[0];
            // define a maior mão existente entre os jogadores
            for(int j = 0; j < resultados.length; j++)
                if(maiorResultado.getMao().ordinal() < resultados[j].getMao().ordinal()
                    || (maiorResultado.getMao().ordinal() == resultados[j].getMao().ordinal()
                        && (maiorResultado.getMaiorCarta() < resultados[j].getMaiorCarta()
                            || maiorResultado.getMaiorCarta() > 1 && resultados[j].getMaiorCarta() == 1
                           )
                       )
                  ){
                    maiorResultado = resultados[j];
                }

            int qtdVencedores = 0;
            
            // calcula a quantidade de vencedores
            for(int i = 0; i < this.numJogadores; i++)
                if(!this.jogadores[i].isDesistiu() && this.jogadores[i].getResultado().getMao().ordinal() == maiorResultado.getMao().ordinal() && this.jogadores[i].getResultado().getMaiorCarta() == maiorResultado.getMaiorCarta()){
                    qtdVencedores++;
                }
            // dá o valor ganho ao(s) vencedor(es)
            for(int i = 0; i < this.numJogadores; i++){
                if(!this.jogadores[i].isDesistiu() && this.jogadores[i].getResultado().getMao().ordinal() == maiorResultado.getMao().ordinal() && this.jogadores[i].getResultado().getMaiorCarta() == maiorResultado.getMaiorCarta()){
                    this.jogadores[i].receberGanhos(this.aposta / qtdVencedores);
                    if(qtdVencedores > 1)
                        JOptionPane.showMessageDialog(  null,
                                                        "Um dos vencedores foi o jogador " +
                                                        this.jogadores[i].getNumJogador() +
                                                        ", ganhando R$ " + String.format("%.2f", this.aposta / qtdVencedores) +
                                                        "\nA partida será reiniciada!");
                    else
                        JOptionPane.showMessageDialog(  null,
                                                        "O vencedor foi o jogador " +
                                                        this.jogadores[i].getNumJogador() +
                                                        ", ganhando R$ " + String.format("%.2f", this.aposta / qtdVencedores) +
                                                        "\nA partida será reiniciada!");

                        
                }
            }
        }else{ // se não estiver em showdown
            if(this.jogadoresRestantes == 1){
                // dá o valor ganho ao vencedor
                this.jogadores[this.emJogo].receberGanhos(aposta);
                JOptionPane.showMessageDialog(null,
                                              "O vencedor foi o jogador " +
                                              this.jogadores[this.emJogo].getNumJogador() +
                                              ", ganhando R$ " + String.format("%.2f", this.aposta) +
                                              "\nA partida será reiniciada!");
            }
        }

    }
    
    /**
    ---------> Método isEtapaTerminada <---------
    Acesso: public
    Entrada: -
    Objetivo: verificar se a etapa terminou
    Saída: valor lógico indicando se a etapa terminou
    */
    public boolean isEtapaTerminada(){
        // se todos os jogadores restantes já jogaram
        if(this.jogadasNaEtapa == this.jogadoresRestantes){
            this.jogadasNaEtapa = 0;
            return true;
        }
        return false;
    }
    
    /**
    ---------> Método removerJogadorEmJogo <---------
    Acesso: public
    Entrada: lista com os labels a serem alterados
    Objetivo: remover o jogador atual da rodada
    Saída: -
    */
    public void removerJogadorEmJogo(JLabel[] labels){
        // ajusta saldo do jogador
        labels[this.emJogo].setText(this.jogadores[this.emJogo].getDinheiro(2));
        this.jogadoresRestantes--;
        this.jogadores[this.emJogo].setDesistiu(true); // marca que o jogador desistiu
        // procura por o próximo jogador válido
        for(int i = this.emJogo; i < this.numJogadores; i++)
            if(!this.jogadores[i].isDesistiu()){
                this.emJogo = i;
                return;
            }
        
        int posicao = 0;
        // caso não encontre acima, continua procurando a partir do começo
        while(posicao < this.numJogadores){
            if(!this.jogadores[posicao].isDesistiu()){
                this.emJogo = posicao;
                break;
            }
            posicao++;
        }
    }
    
    /**
    ---------> Método proximoJogador <---------
    Acesso: public
    Entrada: lista com os labels a serem alterados
    Objetivo: passar para o próximo jogador da rodada
    Saída: -
    */
    public void proximoJogador(JLabel[] labels){
        // ajusta o saldo do jogador na tela
        labels[this.emJogo].setText(this.jogadores[this.emJogo].getDinheiro(2));
        this.jogadasNaEtapa++; // contabiliza a jogada na contagem
        // procura o próximo jogador válido
        for(int i = this.emJogo + 1 % this.numJogadores; i < this.numJogadores; i++)
            if(!this.jogadores[i].isDesistiu()){
                this.emJogo = i;
                return;
            }
        
        int posicao = 0;
        // caso não encontre acima, continua procurando a partir do começo
        while(posicao < this.numJogadores){
            if(!this.jogadores[posicao].isDesistiu()){
                this.emJogo = posicao;
                break;
            }
            posicao++;
        }
    }
    
    /**
    ---------> Método isPrimeiro <---------
    Acesso: public
    Entrada: -
    Objetivo: determinar se o jogador atual é o primeiro da rodada
    Saída: valor lógico indicando se o jogador atual é o primeiro da rodada
    */
    public boolean isPrimeiro(){
        // percorre os jogadores e retorna verdadeiro se o primeiro válido for o atual
        for(int i = 0; i < this.numJogadores; i++){
            if(!this.jogadores[i].isDesistiu()){
                if(this.jogadores[i] == this.jogadores[this.emJogo])
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
    
    /**
    ---------> Método terminarJogo <---------
    * Obs: Reescrita do método terminarJogo()
    Acesso: public
    Entrada: -
    Objetivo: determinar se só restou um jogador com dinheiro
    Saída: valor lógico indicando se só restou um jogador com dinheiro
    */
    @Override
    public boolean terminarJogo(){
        this.verificarVencedor(); // verifica o vencedor
        this.etapa = 0;
        this.aposta = 0.0f;
        this.baralho.embaralhar();
        for(Carta carta : this.cartasAtuais)
            carta = null;
        this.emJogo = 0;
        this.maiorAposta = 0.0f;
        this.jogadoresRestantes = this.numJogadores;
        this.jogadasNaEtapa = 0;
        // percorre os jogadores e os reinicia
        for(Jogador jogador : this.jogadores){
            if(jogador.getDinheiro() > 0.0f) // se o jogador tem dinheiro
                jogador.setDesistiu(false); // configura como não desistido
            else // se o jogador perdeu tudo
                jogador.setDesistiu(true); // configura como já desistido
            jogador.getResultado().setMaiorCarta(0);
            jogador.getResultado().setMao(Maos.HIGH_CARD);
            jogador.setMao(Maos.HIGH_CARD);
        }
        int qtdComDinheiro = 0;
        // calcula quantos têm dinheiro
        for(int i = 0; i < this.numJogadores; i++){
            if(this.jogadores[i].getDinheiro() > 0.0f)
                qtdComDinheiro++;
        }
        // se só sobrou um jogador com dinheiro, retorna verdadeiro
        if(qtdComDinheiro == 1)
            return true;
        return false;
    }
    
    /**
    ---------> Método darCartas <---------
    Acesso: public
    Entrada: -
    Objetivo: dar duas cartas a cada jogador
    Saída: -
    */
    public void darCartas(){
        // percorre os jogadores, dando as cartas
        for(int i = 0; i < this.numJogadores; i++)
            if(!this.jogadores[i].isDesistiu())
                this.jogadores[i].receberCartas(this.baralho.darCarta(), this.baralho.darCarta());
    }
    
    /**
    ---------> Getter getJogadores <---------
    Acesso: public
    Entrada: -
    Objetivo: Obter jogadores
    Saída: lista de jogadores
    */
    public Jogador[] getJogadores() {
        return jogadores;
    }
    
    /**
    ---------> Getter getCartasAtuais <---------
    Acesso: public
    Entrada: -
    Objetivo: Obter cartas
    Saída: lista de cartas
    */
    public Carta[] getCartasAtuais() {
        return cartasAtuais;
    }
    
    /**
    ---------> Getter getEmJogo <---------
    Acesso: public
    Entrada: -
    Objetivo: Obter o jogador em jogo
    Saída: número do jogador em jogo
    */
    public int getEmJogo() {
        return emJogo;
    }
    
    /**
    ---------> Getter getAposta <---------
    Acesso: public
    Entrada: -
    Objetivo: obter valor da aposta
    Saída: valor da aposta em mesa
    */
    public float getAposta() {
        return aposta;
    }
    
    /**
    ---------> Setter setAposta <---------
    Acesso: public
    Entrada: novo valor da aposta
    Objetivo: Definir aposta em mesa
    Saída: -
    */
    public void setAposta(float aposta) {
        this.aposta = aposta;
    }
    
    /**
    ---------> Getter getMaiorAposta <---------
    Acesso: public
    Entrada: -
    Objetivo: obter valor da maior aposta
    Saída: valor da maior aposta
    */
    public float getMaiorAposta() {
        return maiorAposta;
    }
    
    /**
    ---------> Setter setMaiorAposta <---------
    Acesso: public
    Entrada: novo valor da maior aposta
    Objetivo: Definir valor da maior aposta
    Saída: -
    */
    public void setMaiorAposta(float maiorAposta) {
        this.maiorAposta = maiorAposta;
    }
    
    /**
    ---------> Getter getJogadoresRestantes <---------
    Acesso: public
    Entrada: -
    Objetivo: obter número de jogadores restantes
    Saída: número de jogadores restantes
    */
    public int getJogadoresRestantes() {
        return jogadoresRestantes;
    }
    
    /**
    ---------> Getter getEtapa <---------
    Acesso: public
    Entrada: -
    Objetivo: obter etapa do jogo
    Saída: etapa atual do jogo
    */
    public int getEtapa() {
        return etapa;
    }
    
    /**
    ---------> Setter setEtapa <---------
    Acesso: public
    Entrada: etapa
    Objetivo: Definir etapa
    Saída: -
    */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }
    
}
