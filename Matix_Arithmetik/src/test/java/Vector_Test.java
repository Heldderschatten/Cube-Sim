/**
 * @author ufvgn
 */

import Objects.IntegerObjects.Vector;
import org.junit.jupiter.api.Test;

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

    }




}
