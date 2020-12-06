package timetable.components;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {

    // wrap each cell to fit the words
    WordWrapCellRenderer() {
        setFont(new Font("Verdana", Font.PLAIN, 24));
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    // draw the text and background color
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        try {
            setText(value.toString());
            this.setBackground(new Color(113, 170, 186));
            if (value.toString().equals("")) this.setBackground(new Color(123, 222, 159));
        } catch (Exception e) {
            setText("");
            this.setBackground(new Color(123, 222, 159));
        }
        return this;
    }
}