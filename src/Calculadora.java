//2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

public class Calculadora {

    public int dobro(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        Calculadora minhaConta = new Calculadora();

        int resultado = minhaConta.dobro(10);
        System.out.println(resultado);
    }
}