package main.java.com.example.ci;


public final class MathUtils {
    private MathUtils() {}

    /** square(n) – retorna el cuadrado de un número */
    public static long square(long n) {
        // Nota: podría overflow si n es muy grande; dejamos comportamiento estándar de long.
        return n * n;
    }

}

