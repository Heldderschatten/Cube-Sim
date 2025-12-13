package de.Heldderschatten.fx;

import Objects.IntegerObjects.Axis;

import java.util.HashSet;
import java.util.Set;

public class Cube {
    private final Set<Stone> stones = new HashSet<>();
    private final int n;

    public Cube(int n) {
        this.n = n;
    }

    private void rotate(Axis axis, int number) {
        int index = axis.getIndex();
        for (Stone s : stones) {
            if (s.getPosition().getValue(index) == number) {
                s.rotate(axis);
            }
        }
    }

    public Set<Stone> getStones() {
        return stones;
    }

    public boolean checkSolved(){

    }

}
