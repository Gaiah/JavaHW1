import java.util.*;

public class HW5 {

    public static void main(String[] args) {

//      1.  Создать словарь HashMap. Обобщение <Integer, String>.
//      2.  Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
//      3.  Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
//      4.  *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
//      5.  **Сравнить время прямого и случайного перебора тысячи элементов словарей.


        Map<Integer, String> someMap = new HashMap<>();
        someMap.put(0, "black");
        someMap.put(1, "red");
        someMap.put(2, "white");

        someMap.forEach((a, b) -> someMap.compute(a, (old, newV) -> (newV +"!")));
        System.out.println(someMap);

        TreeMap<Integer, String> someTreeMap = new TreeMap<>();
        someTreeMap.put(0, "color1");
        someTreeMap.put(1, "color2");
        someTreeMap.put(2, "color3");

        Map<Integer, String> someTable = new Hashtable<>(1000);
        Random r = new Random();
        someTable.forEach((a, b) -> {
            a = r.nextInt();
            b = "Some String";
        });

    }
}
