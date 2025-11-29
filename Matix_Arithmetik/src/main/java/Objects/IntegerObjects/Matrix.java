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

    /**
     * Cretae a null Matrix with the given Size.
     * @param m the Numbers of rows
     * @param n the NUmber of Columns
     */
    public Matrix(int m, int n) {
        this.row = m;
        this.column = n;
        matrix = new int[row][column];
        for(int i = 1; i <= this.row; i++) {
            for(int j =1; j <= this.column;j++){
                setValue(i,j,0);
            }
        }
    }


    /**
     * Create a Matirx by a given list of integers
     * @param matrix
     */
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

    public Matrix(Vector... vector) {
        validateVectors(vector);
        this.row = vector[0].getDimension();
        this.column = vector.length;
        this.matrix = new int[row][column];
        setVectors(vector);
    }

    private boolean validateVectors(Vector[] vector) {
        if (vector.length == 0)
            throw new IllegalArgumentException("Vectors can not be empty");
        if(!(Arrays.stream(vector).map(Vector::getDimension).distinct().count() <= 1))
            throw new IllegalArgumentException("Vectors must have the same dimension");
        return true;
    }

    private void setVectors(Vector[] vector) {
        for(int n = 1; n <= column; n++) {
            Vector v = vector[n-1];
            for(int m  = 1; m <= row; m++) {
                setValue(m,n,v.getValue(m));
            }
        }
    }
    public void setValue(int m, int n, int value) {
        if (!valSize(m,n))
            throw new IllegalArgumentException("You can not write a number outside of the Matrix:(" + m + " ; " + n + ")" );
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
    //Reutrn if the 1 based Coordiante is in the Matrix
    private boolean valSize(int m, int n) {
        boolean a = m > 0 && m <= getRow();
        boolean b =  n > 0 && n <= getColumn();
        return a && b;
    }
}
