package sweets;

import java.util.Objects;

public class Candy extends Sweets {

    private SweetsShape shape;
    private SweetsFlavour flavour;
    private CandyFactory factory;

    public Candy(String name, double weight, double sugarLevel, SweetsShape shape, SweetsFlavour flavour, CandyFactory factory) {
        super(name, weight, sugarLevel);
        this.shape = shape;
        this.flavour = flavour;
        this.factory = factory;
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

    public CandyFactory getFactory() {
        return factory;
    }

    public void setFactory(CandyFactory factory) {
        this.factory = factory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return shape == candy.shape && flavour == candy.flavour && factory == candy.factory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape, flavour, factory);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "shape=" + shape +
                ", flavour=" + flavour +
                ", factory=" + factory +
                '}';
    }
}
