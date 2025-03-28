package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> {

    int ind1;

    int ind2;

    /**
     * Swaps the values at ind1 and ind2
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        T temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    /**
     * @return a list of the indices whose values are being swapped
     */
    public List<Integer> getAffectedIndices() {
        List<Integer> ret = new ArrayList<>();
        ret.add(ind1);
        ret.add(ind2);
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
