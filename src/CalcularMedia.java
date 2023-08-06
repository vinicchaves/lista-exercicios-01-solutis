import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contagem = 0;
        double somaNumeros = 0;

        while(contagem < 50){
            System.out.println("Digite um número para calcular a média aritmética");
            double numero = leitura.nextDouble();
            somaNumeros += numero;
            contagem++;
        }
        double media = somaNumeros/contagem;
        System.out.println("A média dos números é: " + media);
    }
}
