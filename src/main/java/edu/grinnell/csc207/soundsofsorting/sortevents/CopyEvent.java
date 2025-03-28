package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> {
    
    T val;

    int index;

    /**
     * Copies val into arr at index
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        arr[index] = val;
    }

    /**
     * @return a list of the index into which we copy
     */
    public List<Integer> getAffectedIndices() {
        List<Integer> ret = new ArrayList<>();
        ret.add(index);
        return ret;
    }

    /**
     * @return <code>true</code> because this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
}
