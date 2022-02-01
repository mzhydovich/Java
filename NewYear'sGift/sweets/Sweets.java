package sweets;

import java.util.Objects;

public abstract class Sweets {

    private String name;
    private double weight;
    private double sugarLevel;

    public Sweets(String name, double weight, double sugarLevel) {
        this.name = name;
        this.weight = weight;
        this.sugarLevel = sugarLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(double sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return Double.compare(sweets.weight, weight) == 0 && Double.compare(sweets.sugarLevel, sugarLevel) == 0 && Objects.equals(name, sweets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, sugarLevel);
    }
    
    
}
