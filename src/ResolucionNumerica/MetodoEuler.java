package ResolucionNumerica;

public class MetodoEuler {

    public static double evaluarFuncion(double x, double y) {
        return x - y; // f(x,y) = x - y
    }

    public static double solucionExacta(double x) {
        return x - 1 + 2 * Math.exp(-x);
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1; // Variar: 0.1, 0.05, 0.01
        double xFinal = 0.3;

        // Criterio de paro formal N
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n\t x\t y_n (Euler)\t y_exacta\t Error abs");
        System.out.println("---------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\t %.4f\t %.6f\n", 0, x, y, solucionExacta(x), 0.0);

        for (int i = 0; i < nPasos; i++) {
            // y_{n+1} = y_n + h * f(x_n, y_n)
            y = y + h * evaluarFuncion(x, y);
            x = x + h;
            double exacta = solucionExacta(x);
            System.out.printf("%d\t %.4f\t %.4f\t %.4f\t %.6f\n", i + 1, x, y, exacta, Math.abs(y - exacta));
        }
    }
}