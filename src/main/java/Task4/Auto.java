package Task4;

public abstract class Auto {
    protected String name;
    protected int weight;
    protected Type engyne;

    public Auto(String name, int weight, Type engyne) {
        this.name = name;
        this.weight = weight;
        this.engyne = engyne;
    }

    public Type getEngyne() {
        return engyne;
    }

    public void setEngyne(Type engyne) {
        this.engyne = engyne;
    }
}
