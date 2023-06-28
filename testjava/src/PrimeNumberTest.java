import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @org.junit.jupiter.api.Test
    void generatePrimes() {

    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertEquals(true, PrimeNumber.isPrime(3));
        assertEquals(true, PrimeNumber.isPrime(5));
        assertEquals(true, PrimeNumber.isPrime(7));
        assertEquals(true, PrimeNumber.isPrime(11));
        assertEquals(true, PrimeNumber.isPrime(13));
        assertEquals(true, PrimeNumber.isPrime(79));
        assertEquals(false, PrimeNumber.isPrime(4));
    }
}