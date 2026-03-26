import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int valordouser, valorimpresso1,valorimpresso2;

        System.out.println("Digite o valor desejado: ");
        valordouser = sc.nextInt();

        valorimpresso1 = valordouser%100;
        valorimpresso2 = valorimpresso1/10;

        System.out.println("O numero central é:" + valorimpresso2);

    }
}
