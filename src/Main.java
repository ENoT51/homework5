
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int value = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + value;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        int value2 = 29000;
        int total2 = 0;
        for (int i = 1; i < 13; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + value2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }
        for (int i =1; i <= 10; i++){
            int y = i * 2;
            System.out.println("2*" + i + " = " + y);
        }
    }
}