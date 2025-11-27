/**
 *
 *  A vector has exactly 3 dimensions.
 * @author ufvgn
 */
public class Vector {
    public static final int DIMENSION = 3;
    private final int [] x = new int[DIMENSION];

    public Vector(int x1, int x2, int x3) {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
    }
    public Vector(Vector v) {
        x[0] = v.x[0];
        x[1] = v.x[1];
        x[2] = v.x[2];
    }

    public Vector(Point p){
        x[0] = p.getX();
        x[1] = p.getY();
        x[2] = p.getZ();
    }
    //Getter & Setter


    public int getX(int i) {
        if (i < 0 || i >= DIMENSION)
            throw new ArrayIndexOutOfBoundsException(String.format("dimension: %d, is to high or low Max: %d", i+1, DIMENSION));
        return x[i];
    }

    public int[] getX() {
        return x;
    }

    public static Vector addVectors(Vector v1, Vector v2) {
        int x1 = v1.x[0] + v2.x[0];
        int x2 = v1.x[1] + v2.x[1];
        int x3 = v1.x[2] + v2.x[2];
        return new Vector(x1, x2, x3);
    }

}
