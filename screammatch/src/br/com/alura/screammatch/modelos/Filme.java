package br.com.alura.screammatch.modelos;

public class Filme {
    //Atb da Class
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasavaliacaoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //modificador de acesso
   public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Método para exibir a ficha técnica do filme
   public void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }
// // Método para avaliar o filme
    public void avalia(double nota){
        somaDasavaliacaoes += nota;
        totalDeAvaliacoes ++;
    }
    //// Método para obter a média das avaliações
    public double obtemMedia(){
        return somaDasavaliacaoes / totalDeAvaliacoes;
    }
}