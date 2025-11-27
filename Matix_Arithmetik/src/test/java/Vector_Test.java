/**
 * @author ufvgn
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Vector_Test {
    @Test
    void addDatas() {
        Vector[][] testAddVec = new Vector[3][3];
        testAddVec[0][0] = new Vector(0,1,0);
        testAddVec[0][1] = new Vector(0,0,1);
        testAddVec[0][2] = new Vector(0,1,1);

        testAddVec[1][0] = new Vector(0,1,1);
        testAddVec[1][1] = new Vector(1,0,0);
        testAddVec[1][2] = new Vector(1,1,1);

        testAddVec[2][0] = new Vector(8,1,15);
        testAddVec[2][1] = new Vector(-156,-9,32);
        testAddVec[2][2] = new Vector(-148,-8,47);


        for (int i = 0; i < testAddVec.length; i++) {
            addtionsTest(testAddVec[i]);
        }

    }

    void addtionsTest(Vector[] v) {
        Vector V1Add2 = Vector.addVectors(v[0],v[1]);
        for(int i = 0; i<3;i++) {
            assertEquals(v[2].getX(i), V1Add2.getX(i), String.format("Der Erechnete vektir ist bei d = %d Falsch ", i));
        }
    }


}
