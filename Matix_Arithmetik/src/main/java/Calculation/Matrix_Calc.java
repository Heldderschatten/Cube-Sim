package Calculation;

import Objects.IntegerObjects.Matrix;

/**
 * @author ufvgn
 */
public class Matrix_Calc {

    private final static byte MULIPLIKATION = 0;
    private final static byte ADDITION = 1;
    private static final String AddtionError = "Objects.IntegerObjects.Matrix does not have the same number of columns and rows";
    private static final String MuliplikationError = "Matrix a must have the same number of Rows like matrix b Columns ";

    /**
     * Add a Matrix a to a matrix b,
     * <p>
     * Its importend that the Matrix a and b have the same Size!
     *
     * @param a the first Matrix
     * @param b the second matrix
     * @return the sum of the Two Matirx
     */
    public static Matrix add(Matrix a, Matrix b) {
        checkAtrhmetial(ADDITION, a, b);
        int[][] solution = new int[a.getRow()][a.getColumn()];
        for (int i = 0; i < a.getRow(); i++) {
            for (int j = 0; j < a.getColumn(); j++) {
                solution[i][j] = a.getValue(i, j) + b.getValue(i, j);
            }
        }
        return new Matrix(solution);
    }


    /**
     * Multipy two given Matrix.
     * <p>
     * Importend! the Matrix mulipkation is non-commutativity
     *
     * @param a Maritx a
     * @param b Matirx b
     * @return a Matrix with the size a.row and b.column
     */
    public static Matrix multiply(Matrix a, Matrix b) {
        checkAtrhmetial(MULIPLIKATION, a, b);
        Matrix result = new Matrix(a.getRow(), b.getColumn());

        for (int i = 1; i <= result.getRow(); i++) {         //Schleife über die Zeilen von result
            for (int k = 1; k <= result.getColumn(); k++) {    //Schleife über die Spalten von result
                for (int j = 1; j <= b.getRow(); j++) {
                    result.setValue(i, k, result.getValue(i, k) + a.getValue(i, j) * b.getValue(j, k));
                }
            }
        }
        return result;
    }

    private static void checkAtrhmetial(byte type, Matrix a, Matrix b) {
        if (!checkMatrixSize(type, a, b))
            throw new ArithmeticException(switch (type) {
                case MULIPLIKATION -> MuliplikationError;
                case ADDITION -> AddtionError;
                default -> throw new IllegalArgumentException("undifend Type of Operation");
            });
    }

    //sub methods
    private static boolean checkMatrixSize(byte type, Matrix a, Matrix b) {
        return !switch (type) {
            case MULIPLIKATION -> (a.getRow() == b.getColumn());
            case ADDITION -> (a.getRow() == b.getRow()) && (a.getColumn() == b.getColumn());
            default -> throw new IllegalArgumentException("undifend Type of Operation");
        };
    }
}
