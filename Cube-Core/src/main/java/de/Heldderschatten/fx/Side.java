package de.Heldderschatten.fx;

import Objects.IntegerObjects.Point;



public class Side extends CubeElement {
    private final Color color;

    public Side(Point postion, Color color) {
        super(postion);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
