package Objects.IntegerObjects;

public abstract class Cordinates {
    private final int dimension;
    private int[] value;

    /**
     * Create a new Coordiante
     *
     * @param dimension the Dimension of the Coordiante (N^d)
     */
    public Cordinates(int dimension) {
        this.dimension = dimension;
        this.value = new int[dimension];
    }

    /**
     * Create a new Coordiante
     *
     * @param value The Values of the Coordinate
     */
    public Cordinates(int[] value) {
        this.dimension = value.length;
        this.value = value;
    }

    private boolean validateDimension(int d) {
        return d > 0 && d < dimension;
    }
    // getter  & Setter
    //#############Setter####################

    /**
     * Set all Values to a given list!
     * must be the same size like the Dim.!
     *
     * @param values
     */
    public void setValue(int[] values) {
        if (values.length != dimension)
            throw new IllegalArgumentException("Values array length does not match the dimension");
        System.arraycopy(values, 0, value, 0, dimension);
    }

    /**
     * Set on a spefic dimesnion the Value
     * Start counting by 1
     *
     * @param d the Dimension
     * @param v the Value
     */
    public void setValue(int d, int v) {
        if (!validateDimension(d))
            throw new IllegalArgumentException("You used a Dimesnion outside of the 0 < d <= dimension");
        value[d - 1] = v;
    }

    //#############Getter####################

    /**
     * Return all Values from 1 - Dimension in a 0 based Array
     *
     * @return Return all Values from 1 - Dimension in a 0 based Array
     */
    public int[] getValue() {
        return value;
    }

    /**
     * Return the value on the Vector at d.
     * (Warning start counting at 1)
     * if y give a wrong Dimension y  get {@code null}
     *
     * @param d the dimension y need
     * @return the value at dimension d
     */
    public int getValue(int d) {
        if (!validateDimension(d)) {
            throw new IllegalArgumentException("Values array length does not match the dimension");
        }
        return value[d - 1];
    }

    /**
     * Return the Dimesion of the Coordinate
     *
     * @return
     */
    public int getDimension() {
        return dimension;
    }
}
