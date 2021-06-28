package poker;


import java.text.NumberFormat;



/**
---------> Classe Jogador <---------
Acesso: public
Prioridade: alta
Pacote: poker
Atributos: cartas, dinheiro, mao, resultado,
*          desistiu, numJogador, perdeuTudo
*/
public class Jogador {
    /**
    ---------> Classe Jogador <---------
    Acesso: public
    Prioridade: intermediária
    Pacote: poker
    Atributos: mao, maiorCarta
    */
    public class Resultado {
        // atributos
        private Maos mao;
        private int maiorCarta;
        
        /**
        ---------> Construtor Resultado <---------
        Acesso: public
        Entrada: Maos mao, int maiorCarta
        Objetivo: Construir o objeto
        Saída: Modificação direta do objeto
        */
        public Resultado(Maos mao, int maiorCarta){
            this.mao = mao;
            this.maiorCarta = maiorCarta;
        }
        
        /**
        ---------> Getter getMao <---------
        Acesso: public
        Entrada: -
        Objetivo: obter mão do resultado
        Saída: mão do resultado do jogador
        */
        public Maos getMao() {
            return mao;
        }
        
        /**
        ---------> Setter setMao <---------
        Acesso: public
        Entrada: mão
        Objetivo: Definir a mão do resultado
        Saída: -
        */
        public void setMao(Maos mao) {
            this.mao = mao;
        }
        
        /**
        ---------> Getter getMaiorCarta <---------
        Acesso: public
        Entrada: -
        Objetivo: obter maior carta do resultado
        Saída: maior carta do resultado
        */
        public int getMaiorCarta() {
            return maiorCarta;
        }
        
        /**
        ---------> Setter setMaiorCarta <---------
        Acesso: public
        Entrada: maiorCarta
        Objetivo: Definir a maior carta
        Saída: -
        */
        public void setMaiorCarta(int maiorCarta) {
            this.maiorCarta = maiorCarta;
        }
    }
    // atributos
    private Carta[] cartas;
    private float dinheiro;
    private Maos mao;
    private Resultado resultado;
    private boolean desistiu;
    private int numJogador;
    
    /**
    ---------> Construtor Mesa <---------
    Acesso: public
    Entrada: int numJogadores
    Objetivo: Construir o objeto
    Saída: Modificação direta do objeto
    */
    public Jogador(int numJogador) {
        this.cartas = new Carta[2];
        this.dinheiro = 100.0f;
        this.mao = Maos.HIGH_CARD;
        this.resultado = new Resultado(this.mao, 0);
        this.desistiu = false;
        this.numJogador = numJogador;
    }
    
    /**
    ---------> Método apostar <---------
    Acesso: public
    Entrada: valor da aposta do jogador
    Objetivo: contabilizar aposta de um jogador
    Saída: valor lógico indicando se o jogador pôde realizar a aposta
    */
    public boolean apostar(float valorAposta) {
        // aposta e retorna verdadeiro se possível, caso contrário, retorna falso
        if(this.dinheiro >= valorAposta){
            this.dinheiro -= valorAposta;
            return true;
        }else
            return false;
        
    }
    
    /**
    ---------> Método receberCartas <---------
    Acesso: public
    Entrada: cartas para o jogador
    Objetivo: configurar as cartas do jogador
    Saída: -
    */
    public void receberCartas(Carta carta1, Carta carta2) {
        // recebe cartas
        this.cartas[0] = carta1;
        this.cartas[1] = carta2;
    }
    
    /**
    ---------> Método receberGanhos <---------
    Acesso: public
    Entrada: ganhos
    Objetivo: ajusta o saldo de acordo com os ganhos
    Saída: -
    */
    public void receberGanhos(float ganhos){
        // recebe os ganhos
        this.dinheiro += ganhos;
    }
    
    /**
    ---------> Método calcularMao <---------
    Acesso: public
    Entrada: cartas públicas da mesa
    Objetivo: calcula o valor da mão do jogador
    Saída: resultado
    */
    public Resultado calcularMao(Carta[] cartasMesa) {
        Carta[] cartas = new Carta[7];
        for (int i = 0; i < 5; i++)
            cartas[i] = cartasMesa[i];
        cartas[5] = this.cartas[0];
        cartas[6] = this.cartas[1];
        this.ordenarcartas(cartas); // ordena as cartas
        // faz a checagem de cada possibilidade
        if (this.temRoyalFlush(cartas))
            this.mao = Maos.ROYAL_FLUSH;
        else if(this.temStraightFlush(cartas))
            this.mao = Maos.STRAIGHT_FLUSH;
        else if(this.temFourOfAKind(cartas))
            this.mao = Maos.FOUR_OF_A_KIND;
        else if(this.temFullHouse(cartas))
            this.mao = Maos.FULL_HOUSE;
        else if(this.temFlush(cartas))
            this.mao = Maos.FLUSH;
        else if(this.temStraight(cartas))
            this.mao = Maos.STRAIGHT;
        else if(this.temThreeOfAKind(cartas))
            this.mao = Maos.THREE_OF_A_KIND;
        else if(this.temTwoPairs(cartas))
            this.mao = Maos.TWO_PAIRS;
        else if(this.temOnePair(cartas))
            this.mao = Maos.ONE_PAIR;
        else
            this.mao = Maos.HIGH_CARD;
        
        int maiorCarta = 0;
        // obtém o valor máximo da combinação de cartas
        for(Carta carta : cartas){
            if(carta.getValor() > maiorCarta)
                maiorCarta = carta.getValor();
            if(carta.getValor() == 1) // se for ás tem o maior valor possível
                maiorCarta = 14;
        }
        this.resultado.setMaiorCarta(maiorCarta);
        this.resultado.setMao(this.mao);
        return this.resultado; // retorna o resultado
    }

    /**
    ---------> Método temRoyalFlush <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão royal flush
    Saída: valor lógico indicando se as cartas têm mão royal flush
    */
    private boolean temRoyalFlush(Carta[] cartas) {
        // checa se há flush e se há as cartas para royal flush
        if(this.temFlush(cartas))
            for (Carta carta1 : cartas) {
                if (carta1.getFace().equals("Dez")) {
                    for (Carta carta2 : cartas) {
                        if (carta2.getFace().equals("Valete")) {
                            for (Carta carta3 : cartas) {
                                if (carta3.getFace().equals("Dama")) {
                                    for (Carta carta4 : cartas) {
                                        if (carta4.getFace().equals("Rei")) {
                                            for (Carta carta5 : cartas) {
                                                if (carta5.getFace().equals("Ás")) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        return false;
    }
    
    /**
    ---------> Método temStraightFlush <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão straight flush
    Saída: valor lógico indicando se as cartas têm mão straight flush
    */
    private boolean temStraightFlush(Carta[] cartas){
        // checa se tem straight e se tem flush
        if(this.temStraight(cartas) && this.temFlush(cartas))
            return true;
        else
            return false;
    }
    
    /**
    ---------> Método temFourOfAKind <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão four of a kind
    Saída: valor lógico indicando se as cartas têm mão four of a kind
    */
    private boolean temFourOfAKind(Carta[] cartas){
        // checa se há quatro cartas de igual valor
        for(int i = 0; i < 4; i++){
            int valor = cartas[i].getValor();
            if(cartas[i + 1].getValor() == valor && cartas[i + 2].getValor() == valor &&
               cartas[i + 3].getValor() == valor)
                return true;
        }
        return false;
    }
    
    /**
    ---------> Método temFullHouse <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão full house
    Saída: valor lógico indicando se as cartas têm mão full house
    */
    private boolean temFullHouse(Carta[] cartas){
        // checa se tem um par e três iguais em valor
        if(this.temOnePair(cartas) && this.temThreeOfAKind(cartas))
            return true;
        else
            return false;

    }
    
    /**
    ---------> Método temStraight <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão straight
    Saída: valor lógico indicando se as cartas têm straight
    */
    private boolean temStraight(Carta[] cartasOriginais){
        Carta[] cartas = new Carta[7];
        // clona o vetor de cartas
        for(int i = 0; i < cartas.length; i++)
            cartas[i] = new Carta(cartasOriginais[i].getValor(), cartasOriginais[i].getFace(), cartasOriginais[i].getNaipe());
        
        this.moverRepetidas(cartas); // desloca as repetidas para um lado
        String naipe = cartas[0].getNaipe();
        int valor = cartas[0].getValor();
        
        // se há alguma carta que não siga a sequência, retorna falso
        for(int i = 1; i < cartas.length - 2; i++){
            if(cartas[i].getValor() != valor + i || !cartas[i].getNaipe().equals(naipe))
                return false;
        }
        return true;
    }
    
    /**
    ---------> Método temFlush <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão flush
    Saída: valor lógico indicando se as cartas têm flush
    */
    private boolean temFlush(Carta[] cartas){
        // checa se há 5 cartas do mesmo naipe
        String naipe = cartas[0].getNaipe();
        for(int i = 1; i < cartas.length; i++){
            if(!cartas[i].getNaipe().equals(naipe))
                return false;
        }
        return true;
    }
    
    /**
    ---------> Método temThreeOfAKind <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão three of a kind
    Saída: valor lógico indicando se as cartas têm mão three of a kind
    */
    private boolean temThreeOfAKind(Carta[] cartas){
        // checa se há três cartas de mesmo valor
        for(int i = 0; i < 5; i++){
            int valor = cartas[i].getValor();
            if(cartas[i + 1].getValor() == valor && cartas[i + 2].getValor() == valor)
                return true;
        }
        return false;
    }
    
    /**
    ---------> Método temTwoPairs <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão two pairs
    Saída: valor lógico indicando se as cartas têm mão two pairs
    */
    private boolean temTwoPairs(Carta[] cartas){
        int primeiroPar = 0;
        
        // checa se há dois pares de cartas de mesmo valor
        for(int i = 0; i < cartas.length - 1; i++){
            if(cartas[i].getValor() == cartas[i + 1].getValor()){
                if(primeiroPar == 0)
                    primeiroPar = cartas[i].getValor();
                else
                    return true;
            }
        }
        return false;
    }
    
    /**
    ---------> Método temOnePair <---------
    Acesso: private
    Entrada: cartas
    Objetivo: determinar se as cartas têm mão one pair
    Saída: valor lógico indicando se as cartas têm mão one pair
    */
    private boolean temOnePair(Carta[] cartas){
        // checa se há um par de cartas de mesmo valor
        for(int i = 0; i < cartas.length - 1; i++){
            if(cartas[i].getValor() == cartas[i + 1].getValor()){
                return true;
            }
        }
        return false;
    }
    
    /**
    ---------> Método temOnePair <---------
    Acesso: private
    Entrada: cartas
    Objetivo: mover as cartas repetidas
    Saída: -
    */
    private void moverRepetidas(Carta[] cartas){
        // desloca as cartas repetidas
        for(int i = 0; i < cartas.length - 1; i++) {
            if(cartas[i].getValor() == cartas[i + 1].getValor()) {
                for (int j = i + 1; j < cartas.length - 1; j++) {
                    cartas[j] = cartas[j + 1];
                }
            }
        }
    }
    
    /**
    ---------> Método ordenarcartas <---------
    Acesso: private
    Entrada: cartas
    Objetivo: ordenar as cartas em ordem crescente por valor
    Saída: -
    */
    private void ordenarcartas(Carta[] cartas){
        // ordena as cartas por valor em ordem crescente
        for(int i = 0; i < cartas.length; i++){
            for(int j = 0; j < cartas.length; j++){
                if(cartas[i].getValor() > cartas[j].getValor()){
                    Carta aux = cartas[i];
                    cartas[i] = cartas[j];
                    cartas[j] = aux;
                }
            }
        }

    }
    
    /**
    ---------> Getter getCartas <---------
    Acesso: public
    Entrada: -
    Objetivo: obter cartas do jogador
    Saída: cartas atuais do jogador
    */
    public Carta[] getCartas() {
        return cartas;
    }
    
    /**
    ---------> Getter getDinheiro <---------
    Acesso: public
    Entrada: -
    Objetivo: obter dinheiro do jogador
    Saída: dinheiro atual do jogador com todas as casas decimais
    */
    public float getDinheiro() {
        return dinheiro;
    }
    
        /**
    ---------> Getter getDinheiro <---------
    Acesso: public
    Entrada: quantidade de casas decimais desejadas
    Objetivo: obter dinheiro do jogador em relação as cadas decimais solicitadas
    Saída: dinheiro atual do jogador formatado com 2 casas decimais
    */
    public String getDinheiro(int casasDecimais){
        String formatacao = String.format("%%.%df", casasDecimais);
        return String.format(formatacao, this.dinheiro);
    }
    
    
    /**
    ---------> Getter getMao <---------
    Acesso: public
    Entrada: -
    Objetivo: obter mão do jogador
    Saída: mão atual do jogador
    */
    public Maos getMao() {
        return mao;
    }
    
    /**
    ---------> Setter setMao <---------
    Acesso: public
    Entrada: a mão do jogador
    Objetivo: definir a mão do jogador
    Saída: -
    */
    public void setMao(Maos mao) {
        this.mao = mao;
    }
    
    /**
    ---------> Getter getResultado <---------
    Acesso: public
    Entrada: -
    Objetivo: obter resultado do jogador
    Saída: resultado atual do jogador
    */
    public Resultado getResultado() {
        return resultado;
    }
    
    /**
    ---------> Getter isDesistiu <---------
    Acesso: public
    Entrada: -
    Objetivo: obter o estado de desistência do jogador
    Saída: o estado de desistência atual do jogador
    */
    public boolean isDesistiu() {
        return desistiu;
    }
    
    /**
    ---------> Setter setDesistiu <---------
    Acesso: public
    Entrada: o estado de desistência atual do jogador
    Objetivo: definir o estado de desistência do jogador
    Saída: -
    */
    public void setDesistiu(boolean desistiu) {
        this.desistiu = desistiu;
    }
    
    /**
    ---------> Getter getNumJogador <---------
    Acesso: public
    Entrada: -
    Objetivo: obter o número do jogador
    Saída: o número identificador do jogador
    */
    public int getNumJogador() {
        return numJogador;
    }

}