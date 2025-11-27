/**
 * @author ufvgn
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Matrix_Test {

    Matrix A[] = {new Matrix(new int[][] {{3,2,1},{1,0,2}})};
    Matrix B[] = {new Matrix(new int[][] {{1,2},{0,1},{4,0}})};
    Matrix C[] = {new Matrix(new int[][] {{7,8},{9,2}})};

    public void Matrix_Test() {
        Vector mat[][] = new Vector[3][3];

        mat[0][0] = new Vector(1,0,0);
        mat[0][1] = new Vector(0,1,0);
        mat[0][2] = new Vector(0,0,1);
        int[][] sol = {{1,0,0},{0,1,0},{0,0,1}};
        Matrix solMat = new Matrix(sol);
        Matrix isMat = new Matrix(mat[0]);
        testMatrixEqual(solMat,isMat, "Addtion Test: ");

    }

    @Test
    void matrix_Intigrtation(){
        Matrix_Test();
    }

    @Test
    void matrix_mulipling(){
        for(int i = 0; i < A.length; i++){
            testMatrixEqual(C[i],Matrix_Calc.multiply(A[i],B[i]), "Matrix Multiplkation");
        }
    }

    private void testMatrixEqual(Matrix A, Matrix B, String message){
        for(int i = 1; i <= A.getRow() ; i++){
            for(int j = 1; j <= A.getColum(); j++){
                assertEquals(A.getValue(i,j),B.getValue(i,j), message + String.format(" Error in line %d, %d", i,j));
            }
        }
    }



}
