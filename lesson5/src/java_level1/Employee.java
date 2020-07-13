package java_level1;

public class Employee {

    private String name;
    private int age;
    private String position;
    private String phoneNumber;
    private String email;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int age, String position, String phoneNumber, String email, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Информация о сотруднике: " + '\n' +
                "ФИО: " + this.name + '\n' +
                "Должность: " + this.position + '\n' +
                "Возраст: " + this.age + '\n' +
                "Номер телефона: " + this.phoneNumber + '\n' +
                "Email: " + this.email + '\n' +
                "Salary: " + this.salary + '\n' +
                "____________________________" + '\n';
    }

    public void printInfo(){
        System.out.println(this.toString());
    }
}
