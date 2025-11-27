/**
 * @author ufvgn
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Matrix_Test {

    public void Matrix_Test() {
        Vector mat[][] = new Vector[3][3];

        mat[0][0] = new Vector(1,0,0);
        mat[0][1] = new Vector(0,1,0);
        mat[0][2] = new Vector(0,0,1);
        int[][] sol = {{1,0,0},{0,1,0},{0,0,1}};
        Matrix solMat = new Matrix(sol);
        Matrix isMat = new Matrix(mat[0]);
        for(int i = 0; i < isMat.getRow() ; i++){
            for (int j = 0; j< isMat.getColum();j++){
                assertEquals(solMat.getValue(i,j),isMat.getValue(i,j), "Die beiden Matrizen sind ungleich!");
            }
        }

    }

    @Test
    void matrix_Intigrtation(){

    }

}
