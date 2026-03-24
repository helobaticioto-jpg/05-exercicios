import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        double salariomin, valorkw, conta;
        int kw;

        System.out.print("Digite o valor do salário mínimo:");
        salariomin = sc.nextDouble();
        System.out.print("Digite a quantidade de quilowatts gasta:");
        kw = sc.nextInt();
        valorkw = salariomin/7/100;
        conta = kw* valorkw;

        System.out.println("O valor da conta é:" + conta);
        System.out.println("O valor do kw é:" + valorkw);
        System.out.println("O valor da conta com 10% de desconto é:" + conta*0.9);

    }
}
