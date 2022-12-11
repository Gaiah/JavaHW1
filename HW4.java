import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках.
// Сортировать пользователей по возрасту.

public class HW4 {

    public static void main(String[] args) {

        System.out.println("How many contacts do you want to create?");

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number below:  ");
        int qnt = scan.nextInt();
        Scanner contacts = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> lastnames = new ArrayList<>();
        ArrayList<String> middleNames = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();


        for (int i = 0; i < qnt; i++) {

            System.out.print("Name:  ");
            String name = contacts.nextLine();
            names.add(name);
            System.out.print("Lastname:  ");
            String lastname = contacts.nextLine();
            lastnames.add(lastname);
            System.out.print("Middle name:  ");
            String midName = contacts.nextLine();
            middleNames.add(midName);
            System.out.print("Age:  ");
            String age = contacts.nextLine();
            int ageInt = Integer.parseInt(age);
            ages.add(ageInt);
            System.out.print("Input 'F' for female / 'M' for male/ 'C' for custom:  ");
            String feMale = contacts.nextLine();
            gender.add(feMale);

            indexes.add(i);

        }


        scan.close();
        contacts.close();

        System.out.println(names);
        System.out.println(lastnames);
        System.out.println(middleNames);
        System.out.println(ages);
        System.out.println(gender);
        System.out.println(indexes);


        // Вместо "пузырьковой" сортировки:
        List<Integer> sortedList = ages.stream().sorted().toList();
        sortedList.forEach(System.out::print);


    }

}
