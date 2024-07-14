package lesson8.labs.prob3;
import java.util.List;
import java.util.function.BiFunction;
import java.util.ArrayList;

public class BiFunctionProblem {
    public static void main(String[] args) {

        BiFunction<Double,Double,List<Double>> f= (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

       List<Double> result = f.apply(2.0,3.0);
       System.out.println(result);

    }
}
