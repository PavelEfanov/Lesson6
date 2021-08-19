public class Lesson6 {

    public static void main(String[] args) {

        LetsCount count = new LetsCount();

        Cat cat = count.createCat("Барсик", 200);
        Dog dog = count.createDog("Рэг", 500, 10);

        cat.run(10);
        cat.swim(1);

        dog.run(100);
        dog.swim(12);

        System.out.println("Всего животных:  " + count.getHowManyAnimals());
        System.out.println("Всего собак:  " + count.getHowManyDogs());
        System.out.println("Всего кошек:  " + count.getHowManyCats());
    }
}
