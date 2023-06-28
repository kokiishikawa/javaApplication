import java.util.ArrayList;
import java.util.List;

public class prime {
    public static void main(String[] args) {
        int numberOfPrimes = 10;
        List<Integer> primes = generatePrimes(numberOfPrimes);
        for (int i = 0; i < primes.size(); i++) {
            System.out.println(i + 1 + ":" + primes.get(i));
        }
    }

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            //エラストテネスの篩を使えばもっと計算効率を上げられる。
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
