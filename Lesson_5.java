
    class Animal {
        private static int numAnimals = 0;
        public Animal(){
            numAnimals++;
        }
        public static int getNumAnimals(){
            return numAnimals;
        }
        public void run(int lenghtLet) {
        }
        public void swim(int lenghtDist){
        }
    }

class Dog extends Animal{
    private static int numDog = 0;
    public Dog(){
        super();
        numDog++;
    }
    public static int getNumDog(){
        return numDog;
    }
    @Override
    public void run(int lenghtLet){
        if (lenghtLet <= 500){
            System.out.println("Собака пробежала " + lenghtLet + "m.");
        }else {
            System.out.println("Собака не может пробежать столько");
        }
    }
    @Override
    public void swim(int lenghtDist){
        if (lenghtDist <= 10){
            System.out.println("Собака проплыла " + lenghtDist + "m.");
        }else {
            System.out.println("Собака не может столько проплыть");
        }
    }
}

class Cat extends Animal{
  private static int numCat = 0;
  private boolean satiety;
  public Cat(){
      super();
      numCat++;
      satiety = false;
  }
  public static int getNumCat(){
      return numCat;
  }
  public boolean adSatiety(){
      return satiety;
  }
  @Override
  public void run(int lenghtLet){
      if (lenghtLet <= 200){
          System.out.println("Кот пробежал " + lenghtLet + "m.");
      }else {
          System.out.println("Кот не может пробежать столько");
      }
  }
    @Override
    public void swim(int lenghtDist){
        System.out.println("Коты в данном случае не плавают!))");
    }
    public void eat(Bowl bowl, int numFood){
      if(bowl.eat(numFood)){
          satiety = false;
          System.out.println(" ");
      }else {
          System.out.println("В миске еды недостаточно");
      }
    }
}
class Bowl{
        private int numFood;
        public Bowl(int numFood){
            this.numFood = numFood;
        }
        public boolean eat(int numFood) {
            if (this.numFood >= numFood){
                this.numFood -= numFood;
                return true;
            }else{
                return false;
            }
        }
 }
 interface Figures {
    double perimetr();
    double area();
    void filling(String color);
    void colorBoard(String color);
    default void calcPerim(){
        System.out.println("Perimetr = " + perimetr());
    }
    }
class Circle implements Figures{
    private double radius;
    private String filling;
    private String colorBoard;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void filling(String color) {
        this.filling = color;
    }

    @Override
    public void colorBoard(String color) {
        this.colorBoard = color;
    }

    public void displayInfo() {
        System.out.println("Круг - Периметр: " + perimetr() +
                ", Площадь: " + area() +
                ", Цвет заливки: " + filling +
                ", Цвет границ: " + colorBoard);
    }
}
class Square implements Figures{
    private double length;
    private double width;
    private String filling;
    private String colorBoard;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimetr() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void filling(String color) {
        this.filling = color;
    }

    @Override
    public void colorBoard(String color) {
        this.colorBoard = color;
    }

    public void displayInfo() {
        System.out.println("Четырехугольник - Периметр: " + perimetr() +
                ", Площадь: " + area() +
                ", Цвет заливки: " + filling +
                ", Цвет границ: " + colorBoard);
    }
}
class Triangle implements Figures{
    private double side1;
    private double side2;
    private double side3;
    private String filling;
    private String colorBoard;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimetr() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void filling(String color) {
        this.filling = color;
    }

    @Override
    public void colorBoard(String color) {
        this.colorBoard = color;
    }

    public void displayInfo() {
        System.out.println("Треугольник - Периметр: " + perimetr() +
                ", Площадь: " + area() +
                ", Цвет заливки: " + filling +
                ", Цвет границ: " + colorBoard);
    }
}


public class Lesson_5 {
    public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();


    dog.run(150);
    dog.swim(7);

    cat.run(210);
    cat.swim(2);

    System.out.println("Количество животных: " + Animal.getNumAnimals());
    System.out.println("Количество собак: " + Dog.getNumDog());
    System.out.println("Количество котов: " + Cat.getNumCat());

    Bowl bowl = new Bowl(15);

    Cat[] cats = new Cat[]{new Cat(), new Cat(), new Cat(), new Cat()};

    for (Cat k: cats){
    k.eat(bowl,5);
    }
    System.out.println("Сытость: ");
    for (int i = 0; i < cats.length; i++) {
        System.out.println("Кот " + (i + 1) + ": " + cats[i].adSatiety());
    }

        Circle circle = new Circle(5);
        circle.filling("Зеленый");
        circle.colorBoard("Черный");
        circle.displayInfo();
        circle.calcPerim();

        Square square = new Square(4, 6);
        square.filling("Синий");
        square.colorBoard("Красный");
        square.displayInfo();
        square.calcPerim();


        Triangle triangle = new Triangle(4,3,4);
        triangle.filling("Желтный");
        triangle.colorBoard("Белый");
        triangle.displayInfo();
        triangle.calcPerim();
    }
}
