/**
 *
 * Wichtig die Matrix wird 1 basiert gezählt!
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
    public void setValue(int i, int j, int value) {
        i = i-1;
        j = j-1;
        if(i < 0 || i > matrix.length||j < 0 || j > matrix[0].length){
            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d, %d, size: (%d,%d)", i +1, j +1,row, colum));
        }
        matrix[i][j] = value;
    }
    public int getRow() {
        return row;
    }

    public int getColum() {
        return colum;
    }

    public int[][] getMatrixIntegerArray() {
        return matrix;
    }

    /**
     *
     * @param i 1 based indes of Rows
     * @param j 1 based index of columens
     * @return the Value of i,j
     */
    public int getValue(int i, int j) {
        valideSize(i -1, j-1);
        return matrix[i -1][j -1];
    }
    private boolean valideSize(int i, int j) {
        if(i < 0 || i > getRow()||j < 0 || j > getColum()){
            System.err.println("Invalid index or index out of bounds");
            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d, %d, size: (%d,%d)", i +1, j +1,getRow(), getColum()));
        }
        return true;
    }
}
