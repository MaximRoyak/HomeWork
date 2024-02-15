import java.util.ArrayList;


class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;

        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) return;

        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}

public class Lesson_10 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());


        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());
        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox2.getWeight());


        System.out.println("Сравнение коробок с яблоками: " + appleBox.compare(appleBox2));
        System.out.println("Сравнение первой коробки с яблоками и первой коробки с апельсинами: " + appleBox.compare(orangeBox));
        System.out.println("Сравнение коробок с апельсинами: " + orangeBox.compare(orangeBox2));

        appleBox.transferFruits(appleBox2);
        orangeBox.transferFruits(orangeBox2);

        System.out.println("Вес первой коробки с яблоками после пересыпания: " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками после пересыпания: " + appleBox2.getWeight());
        System.out.println("Вес первой коробки с апельсинами после пересыпания: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами после пересыпания: " + orangeBox2.getWeight());
    }
}