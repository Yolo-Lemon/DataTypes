package datetyp;

public class DataTypes {
    public static void main(String args[]) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //Дана длина окружности. Найти площадь круга, ограниченного этой окружностью. В качестве значения Pi использовать 3.14
    private static void task1() {
        double l = 1;
        double pi = 3.14;
        double r = l / (2 * pi);
        double area = pi * (r * r);
        System.out.println("Площадь круга равна " + area);
    }

    //Какое расстояние пройдет луч света за 600 дней?
    private static void task2() {
        int days = 600;
        int hours = days * 24;
        double speed = 300000 * 3.6;
        double distance = speed * hours;
        System.out.println("Пройденый лучем путь равен " + distance + " километров");
    }

    //В кодировке КОИ-8 каждый символ кодируется одним байтом. Определите в битах информационный объем сообщения из 30 символов в этой кодировке.
    private static void task3() {
        byte symbols = 30;
        int bites = symbols * 8;
        System.out.println("В кодировке КОИ-8 30 символов займут " + bites + " байтов");
    }

    //В методе задачи вызови метод div(<аргумент: тип название_аргумента>) 2 раза. 
    //Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity". Код метода div() изменять нельзя.
    private static void task4() {
        div(1, 0);
        div(-1, 0);
    }

    private static void div(float a, float b) {
        System.out.println(a / b);
    }

    private static void task5() {
        div(infinity, infinity);
        div(infinity, infinity);
        div(infinity, infinity);
        div(infinity, infinity);
        

    }
}