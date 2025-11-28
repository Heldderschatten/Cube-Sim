/**
 * @author ufvgn
 */
import Objects.IntegerObjects.Matrix;
import Objects.IntegerObjects.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestMatrix {

    int[][] sol = {{1,0,0},{0,1,0},{0,0,1}};


    //todo Erstellen von test für setzen und Lesen sowie erstellen der Matrzen!
    Matrix A[] = {new Matrix(new int[][] {{3,2,1},{1,0,2}})};
    Matrix B[] = {new Matrix(new int[][] {{1,2},{0,1},{4,0}})};
    Matrix C[] = {new Matrix(new int[][] {{7,8},{9,2}})};
@Test
    public void CreateByVector() {
        Vector mat[][] = new Vector[3][3];

        mat[0][0] = new Vector(1,0,0);
        mat[0][1] = new Vector(0,1,0);
        mat[0][2] = new Vector(0,0,1);
        int[][] sol = {{1,0,0},{0,1,0},{0,0,1}};

        Matrix isMat = new Matrix(mat[0]);

        for (int i = 0; i < sol.length; i++) {
            assertArrayEquals(sol[i], isMat.getValue()[i]);
        }
    }
    @Test
    public void maxMinTest() {
    Matrix m = new Matrix(sol);
    assertThrows(IllegalArgumentException.class, () -> m.getValue(1, Integer.MAX_VALUE));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(1, Integer.MIN_VALUE));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(Integer.MAX_VALUE,1 ));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(Integer.MIN_VALUE,1 ));
    }



}
