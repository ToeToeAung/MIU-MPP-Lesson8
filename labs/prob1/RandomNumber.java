package lesson8.labs.prob1;

import java.util.function.Supplier;

public class RandomNumber implements Supplier<Double> {
    @Override
    public Double get(){
        return Math.random();
    }
}