package poker;

/**
---------> Enum Maos <---------
Acesso: public
Prioridade: intermediária
Pacote: poker
Atributos: int valor
*/
public enum Maos{
    // mãos possíveis
    HIGH_CARD(1), ONE_PAIR(2), TWO_PAIRS(3), THREE_OF_A_KIND(4), STRAIGHT(5),
    FLUSH(6), FULL_HOUSE(7), FOUR_OF_A_KIND(8), STRAIGHT_FLUSH(9), ROYAL_FLUSH(10);
    private int valor; // atributo que corresponde ao valor da mão
    // construtor
    Maos(int valor){
        this.valor = valor;
    }
}