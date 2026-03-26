import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoruser,unidade,dezena,centena,valorinv;

        System.out.print("Digite um número de 3 digitos:");
        valoruser = sc.nextInt();;

        unidade = valoruser%10;
        dezena = valoruser%100/10;
        centena = valoruser/100;
        valorinv = unidade*100 + dezena*10 + centena;

        System.out.print("O número invertido é:" + valorinv );
    }
}
