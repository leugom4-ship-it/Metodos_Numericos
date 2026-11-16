package ResolucionNumerica;


class MetodoRungeKutta{

    public static double evaluarFuncion(double x, double y) {
        return x + y; // f(x,y) = x + y
    }

    public static double solucionExacta(double x) {
        return -x - 1 + 2 * Math.exp(x);
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1; // Variar: 0.1, 0.05, 0.01
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n\t x\t y_n (RK4)\t y_exacta\t Error abs");
        System.out.println("---------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\t %.4f\t %.6f\n", 0, x, y, solucionExacta(x), 0.0);

        for (int i = 0; i < nPasos; i++) {
            double k1 = evaluarFuncion(x, y);
            double k2 = evaluarFuncion(x + h / 2, y + h / 2 * k1);
            double k3 = evaluarFuncion(x + h / 2, y + h / 2 * k2);
            double k4 = evaluarFuncion(x + h, y + h * k3);

            // Avance ponderado
            y = y + h / 6 * (k1 + 2 * k2 + 2 * k3 + k4);
            x = x + h;

            double exacta = solucionExacta(x);
            System.out.printf("%d\t %.4f\t %.4f\t %.4f\t %.6f\n", i + 1, x, y, exacta, Math.abs(y - exacta));
        }
    }
}