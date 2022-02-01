package program;

import new_year.SweetsGift;
import sweets.*;

import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        SweetsGift new_years_gift = new SweetsGift();

        for (int i = 0; i < 5; ++i) {
            Candy candy = new Candy("Korovka", 18, 14, SweetsShape.Square, SweetsFlavour.Caramel, CandyFactory.Spartak);
            new_years_gift.addSweets(candy);
        }

        Cookie cookie = new Cookie("Slodych", 100, 15, SweetsShape.Square, CookieType.Shortbread);
        new_years_gift.addSweets(cookie);

        for (int i = 0; i < 2; ++i) {
            Lollipop lollipop = new Lollipop("ChupaChups", 30, 12, SweetsShape.Sphere, SweetsFlavour.Strawberry);
            new_years_gift.addSweets(lollipop);
        }

        System.out.println(new_years_gift);
        System.out.println(new_years_gift.getWeight());
        new_years_gift.sortSweets((o1, o2) -> (int) (o1.getSugarLevel() - o2.getSugarLevel()));
        System.out.println(new_years_gift);

        Predicate<Sweets> sugar_level = s -> (s.getSugarLevel() > 10 && s.getSugarLevel() < 15);
        System.out.println(new_years_gift.getSweetsByPredicate(sugar_level));
    }
}
