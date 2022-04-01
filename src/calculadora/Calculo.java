package calculadora;


public class Calculo {
    double num1, num2;


    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;

    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }
}
