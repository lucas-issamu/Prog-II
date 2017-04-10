package calculadora;

import javax.swing.JFrame;

public class Calculadora {

    double x;
    double y;

    public Calculadora() {
        x = 0;
        y = 0;
    }

    double somar(double x, double y) {
        return x + y;
    }

    double subtrair(double x, double y) {
        return x - y;
    }

    double multiplicar(double x, double y) {
        return x * y;
    }

    double dividir(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        JFrame janela = new Calculator();
        janela.setVisible(true);
    }

}
