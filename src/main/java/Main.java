import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> mal = new MyArrayList<String>();
        mal.add("1");
        mal.add("2");
        mal.add("3");
        mal.add("4");
        mal.add("5");

        MyArrayList<String> mal2 = new MyArrayList<String>();
        mal2.add("6");
        mal2.add("7");
        mal2.add("8");

        //Просто выводим mal                                                        //
        mal.print();
        System.out.println();

        //Выводим размер mal'а -- метод size                                        //
        System.out.println("Метод size: " + mal.size() + "\n");

        //Проверяем пустой ли он -- метод isEmpty                                   //
        System.out.println("Метод isEmpty: " + mal.isEmpty() + "\n");

        //Ищем в mal'е объект "3", и удаляем его -- метод remove(T t)               //
        System.out.println("Метод remove(T t): " + mal.remove("3") + "\n");

        //Выводим mal что бы посмотреть изменения                                   //
        mal.print();
        System.out.println();

        //Удаляем в mal'е объект под индексом 4 -- метод remove(int index)          //
        System.out.println("Метод remove(int index): " + mal.remove(4) + "\n");

        //Опять выводим mal что бы посмотреть изменения                             //
        mal.print();
        System.out.println();

        //Изменяем объект под под индексом 1 на "9" -- метод set                    //
        mal.set("9", 1);
        System.out.print("Метод set: ");
        mal.print();
        System.out.println();

        //Получаем объект под индексом 0 -- метод get                               //
        System.out.print("Метод get: ");
        System.out.println(mal.get(0) + "\n");

        //Объеденяем mal и mal2 -- метод addAll                                     //
        mal.addAll(mal2);

        //Выводим mal что бы посмотреть изменения                                   //
        System.out.print("Метод addAll: ");
        mal.print();
        System.out.println();

        //Выводим длину mal'а после его изменения                                   //
        System.out.println(mal.size() + "\n");

        //Добавляем на место индекса '6' значение "10"                              //
        System.out.print("Метод add(int index, T value): ");
        mal.add(6, "10");

        //Последний раз выводим mal                                                 //
        mal.print();

    }

}