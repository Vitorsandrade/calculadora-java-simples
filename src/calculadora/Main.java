package calculadora;

import java.util.Scanner;

public class Main extends Calculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculo calculo = new Calculo();

        String verifica;
        do {
            System.out.println("Escolha  Operação: ");
            System.out.println("[1] soma ");
            System.out.println("[2] subtração ");
            System.out.println("[3] divisão ");
            System.out.println("[4] multiplicação ");
            int operacao = scan.nextInt();


            System.out.println("Digite o primeiro número: ");
            calculo.setNum1(scan.nextDouble());

            System.out.println("Digite o segundo número: ");
            calculo.setNum2(scan.nextDouble());


            verifica = "s";

            switch (operacao) {
                case 1:
                    System.out.println(calculo.getNum1() + " + " + calculo.getNum2() + " = " + calculo.soma(calculo.getNum1(), calculo.getNum2()));

                    break;

                case 2:
                    System.out.println(calculo.getNum1() + " - " + calculo.getNum2() + " = " + calculo.subtracao(calculo.getNum1(), calculo.getNum2()));

                    break;

                case 3:
                    System.out.println(calculo.getNum1() + " / " + calculo.getNum2() + " = " + calculo.divisao(calculo.getNum1(), calculo.getNum2()));
                    break;

                case 4:
                    System.out.println(calculo.getNum1() + " X " + calculo.getNum2() + " = " + calculo.multplicacao(calculo.getNum1(), calculo.getNum2()));
                    break;

                default:
                    System.out.println("Valor inválido!");
                    break;
            }
            System.out.println("Você deseja realizar mais calculos? [s/n]");
            verifica = scan.next();

        } while (verifica.equals("s"));

    }
}