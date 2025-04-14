public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Task 2
        System.out.println("задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        //Task 3
        System.out.println("задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //Task 4
        System.out.println("задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Task 5
        System.out.println("задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Task 6
        System.out.println("задача 6");
        int number = 7;
        for (int i = 1; i <= 14; i++) {
            System.out.println(i * number);
        }
        //Task 7
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Task 8
        System.out.println("задача 8");
        int capital = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + capital;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Task 9
        System.out.println("задача 9");
        int capital1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + capital1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
        }
        //Task 10
        System.out.println("задача 10");
        int two = 2;
        for (int i = 1; i <= 10; i++){
            int multiplication = two * i;
            System.out.println("2*" + i + "="+ multiplication);
        }
    }
}