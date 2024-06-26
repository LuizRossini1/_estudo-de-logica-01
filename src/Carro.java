/*4 - Crie uma classe Carro com atributos modelo, ano, cor e
métodos para exibir a ficha técnica e calcular a idade do carro.*/

public class Carro {
    String modelo;
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void fichaTecnica() {
        System.out.println("Modelo do veículo: " +modelo);
        System.out.println("Ano do veículo: " +ano);
        System.out.println("Cor do veículo: " +cor);
    }

    public int calculoIdade() {
        return 2024 - ano;
    }

    public static void main(String[] args) {
        Carro troller = new Carro("Troller T4", 2014, "Amarelo");
        Carro unoMille = new Carro("Uno Mille", 1999, "Vermelho");

        unoMille.fichaTecnica();
        System.out.println("O carro tem: " +unoMille.calculoIdade()+ " anos de idade");

        System.out.println("\n");

        troller.fichaTecnica();
        System.out.println("O carro tem: " +troller.calculoIdade()+ " anos de idade");
    }
}