/*3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e
métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avalicao;
    int numbAvaliacoes;

    public Musica(String titulo, String artista, int anolancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anolancamento;
        this.avalicao = 0;
        this.numbAvaliacoes = 0;
    }

    public void fichaTenica() {
        System.out.println("Título: " +titulo);
        System.out.println("Artista: " +artista);
        System.out.println("Ano de lançamento: " +anoLancamento);
        System.out.println("Média das avaliações: " +mediaAvaliacao());
        System.out.println("Número de avaliações: " +numbAvaliacoes);
    }

    public void avalia(double nota) {
        avalicao += nota;
        numbAvaliacoes ++;
    }

    public int mediaAvaliacao() {
        return (int) avalicao / numbAvaliacoes;
    }

    public static void main(String[] args) {
        Musica track01 = new Musica("I Dont Like The Drugs", "Marilyn Manson", 1998);

        track01.avalia(8);
        track01.avalia(10);
        track01.fichaTenica();
    }
}