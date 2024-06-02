package lista100filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.rangeClosed(1, 100)
                .filter(n -> n %2 == 0) //wybiera tylko liczby parzyste
                .boxed() //opakowanie
                .collect(Collectors.toList()); //umieszcza liczby na liscie

        System.out.println(liczby); //wydruk listy
    }
}
