package Objects.IntegerObjects;

/**
 * @author ufvgn
 */
public enum Axis {
    X_AXIS(0),
    Y_AXIS(1),
    Z_AXIS(2);

    private final int index;
    Axis(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}
