import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        // declaração de dados
        Scanner sc = new Scanner (System.in);
        double valorhoraaula, porcentageminss, salariobruto, valordescontado, salarioliqmen;
        int numerohoratrabalhada;

        //entrada de dados
        System.out.print("Digite o valor da hora-aula:");
        valorhoraaula = sc.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas no mes:");
        numerohoratrabalhada = sc.nextInt();
        System.out.print("Digite a porcentagem de desconto do inss:");
        porcentageminss = sc.nextDouble();

        //processamento
        salariobruto=valorhoraaula*numerohoratrabalhada;
        valordescontado = salariobruto*porcentageminss/100;
        salarioliqmen = salariobruto-valordescontado;


        // saída de dados
        System.out.println("O valor do salário bruto:" + salariobruto);
        System.out.println("O valor descontado pelo inss é:" + valordescontado);
        System.out.println ("O salário liquido mensal é:" + String.format("%.2f", salarioliqmen));

    }
}