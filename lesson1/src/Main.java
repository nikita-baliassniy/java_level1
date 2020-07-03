public class Main {

    public static void main(String[] args) {
        int a = 5, b = 6, c = 10, d = 2, f = -5;
        int year1 = 2000, year2 = 300, year3 = 2012, year4 = 2013;
        String currentName = "Ivan";
        byte b1 = 2;
        short s1 = 202;
        long l1 = 2020202022;
        float f1 = 1;
        double d1 = 0.1;
        boolean bool1 = true;
        char c1 = 'c';

        System.out.println(calculation(a, b, c, d));
        System.out.println(checkSum(a, c));
        System.out.println(checkSum(a, f));
        checkNegativeOrPositive(f);
        checkNegativeOrPositive(a);
        System.out.println(checkForNegative(f));
        System.out.println(checkForNegative(b));
        helloName(currentName);
        checkLeapYear(year1);
        checkLeapYear(year2);
        checkLeapYear(year3);
        checkLeapYear(year4);
    }

    private static double calculation (int a, int b, int c, int d) {
        double answer = 0;
        if(d == 0)
            System.out.println("Некорректно задано число d - деление на ноль");
        else
            answer = a * (b + (c * 1.0 / d));
        return answer;
    }

    private static boolean checkSum(int a, int b){
        boolean answer = false;
        int sum = a + b;
        if(sum <= 20 && sum >= 10)
            answer = true;
        return answer;
    }

    private static void checkNegativeOrPositive(int number){
        if(number < 1)
            System.out.println("Число отрицательное");
        else
            System.out.println("Число положительное (или ноль)");
    }

    private static boolean checkForNegative(int number){
        boolean answer = false;
        if (number < 0)
            answer = true;
        return answer;
    }

    private static void helloName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private static void checkLeapYear(int year) {
        if( (year % 400 == 0) ||(year % 100 != 0 && year % 4 == 0) )
            System.out.println("Введенный год високосный");
        else
            System.out.println("Введенный год не високосный");
    }

}
