package Calculation;

import Objects.IntegerObjects.Axis;
import Objects.IntegerObjects.Matrix;
import Objects.IntegerObjects.Point;
import Objects.IntegerObjects.Vector;

public class RoomRotion {
    public static final int DIMENSION = 3;
    private static final Matrix ROTATE_X_90Degree = new Matrix(new int[][]{{1,0,0},{0,0,-1},{0,1,0}});
    private static final Matrix ROTATE_Y_90Degree = new Matrix(new int[][]{{0,0,1},{0,1,0},{-1,0,0}});
    private static final Matrix ROTATE_Z_90Degree = new Matrix(new int[][]{{0,-1,0},{1,0,0},{0,0,1}});

    public static Point RotatePoint_X_90(Point p) {
        Vector v = new Vector(p);
        Matrix m = new Matrix(v);
        Matrix result = Matrix_Calc.multiply(ROTATE_X_90Degree, m);
        return new Point(result.getValue(1, 1), result.getValue(2, 1), result.getValue(3, 1));
    }
    public static Point RotatePoint_Y_90(Point p) {
        Matrix m = new Matrix(new Vector(p));
        Matrix result = Matrix_Calc.multiply(ROTATE_Y_90Degree, m);
        return new Point(result.getValue(1, 1), result.getValue(1, 2), result.getValue(1, 3));
    }

    public static Point ROTATE_Z_90Degree(Point p) {
        Matrix m = new Matrix(new Vector(p));
        Matrix result = Matrix_Calc.multiply(ROTATE_Z_90Degree, m);
        return new Point(result.getValue(1, 1), result.getValue(1, 2), result.getValue(1, 3));
    }

    public static Vector rotateVector(Axis axis, Vector v){
        Matrix rotation;
        switch (axis) {
            case X_AXIS -> rotation = ROTATE_X_90Degree;
            case Y_AXIS -> rotation = ROTATE_Y_90Degree;
            case Z_AXIS -> rotation = ROTATE_Z_90Degree;
            default -> throw new IllegalArgumentException("Invalid Dimension");
        }
        Matrix result = Matrix_Calc.multiply(rotation, new Matrix(v));
        return new Vector(result.getValue(1, 1), result.getValue(2, 1), result.getValue(3, 1));
    }
    public static Point rotatePoint(Axis axis, Point p){
        return rotateVector(axis, new Vector(p)).getPoint();
    }
}
