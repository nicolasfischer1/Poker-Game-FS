
package poker;

/**
---------> Classe MesaDeJogo <---------
Acesso: public
Prioridade: alta
Pacote: poker
Atributos: baralho, jogadores, cartasAtuais, emJogo
*/
public abstract class MesaDeJogo {
    // atributos
    protected Baralho baralho;
    protected Jogador[] jogadores;
    protected Carta[] cartasAtuais;
    protected int emJogo;
    
    // escopo de métodos
    abstract Jogador[] comecarJogo();
    abstract boolean terminarJogo();
    abstract void verificarVencedor();
    
}
