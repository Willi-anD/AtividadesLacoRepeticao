import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int idade = 0;

        do {
            try {
                out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                if (idade <= 0) {
                    out.println("Idade inválida. Por favor, digite um número maior que 0.");
                }
            } catch (InputMismatchException e) {
                out.println("Digite um número inteiro.");
                scanner.nextLine();
            } catch (Exception e) {
                out.println("Ocorreu um erro inesperado.");
            }
        }
        while (idade <= 0);
    }
}