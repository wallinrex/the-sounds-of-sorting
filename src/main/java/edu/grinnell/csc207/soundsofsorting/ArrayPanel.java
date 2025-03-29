package edu.grinnell.csc207.soundsofsorting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    private NoteIndices notes;

    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * 
     * @param notes  the note indices
     * @param width  the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    private static int max(Integer[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        Integer[] indices = notes.getNotes();
        int barWidth = getWidth() / indices.length;
        int heightScale = getHeight() / (max(indices) + 1);
        int colorScale = 255 / max(indices);
        g.setColor(Color.lightGray);
        for (int i = 0; i < indices.length; i++) {
            g.setColor(new Color(0, indices[i] * colorScale, 0));
            g.fillRect(i * barWidth, getHeight(), barWidth, -(indices[i] + 1) * heightScale);
        }
    }
}