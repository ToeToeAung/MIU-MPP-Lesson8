package lesson8.labs.prob1;

import java.util.function.Supplier;

public class prob1biii {

public static void main(String[] args) {
     Supplier<Double> randomNumber =new RandomNumber();
     System.out.println(randomNumber.get());
}
}


