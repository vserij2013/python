package HomeWork2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(part1(9,6));
        part2(5);
        System.out.println(part3(-7));
        part4("Vadim",5);

        System.out.println(part5(400)); //part5*
    }

    public static boolean part1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        {
            return false;
        }
    }

    public static void part2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean part3(int x) {
        if (x < 0) {
            return true;
        }
        {
            return false;
        }
    }

    public static void part4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean part5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
