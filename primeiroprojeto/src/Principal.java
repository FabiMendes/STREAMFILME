import br.com.alura.screammatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //Criação do objeto meuFilme (instância da classe br.com.alura.screammatch.modelos.Filme)
        //Criando a instância da classe br.com.alura.screammatch.modelos.Filme com o operador new
        Filme meuFilme = new Filme();

        //Atribuindo valores ao objeto meuFilme
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        //chamando alguns métodos do objeto meuFilme
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //Imprime os resultados
        System.out.println("Total das avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.obtemMedia());


    }
}
