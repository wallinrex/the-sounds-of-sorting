package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {

    int ind1;

    int ind2;

    /**
     * Constructor for CompareEvent object
     * @param first one index being compared
     * @param second the other index being compared
     */
    public CompareEvent (int first, int second) {
        ind1 = first;
        ind2 = second;
    }

    /**
     * Does nothing
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        return;
    }

    /**
     * @return a list of the indices being compared
     */
    @Override
    public List<Integer> getAffectedIndices() {
        List<Integer> ret = new ArrayList<>();
        ret.add(ind1);
        ret.add(ind2);
        return ret;
    }

    /**
     * @return <code>false</code> becasue this event is not emphasized
     */
    @Override
    public boolean isEmphasized() {
        return false;
    }
}
