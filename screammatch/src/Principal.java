import br.com.alura.screammatch.modelos.Filme;
import br.com.alura.screammatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //Criação do objeto meuFilme (instância da classe br.com.alura.screammatch.modelos.Filme)
        //Criando a instância da classe br.com.alura.screammatch.modelos.Filme com o operador new
        Filme meuFilme = new Filme();

        //Atribuindo valores ao objeto meuFilme
        meuFilme.setNome("Coraline");
        meuFilme.setAnoDeLancamento(2007);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        //chamando alguns métodos do objeto meuFilme
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //Imprime os resultados
        System.out.println("Total das avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.obtemMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }
}
