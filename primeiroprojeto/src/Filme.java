public class Filme {
    //Atb da Class
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasavaliacaoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

//modificador de acesso
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


//Método para exibir a ficha técnica do filme
    void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }
// // Método para avaliar o filme
    void avalia(double nota){
        somaDasavaliacaoes += nota;
        totalDeAvaliacoes ++;
    }
    //// Método para obter a média das avaliações
    double obtemMedia(){
        return somaDasavaliacaoes / totalDeAvaliacoes;
    }
}