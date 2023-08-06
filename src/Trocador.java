import java.util.Scanner;


public class Trocador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite um valor numérico para A");
        double A = leitura.nextDouble();


        System.out.println("Digite um valor numérico para B");
        double B = leitura.nextDouble();


        //Trocando os valores


        double x = A;
        A = B;
        B = x;




        System.out.println("Valor de A agora: " + A);
        System.out.println("Valor de B agora: " + B);
    }
}
