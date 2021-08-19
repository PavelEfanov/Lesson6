public class Cat extends Animals {


    public Cat(String name, int maxRun) {
        super(name, maxRun, Integer.MIN_VALUE);
    }

    @Override
    public void swim(int i) {
        System.out.println("КОШЕЧКИ НЕ УМЕЮТ ПЛАВАТЬ!!!!!!!!!!");
    }

}
