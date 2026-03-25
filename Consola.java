import java.util.Scanner;

public class Consola {
    private Scanner scanner = new Scanner(System.in);

    public String leerExpresion() {
        System.out.print("Ingresa la operación (ej. -7 + 12.8): ");
        return scanner.nextLine();
    }

    public void mostrarResultados(String expresionOriginal, double resultado) {
        System.out.println("Resultado: " + expresionOriginal.trim() + " = " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}