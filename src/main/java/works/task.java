package works;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static java.awt.SystemColor.info;

public class task {
        public static void main(String[] args) {
            System.out.println("Добрый день!");
            info(new String[]{});
            boolean cycle = true;
            Map<String, List<String>> phones = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            while (cycle) {
                System.out.println("Введите команду: ");
                String input = scanner.nextLine();
                String[] spltstr = input.split(" ");
                if ("add".equals(spltstr[0].toLowerCase())) {
                    if (phones.containsKey(spltstr[1])) {
                        phones.get(spltstr[1]).add(spltstr[2]);
                    } else {
                        phones.put(spltstr[1], new ArrayList<>(Arrays.asList(spltstr[2])));
                    }
                } else if ("get".equals(spltstr[0].toLowerCase())) {
                    if (phones.containsKey(spltstr[1])){
                    List<String> values = phones.get(spltstr[1]);
                    System.out.println("телефоны по пользователю " + spltstr[1] + ": ");
                    System.out.println(values);}
                    else{
                        System.out.println("пользователь с таким именем не найден");
                    }
                } else if ("remove".equals(spltstr[0].toLowerCase())) {
                    if (phones.containsKey(spltstr[1])){
                        phones.remove(spltstr[1]);
                        System.out.println("пользователь " + spltstr[1] + " удалён из справочника");}
                    else {System.out.println("пользователь с таким именем не найден");}
                } else if ("exit".equals(spltstr[0].toLowerCase())) {
                    cycle = false;
                } else if ("list".equals(spltstr[0].toLowerCase())) {
                    System.out.println(phones);
                } else if ("справка".equals(spltstr[0].toLowerCase())) {
                    info(new String[]{});
                }
            }
        }
    public static void info(String[] args) {
        System.out.println("введите команду 'add имя номер' для добавления пользователя в справочник");
        System.out.println("введите команду 'get имя' для получения всех номеров пользователя в справочник");
        System.out.println("введите команду 'remove имя' для удаления пользователя из справочника");
        System.out.println("введите команду 'list' для вывода всех пользователей и их телефонов");
        System.out.println("введите команду 'exit' для выхода из программы");
        System.out.println("введите команду 'справка' для повторного вызова справки");
    }
}

