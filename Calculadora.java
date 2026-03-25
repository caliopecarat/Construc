public class Calculadora {
    private Consola consola;
    private LectorExpresion lector;
    private OperacionBasica operacion;

    public Calculadora() {
        this.consola = new Consola();
        this.lector = new LectorExpresion();
        this.operacion = new OperacionBasica();
    }

    public void iniciar() {
        String entrada = consola.leerExpresion();
        
        try {
            lector.separar(entrada);
            double num1 = lector.getNumero1();
            double num2 = lector.getNumero2();
            char op = lector.getOperador();
            
            double resultado = operacion.calcular(num1, op, num2);
            
            consola.mostrarResultados(entrada, resultado);
            
        } catch (Exception e) {
            // Captura errores de sintaxis o división por cero
            consola.mostrarError(e.getMessage());
        }
    }
}