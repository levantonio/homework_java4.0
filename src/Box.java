import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        if (getWeight() == anotherBox.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        if (fruits.isEmpty()) {
            return;
        }

        if (!anotherBox.fruits.isEmpty() && fruits.get(0).getClass() != anotherBox.fruits.get(0).getClass()) {
            return;
        }

        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }

}
