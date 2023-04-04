import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado? ");

        double lado = teclado.nextDouble();
        double area = lado * lado;
        double dobroarea = area * 2;
        
        System.out.printf("O dobro da área é de: %.2f", dobroarea);
        teclado.close();
    }
}
