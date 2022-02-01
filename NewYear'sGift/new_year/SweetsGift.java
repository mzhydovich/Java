package new_year;

import sweets.Sweets;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SweetsGift implements Iterable<Sweets> {

    private List<Sweets> sweets;

    public SweetsGift() {
        sweets = new ArrayList<>();
    }

    public SweetsGift(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public void addSweets(Sweets s) {
        sweets.add(s);
    }

    public void sortSweets(Comparator<Sweets> comparator) {
        sweets.sort(comparator);
    }

    public List<Sweets> getSweetsByPredicate(Predicate<Sweets> predicate) {
        return sweets.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public double getWeight() {
        double sum = 0;
        for(Sweets s : sweets) {
            sum += s.getWeight();
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SweetsGift that = (SweetsGift) o;
        return Objects.equals(sweets, that.sweets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweets);
    }

    @Override
    public String toString() {
        return "SweetsGift{" +
                "sweets=" + sweets +
                '}';
    }

    @Override
    public Iterator<Sweets> iterator() {
        return sweets.iterator();
    }
}
