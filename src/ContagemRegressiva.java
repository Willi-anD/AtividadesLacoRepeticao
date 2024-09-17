import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int numeroInicial = scanner.nextInt();

        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--;
        }

        System.out.println("Fim da contagem!");
    }
}
