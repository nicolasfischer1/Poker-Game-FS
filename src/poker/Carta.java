/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ghelfer
 */
public class Carta {

    private int valor; // valor da carta (1, 2, ...)
    private String face; // face da carta ("Ace", "Deuce", ...)
    private String naipe; // naipe da carta ("Hearts", "Diamonds", ...)

    // construtor de três argumentos inicializa valor, face e naipe da carta
    public Carta(int valor, String face, String naipe) {
        this.valor = valor;
        this.face = face; // inicializa face da carta
        this.naipe = naipe; // inicializa naipe da carta
    } // fim do construtor Card de três argumentos

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    // retorna representação String de Card
    @Override
    public String toString() {
        return face + " de " + naipe;
    }
}
