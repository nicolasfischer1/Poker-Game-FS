/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;

/**
 *
 * @author ghelfer
 */
public class Baralho {

    private Carta cartas[]; // array de objetos Carta
    private int cartaAtual; // Índice do próximo Carta a ser distribuído
    private final int NUMERO_DE_CARTAS = 52; // número constante de Cartas
    private Random random; // gerador de número aleatório
    public final static String[] NAIPES = {"Copas", "Ouros", "Paus", "Espadas"}; //Hearts,Diamonds,Clubs,Spades

    // construtor preenche baralho de cartas
    public Baralho() {
        int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String faces[] = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis",
                "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"}; //Jack, Queen, King

        cartas = new Carta[NUMERO_DE_CARTAS]; // cria array de objetos Carta
        cartaAtual = 0; // configura currentCarta então o primeiro Carta distribuído é deck[ 0 ]
        random = new Random(); // cria gerador de número aleatório

        // preenche baralho com objetos Carta
        for (int cont = 0; cont < cartas.length; cont++) {
            cartas[cont] = new Carta(valores[cont % 13], faces[cont % 13], NAIPES[cont / 13]);
        }
    } // fim do construtor DeckOfCartas

    public void embaralhar() {
        // depois de embaralhar, a distribuição deve iniciar em baralho[ 0 ] novamente
        cartaAtual = 0; // reinicializa currentCarta

        // para cada Carta, seleciona outra Carta aleatório e as compara
        for (int first = 0; first < cartas.length; first++) {
            // seleciona um número aleatório entre 0 e 51
            int second = random.nextInt(NUMERO_DE_CARTAS);

            // compara Carta atual com Carta aleatoriamente selecionada
            Carta temp = cartas[first];
            cartas[first] = cartas[second];
            cartas[second] = temp;
        } // fim de for
    } // fim do método shuffle

    // distribui um Carta
    public Carta darCarta() {
        // determina se ainda há Cartas a ser distribuídos
        if (cartaAtual < cartas.length) {
            return cartas[cartaAtual++]; // retorna Carta atual no array
        } else {
            return null; // retorna nulo p/ indicar que todos os Cartas foram distribuídos
        }
    } // fim do método dealCarta
    

} // fim da classe DeckOfCartas

