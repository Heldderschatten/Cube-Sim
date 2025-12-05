import Calculation.RoomRotion;
import Objects.IntegerObjects.Axis;
import Objects.IntegerObjects.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Roation {
    private Point[] startPoints = {new Point(0, 0, 0), new Point(1,4,78)};
    private Point[] rXEndPoints = {new Point(0, 0, 0), new Point(1,-78,4)};
    private Point[] rYEndPoints = {new Point(0, 0, 0), new Point(78,4,-1)};
    private Point[] rZEndPoints = {new Point(0, 0, 0), new Point(-4,1,78)};

    @Test
    void Test_Roation() {
        for (int i = 0; i < startPoints.length; i++) {
            testPoint(RoomRotion.rotatePoint(Axis.X_AXIS,startPoints[i]), rXEndPoints[i]);
            testPoint(RoomRotion.rotatePoint(Axis.Y_AXIS,startPoints[i]), rYEndPoints[i]);
            testPoint(RoomRotion.rotatePoint(Axis.Z_AXIS,startPoints[i]), rZEndPoints[i]);
        }
    }

    void testPoint(Point p, Point soll) {
        assertEquals(soll.getDimension(), p.getDimension());
        for (int i = 0; i < p.getDimension(); i++) {
            assertEquals(soll.getValue()[i], p.getValue()[i]);
        }
    }
}
