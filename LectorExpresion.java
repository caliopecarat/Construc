import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LectorExpresion {
    private double numero1;
    private double numero2;
    private char operador;

    private final String patronRegex = "^\\s*(-?\\d+\\.?\\d*)\\s*([\\+\\-\\*/])\\s*(-?\\d+\\.?\\d*)\\s*$";

    private boolean validar(String expresion) {
        return expresion.matches(patronRegex);
    }

    public void separar(String expresion) {
        if (!validar(expresion)) {
            throw new IllegalArgumentException("Formato inválido. Usa el formato: [numero] [operador] [numero] (ej. -5 + 10)");
        }

        Pattern pattern = Pattern.compile(patronRegex);
        Matcher matcher = pattern.matcher(expresion);

        if (matcher.find()) {
            this.numero1 = Double.parseDouble(matcher.group(1));
            this.operador = matcher.group(2).charAt(0);
            this.numero2 = Double.parseDouble(matcher.group(3));
        }
    }

    public double getNumero1() { return numero1; }
    public double getNumero2() { return numero2; }
    public char getOperador() { return operador; }
}