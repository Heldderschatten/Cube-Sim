/**
 * @author ufvgn
 */
public class Matrix_Calc {
    public static Matrix add(Matrix a, Matrix b) {
        if((a.getRow() != b.getRow()) || (a.getColum() != b.getColum())){
            throw new ArithmeticException("Matrix does not have the same number of columns and rows");
        }
        int[][] solution = new int[a.getRow()][a.getColum()];
        for(int i = 0; i < a.getRow(); i++){
            for(int j = 0; j < a.getColum(); j++){
                solution[i][j] = a.getValue(i, j) + b.getValue(i, j);
            }
        }
        return new Matrix(solution);
    }
}
