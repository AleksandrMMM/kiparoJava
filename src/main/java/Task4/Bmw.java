package Task4;

public class Bmw extends Auto{
    boolean drive;

    public Bmw(String name, int weight, Type engyne, boolean drive) {
        super(name, weight, engyne);
        this.drive = drive;
    }
}
