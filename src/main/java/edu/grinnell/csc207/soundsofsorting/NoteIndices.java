package edu.grinnell.csc207.soundsofsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {

    Integer[] indices;

    boolean[] highlights;

    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        highlights = new boolean[n];
    }

    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size. The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * 
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            lst.add(i);
        }
        Collections.shuffle(lst);
        indices = lst.toArray(new Integer[0]);
        highlights = new boolean[n];
    }

    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() {
        return indices;
    }

    /**
     * Highlights the given index of the note array
     * 
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        highlights[index] = true;
    }

    /**
     * @param index the index to check
     * @return true if the given index is highlighted
     */
    public boolean isHighlighted(int index) {
        return highlights[index];
    }

    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        highlights = new boolean[highlights.length];
    }
}
