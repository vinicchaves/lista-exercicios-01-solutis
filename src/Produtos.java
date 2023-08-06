import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o código do produto?");
        int codigo = leitura.nextInt();

        if (codigo == 1){
            System.out.println("Parafuso");
        }
        else if(codigo == 2){
            System.out.println("Porca");
        }
        else if(codigo == 3){
            System.out.println("Prego");
        }
        else{
            System.out.println("Diversos");
        }
    }
}
