package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T> {
    
    T val;

    int index;

    /**
     * Constructor for CopyEvent object
     * @param value the value being copied
     * @param ind the index into which value is copied
     */
    public CopyEvent (T value, int ind) {
        val = value;
        index = ind;
    }

    /**
     * Copies val into arr at index
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        arr[index] = val;
    }

    /**
     * @return a list of the index into which we copy
     */
    @Override
    public List<Integer> getAffectedIndices() {
        List<Integer> ret = new ArrayList<>();
        ret.add(index);
        return ret;
    }

    /**
     * @return <code>true</code> because this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return true;
    }
}
