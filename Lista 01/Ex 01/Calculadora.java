
public class Calculadora {
    public static float adicionar(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtrair(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public static float dividir(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Float.NaN;
        } else {
            return num1 / num2;
        }
    }
}
