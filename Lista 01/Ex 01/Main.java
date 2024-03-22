import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.print("Informe o primeiro número: ");
        float num1 = leitor.nextFloat();

        System.out.println("------------------------");

        System.out.print("Informe o segundo número: ");
        float num2 = leitor.nextFloat();

        System.out.println("------------------------");

        System.out.println("~ Resultados ~");    
        System.out.println(" "); 
        System.out.println("Adição: " + Calculadora.adicionar(num1, num2));
        System.out.println(" "); 
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println(" "); 
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println(" "); 
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2)); 
        System.out.println(" "); 
        System.out.println("------------------------");
    }
}
