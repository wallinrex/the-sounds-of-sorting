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
        super.paintComponent(g);
        Integer[] indices = notes.getNotes();
        int height = getHeight();
        int maxHeight = max(indices) + 1;
        int heightScale = height / maxHeight;
        int colorScale = 255 / maxHeight;
        int width = getWidth();
        int barWidth = width / indices.length;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        for(int i = 0; i < indices.length; i++) {
            g.setColor(new Color(colorScale * indices[i], 0, colorScale * indices[i]));
            g.fillRect(i * barWidth, 0, barWidth, height);
            g.setColor(Color.WHITE);
            g.fillRect(i * barWidth, 0, barWidth, height - heightScale * (indices[i] + 1));
        }
    }
}