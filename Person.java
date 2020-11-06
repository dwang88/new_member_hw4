public class Person {
    public static void main(String[] args) {
        Person[] array = {new Person("John", 24), new Employee("David", 33, 80000), new Executive("William", 39, 200000, 900)};

        for (Person person : array) {
            System.out.println(person.showValues());
        }
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ageChange(int age) {
        this.age = age;
    }

    public void addAge() {
        this.age += 1;
    }

    public String showValues() {
        return "Name: " + name + " Age: " + age;

    }
}
class Employee extends Person {
    private double salary;
    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public void changeSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String showValues(){
        return super.showValues() + " Salary:" + salary;
    }
}
class Executive extends Employee {
    private int stocks;
    public Executive(String name, int age, double salary, int stocks){
        super(name, age, salary);
        this.stocks = stocks;
    }
    public void changeStocks(int stocks){
        this.stocks = stocks;
    }
    public String showValues(){
        return super.showValues() + " Stocks:" + stocks;
    }
}
