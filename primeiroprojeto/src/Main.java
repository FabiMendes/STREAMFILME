// classe
public class Main {
    //metodo
    public static void main(String[] args) {
        //imprimir o resultado
        System.out.println("Esse é o SCREEN MACTH!");
        System.out.println("Filme: Coraline");



        int anoDeLancamento = 2009;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Coraline
                Coraline é um filme de animação stop-motion estadunidense de 2009, do gênero fantasia. Coraline Jones tem que se adaptar à vida nos apartamentos do Palácio Rosa.
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(anoDeLancamento);


//Comparação de Strings
        // String senha = "12345";
        //if (senha.equals("12345")) {
        // System.out.println("Acesso autorizado!");
        //  } else {
        //    System.out.println("Senha incorreta.");
       // }


//format(), da classe String,  método permite formatar um texto utilizando diversos placeholders,
// que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será
// inserido no placeholder.
        //String nome = "João";
        // int aulas = 4;

        //String mensagem = """
        //    Olá, %s!
        //   Boas vindas ao curso de Java.
        //   Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
        //   """.formatted(nome, aulas);

        // System.out.println(mensagem);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}