

public class Lesson_4 {

    static Person[] persArray = new Person[5];

    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov VV","Engineer","ffff@fff.ru","+7956559",3000.00,30);
        employee.data();

        persArray[0] = new Person("Ivanov Ivan","Engineer","ivivan@mailbox.com","+892312312",30000.0,30);
        persArray[1] = new Person("Roman","PR","222@mail.ru","+7888979",35000,35);
        persArray[2] = new Person("Igor","Techlead","over@mail.ru","+79895656",50000,44);
        persArray[3] = new Person("Ivan","Market","mk22@mail.ru","+8964654",50000,37);
        persArray[4] = new Person("Alex","QA","qa@mail.ru","+79864546",45000,37);

        Park park = new Park("Gagarina Park");
        Park.Attractions attractions1 = park.new Attractions("Ships", "10.00 - 19.00",65.0);
        Park.Attractions attractions2 = park.new Attractions("Orbit","10.00 - 19.00",45.5);
    }
}
class Employee {
    private String fullname;
    private String position;
    private String email;
    private String telnumber;
    private double sal;
    private int age;

    public Employee(){
        this.fullname = "---";
        this.position = "---";
        this.email = "---";
        this.telnumber = "---";
    }
    public Employee(String fullname, String position, String email, String telnumber, double sal, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telnumber = telnumber;
        this.sal = sal;
        this.age = age;
    }
    void data() {
        System.out.println("ФИО: " + fullname + ", Должность: " + position + ", Email: " + email + ", Номер: " + telnumber + ", Зарплата: " + sal + ", Возраст: " + age);
    }
}

class Person{
    String fullname;
    String position;
    String email;
    String telnumber;
    double sal;
    int age;
    public Person(String fullname, String position, String email, String telnumber, double sal, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telnumber = telnumber;
        this.sal = sal;
        this.age = age;
    }
}

class Park{
    private String parkName;
    public Park(String parkName){
        this.parkName = parkName;
    }
    public class Attractions{
        private String name;
        private String time;
        private double price;

        public Attractions(String name, String time, double price){
            this.name = name;
            this.time = time;
            this.price = price;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getTime(){
            return time;
        }
        public void setTime(String time){
            this.time = time;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(){
            this.price = price;
        }
    }
}