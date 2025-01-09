package datetyp;

public class DataTypes {
    public static void main(String args[]) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        taskOperations1();
        taskOperations2();
        taskOperations3();
        taskOperations4();
        taskOperations5();
        taskOperations6();
        taskOperations7();
        taskOperations8();
        taskOperations9();
        taskOperations10();
        taskOperations11();
        taskOperations12();
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
        int symbols = 30;
        int bytes = symbols * 8;
        System.out.println("В кодировке КОИ-8 30 символов займут " + bytes + " битов");
    }

    //В методе задачи вызови метод div(<аргумент: тип название_аргумента>) 2 раза. 
    //Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity". Код метода div() изменять нельзя.
    private static void task4() {
        div(1, 0);
        div(-1, 0);
    }

    private static void div(double a, double b) {
        System.out.println(a / b);
    }

    //В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN". Код метода div() изменять нельзя.
    private static void task5() {
        double c = 1.0 / 0.0;
        div(c, c);
    }

    //Как поменять местами два значения, не используя третью переменную? **
    private static void task6() {
        int num1 = 7;
        int num2 = 13;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Число1 = " + num1 + " Число2 = " + num2);
    }

    //К символьной переменной со значением ‘C ’ прибавить 1. Значение вывести в консоль.
    private static void task7() {
        char symbol1 = 'C';
        char symbol2 = 1;
        System.out.println(symbol1 + symbol2);
    }

    //Вычислите |x|+x5, если x=−2.
    private static void taskOperations1() {
        int x = -2;
        x = Math.abs(x);
        int result = x + x * 5;
        System.out.println(result);
    }

    //В коде указать цены для 1 кг конфет и 1 кг печенья. Найдите стоимость: 
    //а) одной покупки из 300 г конфет и 400 г печенья; б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
    private static void taskOperations2() {
        double priceCandy = 50.45;
        double priceCookie = 15.65;
        double var1 = priceCandy * 0.3 + priceCookie * 0.4;
        double var2 = 3 * (priceCandy * 1.8 + priceCookie * 2);
        System.out.println("Одна покупака из 300г конфет и 400г печенья будет стоить: " + var1);
        System.out.println("Три покупки по 1кг 800г и 2кг печенья будет стоить: " + var2);
    }

    //Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
    //в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c. Например, a=0, b=2, c=5, тогда новые значения a=2, b=3 и c=7.
    private static void taskOperations3() {
        int a = 0;
        int b = 2;
        int c = 5;
        c = a + b + c;
        a = a + b;
        b = (c - b - (a - b)) - (a - b); // a=1  b=4   c=8 =>  a=5   b=7   c=13
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }

    //Дан прямоугольник размером 647 x 170. Сколько квадратов со стороной 30 можно вырезать из него?
    private static void taskOperations4() {
        int height = 647;
        int width = 170;
        int P = height * width;
        int quadP = 30 * 30;
        int result = P / quadP;
        System.out.println("В прямоугольник влезет " + result + " квадрата");
    }

    //Дано целое четырехзначное число. Используя операции div (деление) и mod (остаток от деления), найти сумму его цифр.
    private static void taskOperations5() {
        int a = 4926;
        int a4 = a % 10;
        int a3 = a / 10 % 10;
        int a2 = a / 100 % 10;
        int a1 = a / 1000 % 10;
        int summ = a1 + a2 + a3 + a4;
        System.out.println("Сума цифр четырехзачного числа: " + summ);
    }

    //Дано целое четырехзначное число. Используя операции div и mod, найти произведение его цифр
    private static void taskOperations6() {
        int a = 5312;
        int a4 = a % 10;
        int a3 = a / 10 % 10;
        int a2 = a / 100 % 10;
        int a1 = a / 1000 % 10;
        int proizvedenie = a1 * a2 * a3 * a4;
        System.out.println("Произведение цифр четырехзачного числа: " + proizvedenie);
    }

    //Сначала определите результат логического выражения самостоятельно, а затем используйте для этого код: true && false || true && true.
    private static void taskOperations7() {
        boolean x = true && false || true && true;
        System.out.println(x);
    }

    //Сначала определите результат логического выражения самостоятельно, а затем используйте для этого код: true || ( false && true ) && true.
    private static void taskOperations8() {
        boolean x = true || (false && true) && true;
        System.out.println(x);
    }

    //Сначала определите результат логического выражения самостоятельно, а затем используйте для этого код: ( !true || false ) || true && !false.
    private static void taskOperations9() {
        boolean x = (!true || false) || true && !false;
        System.out.println(x);
    }

    //Проверить истинность высказывания: "Данные числа x, y являются координатами точки, лежащей в первой или третьей координатной четверти".
    private static void taskOperations10() {
        int x = -7;
        int y = 10;
        boolean result = (x > 0 && y > 0) || (x < 0 && y < 0);
        System.out.println("Выражение \"Данные числа x, y являются координатами точки, лежащей в первой или третьей координатной четверти\" = " + result);
    }

    //Проверить истинность высказывания: "Данное целое число является четным двузначным числом".
    private static void taskOperations11() {
        int x = 36;
        boolean result = ((1 <= (x / 10) && (x / 10) <= 9) && (x % 2 == 0));
        System.out.println("Выражение \"Данное целое число является четным двузначным числом\" = " + result);
    }

    //Даны три целых числа. Возвести в квадрат отрицательные числа и в третью степень — положительные (число 0 не изменять).
    private static void taskOperations12() {
        double a = 12;
        double b = -7;
        double c = 0;
        double i1 = (a > 2) ? Math.pow(a, 2) : Math.pow(a, 3);
        double i2 = (b > 2) ? Math.pow(b, 2) : Math.pow(b, 3);
        double i3 = (c > 2) ? Math.pow(c, 2) : Math.pow(c, 3);
        System.out.println("a = "+i1+" b = "+i2+" c = "+i3);
    }
}
