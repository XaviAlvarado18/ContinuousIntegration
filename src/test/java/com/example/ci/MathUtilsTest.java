package test.java.com.example.ci;


import main.java.com.example.ci.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    // square
    @Test
    void squareHappyPath() {
        assertEquals(25L, MathUtils.square(5));
        assertEquals(0L, MathUtils.square(0));
    }

    @Test
    void squareWithNegative() {
        assertEquals(9L, MathUtils.square(-3));
    }

    // factorial
    @Test
    void factorialHappyPath() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
    }

    @Test
    void factorialErrors() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-5));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(21));
    }

    // isPrime
    @Test
    void isPrimeHappyPath() {
        assertTrue(MathUtils.isPrime(10));
        assertTrue(MathUtils.isPrime(17));
    }

    @Test
    void isPrimeCompositeOrEdge() {
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(-5));
        assertFalse(MathUtils.isPrime(15));
    }

    // gcd
    @Test
    void gcdHappyPath() {
        assertEquals(6L, MathUtils.gcd(54, 24));
        assertEquals(5L, MathUtils.gcd(0, 5));
        assertEquals(5L, MathUtils.gcd(-10, 15)); // maneja negativos
    }

    @Test
    void gcdErrorOnZeroZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.gcd(0, 0));
    }

    // lcm
    @Test
    void lcmHappyPath() {
        assertEquals(12L, MathUtils.lcm(4, 6));
        assertEquals(0L, MathUtils.lcm(0, 5));
        assertEquals(30L, MathUtils.lcm(-10, 15)); // maneja negativos
    }

    @Test
    void lcmErrorOnZeroZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.lcm(0, 0));
    }
}
