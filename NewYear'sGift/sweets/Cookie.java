package sweets;

import java.util.Objects;

public class Cookie extends Sweets {

    private SweetsShape shape;
    private CookieType cookieType;

    public Cookie(String name, double weight, double sugarLevel, SweetsShape shape, CookieType cookieType) {
        super(name, weight, sugarLevel);
        this.shape = shape;
        this.cookieType = cookieType;
    }

    public SweetsShape getShape() {
        return shape;
    }

    public void setShape(SweetsShape shape) {
        this.shape = shape;
    }

    public CookieType getCookieType() {
        return cookieType;
    }

    public void setCookieType(CookieType cookieType) {
        this.cookieType = cookieType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cookie cookie = (Cookie) o;
        return shape == cookie.shape && cookieType == cookie.cookieType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape, cookieType);
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "shape=" + shape +
                ", cookieType=" + cookieType +
                '}';
    }

}
