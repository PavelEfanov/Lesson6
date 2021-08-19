public class LetsCount {

    private int howManyAnimals;
    private int howManyDogs;
    private int howManyCats;

    public LetsCount() {
        howManyAnimals = 0;
        howManyCats = 0;
        howManyDogs = 0;
    }

    public Cat createCat (String name, int maxRun) {
        Cat newCat = new Cat(name, maxRun);

        howManyAnimals++;
        howManyCats++;

        return newCat;
    }

    public Dog createDog (String name, int maxRun, int maxSwim) {
        Dog newDog = new Dog(name, maxRun, maxSwim);

        howManyAnimals++;
        howManyDogs++;

        return newDog;
    }

    public int getHowManyAnimals() {
        return howManyAnimals;
    }

    public int getHowManyDogs() {
        return howManyDogs;
    }

    public int getHowManyCats() {
        return howManyCats;
    }

    //DONE
}
