package java_level1;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 45, "Engineer", "+7(495)345-67-89", "ivanov.ii@gmail.com", 100000.00);
        employees[1] = new Employee("Petrov Petr Petrovich", 25, "Trainee", "+7(499)124-77-91", "petrov.pp@mail.com", 40000.00);
        employees[2] = new Employee("Semenov Semen Semenovich", 35, "Engineer", "+7(455)335-60-09", "s7.sem-sem@yandex.ru", 100000.00);
        employees[3] = new Employee("Vasiliev Vasily Vasilievich", 55, "Big boss", "+7(985)271-57-80", "vvv.vvv@ya.ua", 400000.00);
        employees[4] = new Employee("Denisov Denis Denisovich", 65, "Security", "+7(999)345-44-42", "deniska55@yahoo.com", 60000.00);

        for (Employee employee : employees)
            if (employee.getAge() > 40)
                employee.printInfo();
    }
}
