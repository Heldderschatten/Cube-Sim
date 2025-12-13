package de.Heldderschatten.fx;

import Calculation.RoomRotion;
import Objects.IntegerObjects.Axis;
import Objects.IntegerObjects.Point;

import java.util.Set;

/**
 * Represents a Stone in a cube-oriented system. A Stone is a specific type of
 * {@link CubeElement} that has a set of connected sides.
 *
 * A Stone is defined by:
 * - A midpoint position, inherited from {@link CubeElement}.
 * - A collection of {@link Side}s that represent the sides of the Stone.
 * - A fixed size represented by the constant {@code SIZE_A_AND_B}.
 *
 * The Stone class provides functionality for rotating the Stone and its sides
 * around a specified axis.
 */
public class Stone extends CubeElement {
    public static final int SIZE_A_AND_B = 2;
    private Set<Side> sideSet;

    public Stone(Point midOfStone, Set<Side> sideSet) {
        super(midOfStone);
        this.sideSet = sideSet;
    }
    //todo imolement
    private boolean checkSidePostions( Point midOfStone, Set<Side> sideSet) {
        for (Side side : sideSet) {
            //Es muss überrpüft werden ob jede Seite genau gleichweit von der Mitte entfernt ist
        }
        return true;
    }

    /**
     * Rotates the stone and all its associated sides around the specified axis.
     *
     * @param rotation the axis around which the stone and its sides should be rotated
     */
    @Override
    public void rotate(Axis rotation) {
        for (Side side : sideSet) {
            side.rotate(rotation);
        }
        setPosition(RoomRotion.rotatePoint(rotation, getPosition()));
    }
}
