public class Animals {
    String name;
    private final int maxRun;
    private final int maxSwim;

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int i) {
        if (i > maxRun) {
            System.out.println(name + " столько не пробежит :(");
        } else System.out.println(name + " пробежал " + i + " м.");
    }

    public void swim(int i) {
        if (i > maxSwim) {
            System.out.println(name + " столько не проплывет :(");
        } else System.out.println(name + " проплыл " + i + " м");
    }
}
