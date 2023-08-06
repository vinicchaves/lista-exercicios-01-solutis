import java.util.Scanner;

public class CalcularMediaDoWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contagem = 0;
        double somaNumeros = 0;

        do {
            System.out.println("Digite um número para calcular a média aritmética");
            double numero = leitura.nextDouble();
            somaNumeros += numero;
            contagem++;
        } while (contagem < 50);
        double media = somaNumeros/contagem;
        System.out.println("A média dos números é: " + media);

    }
}
