/*5 - Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.*/

public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("O nome do aluno é: " +nome);
        System.out.println("A idade do aluno é: " +idade);
    }

    public static void main(String[] args) {
        Aluno luizRossini = new Aluno("Luiz Rossini", 20);
        Aluno jocastaPedroso = new Aluno("Jocasta Pedroso", 20);

        luizRossini.exibirInfo();
        jocastaPedroso.exibirInfo();
    }
}