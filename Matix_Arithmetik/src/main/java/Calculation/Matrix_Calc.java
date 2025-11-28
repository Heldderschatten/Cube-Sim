package Calculation;

/**
 * @author ufvgn
 */
public class Matrix_Calc {/*
    public static Matrix add(Matrix a, Matrix b) {
        if((a.getRow() != b.getRow()) || (a.getColum() != b.getColum())){
            throw new ArithmeticException("Objects.IntegerObjects.Matrix does not have the same number of columns and rows");
        }
        int[][] solution = new int[a.getRow()][a.getColum()];
        for(int i = 0; i < a.getRow(); i++){
            for(int j = 0; j < a.getColum(); j++){
                solution[i][j] = a.getValue(i, j) + b.getValue(i, j);
            }
        }
        return new Matrix(solution);
    }
    public static Matrix multiply(Matrix a, Matrix b) {
        System.out.println("------------------------");
        printMatrix(a);
        System.out.println("TIMES:");
        printMatrix(b);
        System.out.println("=======");
        if((a.getColum()!= b.getRow())) {
            throw new ArithmeticException("Objects.IntegerObjects.Matrix a must have the same number of Rows like matrix b Columns ");
        }
        Matrix result = new Matrix(a.getRow(), b.getColum());
        for (int i = 1; i <= result.getRow(); i++){         //Schleife über die Zeilen von result
            for(int k = 1; k <= result.getColum(); k++){    //Schleife über die Spalten von result
                for(int j = 1; j <= b.getRow(); j++){
                    int aValue = a.getValue(i,j);
                    int bValue = b.getValue(j,k);
                    int oldValue = result.getValue(i, k);
                    int multipl = aValue * bValue;
                    int value = oldValue + multipl;
                    result.setValue(i,k,value);
                }
            }
        }
        printMatrix(result);
        return result;
    }

    private static void printMatrix(Matrix m) {
        for(int i = 1; i <= m.getRow(); i++) {
            for(int j = 1; j <= m.getColum(); j++) {
                System.out.printf("|%d|", m.getValue(i, j));
            }
            System.out.println();
        }
    }*/
}
