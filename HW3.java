import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class HW3 {

// 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println(list);
//  2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");

        System.out.println(colors);

        ListIterator<String> iterator = colors.listIterator();
        while (iterator.hasNext()){
            iterator.set(iterator.next() + "!");

        }

        System.out.println(colors);

//  3. Вставить элемент в список в первой позиции.

        colors.add(0, "black");
        System.out.println(colors);

//  4. Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(colors.get(0));

//  5. Обновить определенный элемент списка по заданному индексу.

        colors.set(1, "zebra");
        System.out.println(colors);

//  6. Удалить третий элемент из списка.

        colors.remove(2);
        System.out.println(colors);

//  7. Поиска элемента в списке по строке.

        System.out.println(colors.contains("zebra"));

//  8. Создать новый список и добавить в него несколько елементов первого списка.

        List<String> flowers = new ArrayList<>();

        flowers.add(0, colors.get(0));
        flowers.addAll(colors.subList(0, 3));
        System.out.println(flowers);

//  9. Удалить из первого списка все элементы отсутствующие во втором списке.

        flowers.add("rose");
        colors.add("cow-pattern");

        //colors.removeIf(a-> (a != flowers.get(0)));

//  Не нашла встроенный метод. Подскажите, пожалуйста, если он есть.
        System.out.println("hey there");
        System.out.println(flowers);
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            if(!flowers.contains(colors.get(i))) {
                colors.remove(i);
            }

        }
        System.out.println(colors);


//  10. *Сортировка списка.

        Collections.sort(flowers);
        System.out.println(flowers);

    }
}


