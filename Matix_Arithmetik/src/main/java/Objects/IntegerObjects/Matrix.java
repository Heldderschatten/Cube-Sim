package Objects.IntegerObjects;

import java.util.Arrays;

/**
 *
 * Wichtig die Objects.IntegerObjects.Matrix wird 1 basiert gezählt!
 * @author ufvgn
 */
public class Matrix {
    private final int row;
    private final int column;
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        if(matrix == null)
            throw new IllegalArgumentException("Matrix is null");
        if(matrix.length == 0)
            throw new IllegalArgumentException("Matrix is empty");

        this.row = matrix.length;
        this.column = matrix[0].length;

        this.matrix = Arrays.stream(matrix)
                .map(arr -> Arrays.copyOf(arr, arr.length))
                .toArray(int[][]::new);
    }

    public Matrix(Vector... vectors) {
        if (vectors.length == 0) {
            throw new IllegalArgumentException("Vectors can not be empty");
        }
        if(!(Arrays.stream(vectors).map(Vector::getDimension).distinct().count() <= 1))
            throw new IllegalArgumentException("Vectors must have the same dimension");


        this.row = vectors.length;
        this.column = vectors.length;

        for(int n = 1; n <= column; n++) {
            Vector v = vectors[n-1];
            for(int m  = 1; m <= row; m++) {
                setValue(m,n,v.getValue(m));
            }
        }

    }
    public void setValue(int m, int n, int value) {
        if (!valSize(m,n))
            throw new IllegalArgumentException("You can not write a number outside of the Matrix");
        matrix[m-1][n-1] = value;
    }

    /**
     * Return the Rows of the Matrix
     * @return
     */
    public int getRow() {
        return row;
    }

    /**
     * Return the Columns of the Matrix
     * @return
     */
    public int getColumn() {
        return column;
    }

    /**
     * Return all Values of the Matrix in a 2 Dim. Array
     * @return
     */
    public int[][] getValue() {
        return matrix;
    }

    /**
     *
     * @param m 1 based indes of Rows
     * @param n 1 based index of columens
     * @return the Value of i,j
     **/
    public int getValue(int m, int n) {
        if (!valSize(m, n))
            throw new IllegalArgumentException("You can not enter a number outside of the Matrix");
        return matrix[m -1][n -1];
    }

    private boolean valSize(int m, int n) {
        return !(m < 0 || m > getRow() || n < 0 || n > getColumn());
    }
}
