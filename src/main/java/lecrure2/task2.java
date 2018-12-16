package lecrure2;

import java.util.HashMap;
import java.util.Map;

// Есть коллекция HashMap<String, String>,туда занесли 10 различных строк. Вывести на экран список ключей, каждый элемент с новой строки.
// Требования:
// Программа должна создавать переменную коллекции HashMap с типом элементов String, String. Переменная должна быть сразу проинициализирована.
// Программа не должна считывать значения с клавиатуры.
// Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
// Метод printKeys() должен выводить на экран список ключей коллекции, каждый элемент с новой строки.

public class task2 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map)
    {
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            System.out.println(key);
        }
    }
}
