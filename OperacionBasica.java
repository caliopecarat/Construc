public class OperacionBasica {
    public double calcular(double numero1, char operador, double numero2) {
        switch (operador) {
            case '+': return numero1 + numero2;
            case '-': return numero1 - numero2;
            case '*': return numero1 * numero2;
            case '/': 
                if (numero2 == 0) throw new ArithmeticException("No se puede dividir por cero.");
                return numero1 / numero2;
            default: 
                throw new IllegalArgumentException("Operador no soportado.");
        }
    }
}
