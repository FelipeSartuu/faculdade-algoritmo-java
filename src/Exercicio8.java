import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, dezena;

        System.out.print(("Informe o valor com 3 digítos (100 - 999): "));
        valor = sc.nextInt();

        dezena = valor % 100 / 10;

        System.out.println("Dezena é " + dezena);
    }
}
