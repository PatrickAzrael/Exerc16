import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner dale = new Scanner(System.in);
        // Declaração de variáveis
        double latas;
        double area;
        // Entrada de dados
        System.out.println("Informe a área que será pintada: ");
        area = dale.nextDouble();

        int latasmetro = 54;
        int valorlata = 80;
        // Cálculos
        latas = Math.ceil(area / latasmetro);
        dale.close();
        double valor;

        valor = (latas * valorlata);
        // Saída de Dados
        System.out.println(
                "O valor necessário será: " + valor + " reais e a quantidade de latas necessárias são: " + latas);
    }
}