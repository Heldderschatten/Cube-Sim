package de.Heldderschatten.fx;

import Objects.IntegerObjects.Point;



public class Side {
    private Point postion;
    private final Color color;

    public Side(Point postion, Color color) {
        this.postion = postion;
        this.color = color;
    }

    public Point getPostion() {
        return postion;
    }

    public void setPostion(Point postion) {
        this.postion = postion;
    }

    public Color getColor() {
        return color;
    }
}
