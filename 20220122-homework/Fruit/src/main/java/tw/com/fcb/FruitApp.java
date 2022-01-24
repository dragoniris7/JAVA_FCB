package tw.com.fcb;

public class FruitApp {
    public static void main(String[] args) {
        FruitService mainFruit = new FruitServiceImp();
        System.out.println(mainFruit.getByCode("A02"));
        System.out.println(mainFruit.getByName("apple"));
    }

}
