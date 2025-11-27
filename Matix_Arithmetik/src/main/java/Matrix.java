/**
 * @author ufvgn
 */
public class Matrix {
    private final int row;
    private final int colum;
    private int[][] matrix;
    public Matrix(int i, int j) {
        this.row = i;
        this.colum = j;
        matrix = new int[i][j];
        setMatrixNull();
    }

    public Matrix(int[][] matrix) {
        this.row = matrix.length;
        this.colum = matrix[0].length;
        this.matrix = matrix;
    }

    public Matrix(Vector ... vectors) {
        if (vectors.length == 0) {
            throw new RuntimeException("Vectors must have at least one element");
        }
        this.row = vectors.length;
        this.colum = Vector.DIMENSION;
        matrix = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = vectors[i].getX(j);
            }
        }
    }
    private void setMatrixNull(){
        for(int i = 0; i < row; i++){
            for(int k = 0; k < colum; k++){
                matrix[i][k] = 0;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getColum() {
        return colum;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getValue(int i, int j) {
        return matrix[i][j];
    }
}
