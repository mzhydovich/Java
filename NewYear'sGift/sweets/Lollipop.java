package sweets;

import java.util.Objects;

public class Lollipop extends Sweets {

    private SweetsShape shape;
    private SweetsFlavour flavour;

    public Lollipop(String name, double weight, double sugarLevel, SweetsShape shape, SweetsFlavour flavour) {
        super(name, weight, sugarLevel);
        this.shape = shape;
        this.flavour = flavour;
    }


    public SweetsShape getShape() {
        return shape;
    }

    public void setShape(SweetsShape shape) {
        this.shape = shape;
    }

    public SweetsFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(SweetsFlavour flavour) {
        this.flavour = flavour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lollipop lollipop = (Lollipop) o;
        return shape == lollipop.shape && flavour == lollipop.flavour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape, flavour);
    }

    @Override
    public String toString() {
        return "Lollipop{" +
                "shape=" + shape +
                ", flavour=" + flavour +
                '}';
    }

}
