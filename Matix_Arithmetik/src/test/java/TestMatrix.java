/**
 * @author ufvgn
 */

import Objects.IntegerObjects.Matrix;
import Objects.IntegerObjects.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMatrix {

    int[][] sol = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    int[][] sol2 = {{3, 2, 1}, {1, 0, 2}};

    //todo Erstellen von test  sowie erstellen der Matrzen!
    Matrix A[] = {new Matrix(new int[][]{{3, 2, 1}, {1, 0, 2}})};
    Matrix B[] = {new Matrix(new int[][]{{1, 2}, {0, 1}, {4, 0}})};
    Matrix C[] = {new Matrix(new int[][]{{7, 8}, {9, 2}})};

    @Test
    public void CreateByVector() {
        Vector mat[][] = new Vector[3][3];

        mat[0][0] = new Vector(1, 0, 0);
        mat[0][1] = new Vector(0, 1, 0);
        mat[0][2] = new Vector(0, 0, 1);
        int[][] sol = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        Matrix m = new Matrix(mat[0]);

        for (int i = 0; i < sol.length; i++) {
            assertArrayEquals(sol[i], m.getValue()[i]);
        }
    }

    @Test
    public void maxMinTest() {
        Matrix m = new Matrix(sol);
        assertThrows(IllegalArgumentException.class, () -> m.getValue(1, Integer.MAX_VALUE));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(1, Integer.MIN_VALUE));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(Integer.MAX_VALUE, 1));
        assertThrows(IllegalArgumentException.class, () -> m.getValue(Integer.MIN_VALUE, 1));
        
    }
    
    @Test
    public void setTest(){
        Matrix m = new Matrix(new int[][] {{0, 0, 0},{0,0,0},{0,0,0}});
        m.setValue(1, 1, 1);
        m.setValue(2,2,1);
        m.setValue(3,3,1);

        for (int i = 0; i < sol.length; i++) {
            assertArrayEquals(sol[i], m.getValue()[i]);
        }
    }

    @Test
    public void getTest() {
        Matrix m = new Matrix(sol2);
        for (int i = 0; i < sol2.length; i++) {
            for(int j = 0; j < sol2[i].length; j++) {
                int matrixValue = m.getValue(i + 1, j + 1);
                assertEquals(sol2[i][j], matrixValue);
            }
        }

        m = new Matrix(sol);
        for (int i = 0; i < sol.length; i++) {
            for(int j = 0; j < sol[i].length; j++) {
                int matrixValue = m.getValue(i + 1, j + 1);
                assertEquals(sol[i][j], matrixValue);
            }
        }
    }


}
