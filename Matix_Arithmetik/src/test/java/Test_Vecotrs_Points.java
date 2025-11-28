import Objects.IntegerObjects.Vector;
import Objects.IntegerObjects.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test_Vecotrs_Points {
    private int[] Standart_vecto_Value = {0,1,0};
    @Test
    public void test_Vector(){
        //Create by Values
        Vector v =  new Vector(0,1,0);
        vectorEqualStandart(v);
        //Create by int[]
        v =  new Vector(Standart_vecto_Value);
        vectorEqualStandart(v);
    }

    @Test
    public void test_Point(){
        Point p = new Point(0,1,0);
        pointEqualStandart(p);

        p =  new Point(Standart_vecto_Value);

        pointEqualStandart(p);
    }

    @Test
    public void VectorPointVector(){
        Vector v =  new Vector(Standart_vecto_Value);
        vectorEqualStandart(v);
        Point p = v.getPoint();
        v = new Vector(p);
        vectorEqualStandart(v);
    }

    @Test
    public void wrongDimsion() {
        Vector v =  new Vector(Standart_vecto_Value);
        Point p = new Point(Standart_vecto_Value);
        testDimension(v,p,50);
        testDimension(v,p,4);
        testDimension(v,p,0);
        testDimension(v,p,-1);
        testDimension(v,p,Integer.MIN_VALUE);
        testDimension(v,p,Integer.MAX_VALUE);
    }

    @Test
    public void testSetValue(){
        int[] wrongDatas = {1,1,1};
        Vector v =  new Vector(wrongDatas);
        Point p = new Point(wrongDatas);

        v.setValue(1,0);
        v.setValue(3,0);
        vectorEqualStandart(v);
        p.setValue(1,0);
        p.setValue(3,0);
        pointEqualStandart(p);


    }
    private void testDimension(Vector v, Point p, int d) {
        assertThrows(IllegalArgumentException.class, () -> v.getValue(d));
        assertThrows(IllegalArgumentException.class, () -> p.getValue(d));
    }

    private void pointEqualStandart(Point p){
        assertArrayEquals(Standart_vecto_Value, p.getValue());
        assertEquals(Standart_vecto_Value.length, p.getDimension());
    }
    private void vectorEqualStandart(Vector v){
        assertArrayEquals(Standart_vecto_Value, v.getValue());
        assertEquals(Standart_vecto_Value.length, v.getDimension());
    }
}
