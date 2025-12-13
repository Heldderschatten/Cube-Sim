package Objects.IntegerObjects;

import java.util.Arrays;

/**
 * Represents a Point in a multi-dimensional space. This class extends the {@code Cordinates} class
 * and provides equality and hashing capabilities. A point is defined by its coordinates, which are
 * inherited from the parent {@code Cordinates} class.
 */
public class Point extends Cordinates {

    public Point(int ... x) {
        super(x);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point point = (Point) obj;
        return Arrays.equals(this.getValue(), point.getValue());
    }
}
