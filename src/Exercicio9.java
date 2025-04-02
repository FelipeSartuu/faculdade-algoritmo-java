import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digitado, primeiro, segundo, terceiro;

        System.out.print("Digite um número 100-999: ");
        digitado = sc.nextInt();

        primeiro = digitado / 100;
        segundo = digitado % 100 / 10;
        terceiro = digitado % 10;

        System.out.println("O valor ao contrário" + terceiro + segundo + primeiro
        );

    }
}
