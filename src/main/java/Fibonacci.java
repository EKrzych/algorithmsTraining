import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer, BigInteger> fibList = new HashMap<>();

    {
        fibList.put(0, BigInteger.ZERO);
        fibList.put(1,BigInteger.ONE);
        fibList.put(2,BigInteger.ONE);
    }

    private BigInteger fibonacci(int n) {
        return fibList.computeIfAbsent(n,
                (key) -> fibonacci(n - 1).add(fibonacci(n - 2)));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 100; i++) {
            System.out.println(f.fibonacci(i));
        }

    }

}
