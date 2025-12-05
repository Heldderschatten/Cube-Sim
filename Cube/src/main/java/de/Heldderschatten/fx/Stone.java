package de.Heldderschatten.fx;

import Objects.IntegerObjects.Point;

import java.util.Set;

/**
 *  A “stone” serves as a collection point for pages.
 *  Each individual page can be assigned to a stone.
 *  Each page can be assigned to exactly one stone. If you turn a stone, *all* pages turn with it!
 */
public class Stone {
    public static final int SIZE_A_AND_B = 2;
    private Point midOfStone;
    private Set<Side> sideSet;

    public Stone(Point midOfStone, Set<Side> sideSet) {
        this.midOfStone = midOfStone;
        this.sideSet = sideSet;
    }
    //todo imolement
    private boolean checkSidePostions( Point midOfStone, Set<Side> sideSet) {
        for (Side side : sideSet) {
            //Es muss überrpüft werden ob jede Seite genau gleichweit von der Mitte entfernt ist
        }
        return true;
    }

    public void roate(Rotation rotation) {

    }
}
