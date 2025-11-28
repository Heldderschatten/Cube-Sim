package Objects.IntegerObjects;

/**
 * A Vector is an Arrow that shows to a Point (the Bases)
 *
 *
 * @author ufvgn
 */
public class Vector extends Cordinates {

    /**
     * Create a Vector bei a given List of ints, the List can not be null!
     * Every Item of the List is a Singel point on the Vector
     * @param x the given List of parmeters
     */
    public Vector(int ... x) {
        super(x);
    }

    /**
     * Create a Vector from a Point, the Vector = Point^T
     * The Dimension of Point and Vector are Equal
     * @param p the Point where the Vectors shows to.
     */
    public Vector(Point p){
        super(p.getValue());
    }

    /**
     * Return the Point that the base Vecotrs looks!
     * @return the end Point of 0 Vector
     */
    public Point getPoint(){
        return new Point(getValue());
    }


}
