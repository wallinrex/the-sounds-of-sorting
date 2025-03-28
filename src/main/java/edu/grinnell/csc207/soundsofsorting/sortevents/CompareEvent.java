package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> {

    int ind1;

    int ind2;

    /**
     * Does nothing
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        return;
    }

    /**
     * @return a list of the indices being compared
     */
    public List<Integer> getAffectedIndices() {
        List<Integer> ret = new ArrayList<>();
        ret.add(ind1);
        ret.add(ind2);
        return ret;
    }

    /**
     * @return <code>false</code> becasue this event is not emphasized
     */
    public boolean isEmphasized() {
        return false;
    }
}
