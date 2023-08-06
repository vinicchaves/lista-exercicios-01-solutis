import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou ímpar");
        int numero = leitura.nextInt();


        if (numero % 2 == 0){
            System.out.println("Número digitado é par.");
        }
        else{
            System.out.println("Número digitado é ímpar.");
        }
    }
}
