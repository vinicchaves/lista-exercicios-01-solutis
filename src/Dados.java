public class Dados {
    public static void main(String[] args) {
        int possibilidadesTotal = 0;


        for (int dado1 = 1; dado1 <=6 ; dado1++) {
            for (int dado2 = 1; dado2 <=6 ; dado2++) {
                if (dado1 + dado2 ==7){
                    System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
                    possibilidadesTotal++;
                }

            }

        }
        System.out.println("O total de possibilidades é de: " + possibilidadesTotal);
    }
}
