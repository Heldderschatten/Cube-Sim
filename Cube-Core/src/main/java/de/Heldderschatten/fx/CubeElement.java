package de.Heldderschatten.fx;

import Calculation.RoomRotion;
import Objects.IntegerObjects.Axis;
import Objects.IntegerObjects.Point;

public abstract class CubeElement {
    private Point position;
    public CubeElement(Point position){
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Rotates the CubeElement around the specified axis.
     *
     * @param rotation the axis around which the CubeElement should be rotated
     */
    public void rotate(Axis rotation){
        setPosition(RoomRotion.rotatePoint(rotation, getPosition()));
    }
}
