package Calculation;

import Objects.IntegerObjects.Matrix;

/**
 * @author ufvgn
 */
public class Matrix_Calc {
    /**
     * Add a Matrix a to a matrix b,
     *
     * Its importend that the Matrix a and b have the same Size!
     * @param a the first Matrix
     * @param b the second matrix
     * @return the sum of the Two Matirx
     */
    public static Matrix add(Matrix a, Matrix b) {
        if((a.getRow() != b.getRow()) || (a.getColumn() != b.getColumn())){
            throw new ArithmeticException("Objects.IntegerObjects.Matrix does not have the same number of columns and rows");
        }
        int[][] solution = new int[a.getRow()][a.getColumn()];
        for(int i = 0; i < a.getRow(); i++){
            for(int j = 0; j < a.getColumn(); j++){
                solution[i][j] = a.getValue(i, j) + b.getValue(i, j);
            }
        }
        return new Matrix(solution);
    }

    /**
     * Multipy two given Matrix.
     *
     * Importend! the Matrix mulipkation is non-commutativity
     * @param a Maritx a
     * @param b Matirx b
     * @return a Matrix with the size a.row and b.column
     */
    public static Matrix multiply(Matrix a, Matrix b) {
        if((a.getColumn()!= b.getRow())) {
            throw new ArithmeticException("Matrix a must have the same number of Rows like matrix b Columns ");
        }
        Matrix result = new Matrix(a.getRow(), b.getColumn());

        for (int i = 1; i <= result.getRow(); i++){         //Schleife über die Zeilen von result
            for(int k = 1; k <= result.getColumn(); k++){    //Schleife über die Spalten von result
                for(int j = 1; j <= b.getRow(); j++){
                    result.setValue(i,k,result.getValue(i,k) + a.getValue(i,j) * b.getValue(j,k));
                }
            }
        }
        return result;
    }
}
