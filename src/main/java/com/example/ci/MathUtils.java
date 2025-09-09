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

    /** gcd(a,b) – máximo común divisor (maneja negativos). gcd(0,0) es indefinido → excepción. */
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("gcd(0,0) es indefinido");
        }
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    /** lcm(a,b) – mínimo común múltiplo (maneja negativos). lcm(0,0) es indefinido → excepción. */
    public static long lcm(long a, long b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("lcm(0,0) es indefinido");
        }
        long gcd = gcd(a, b);
        if (a == 0 || b == 0) return 0L;
        long result = Math.abs((a / gcd) * b);
        return result;
    }

}

