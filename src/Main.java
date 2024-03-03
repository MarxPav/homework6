public class Main {
    //Задача 1
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача 8
        int savingMoney1 = 29000;
        int month1 = 0;
        for (int i = 1; i <= 12; i++) {
            month1 = month1 + savingMoney1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month1 + " рублей");
        }
        //Задача 9
        int savingMoney2 = 29000;
        int month2 = 0;
        for (int i = 1; i <= 12; i++) {
            month2 = month2 + month2 / 100;
            month2 = month2 + savingMoney2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month2 + " рублей");
        }
        //Задача 10
        int b = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(b + "*" + i + "=" + i * b);
        }
    }
}
