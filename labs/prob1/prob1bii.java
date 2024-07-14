package lesson8.labs.prob1;
import java.util.function.Supplier;

public class prob1bii {
    //Rewrite this method reference as a lambda expression
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());
    }
}
