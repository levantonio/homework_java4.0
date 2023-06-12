public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами 1: " + orangeBox.getWeight());

        System.out.println("вес коробки с яблоками 1 = весу коробки с яблоками 2: " + appleBox1.compare(appleBox2));
        System.out.println("вес коробки с яблоками 1 = весу коробки с апельсинами : " + appleBox1.compare(orangeBox));

        Box<Apple> appleBox3 = new Box<>();
        appleBox1.transferFruitsTo(appleBox3);


        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 3: " + appleBox3.getWeight());

    }
}
