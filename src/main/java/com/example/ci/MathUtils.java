package main.java.com.example.ci;


public final class MathUtils {
    private MathUtils() {}

    /** square(n) – retorna el cuadrado de un número */
    public static long square(long n) {
        return n * n;
    }

    /** factorial(n) – retorna factorial para n ∈ [0,20]. Lanza excepción si n < 0 o n > 20 (overflow). */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("factorial no está definido para negativos");
        }
        if (n > 20) {
            throw new IllegalArgumentException("factorial fuera de rango (n <= 20)");
        }
        long res = 1L;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    /** is_prime(n) – retorna si un número es primo o no (solo enteros >= 2 pueden ser primos). */
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;       // 2 y 3
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

}

