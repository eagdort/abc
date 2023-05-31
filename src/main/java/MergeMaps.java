import java.util.HashMap;
import java.util.Map;

/**
 * Дано две мапы, в которых есть повторяющиеся ключи. Необходимо сделать одну результирующую,
 * в которой значения для повторяющихся ключей взяты из первой.
 *
 * Результат вывести на экран
 *
 * Предложите несколько вариантов решения.
 *
 * @author Aleksey Karpo (Karpo.A.Bo@sberbank.ru)
 */
public class MergeMaps {

    private static final Map<String, String> map1 = new HashMap<>();

    private static final Map<String, String> map2 = new HashMap<>();

    static  {
        map1.put("John", "developer");
        map1.put("Bill", "tester");
        map1.put("Bob", "analyst");
        map1.put("Alice", "product owner");

        map2.put("John", "architect");
        map2.put("Gary", "devops");
        map2.put("Kate", "manager");
    }

    public static void main(String[] args) {
        //...
    }
}
