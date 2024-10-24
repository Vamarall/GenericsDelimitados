package entities;
import java.util.List;

public class CalculationService {

    //Metodo max trabalha com um tipo generico "T" que é um subtipo de Comparable<T> 
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista nao pode estar vazia");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

}