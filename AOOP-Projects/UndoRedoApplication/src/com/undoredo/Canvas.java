package com.undoredo;

public class Canvas {
    private String drawing;
    private String edit;
    private String format;

    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
        System.out.println("Drawing: " + drawing);
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
        System.out.println("Edit: " + edit);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
        System.out.println("Format: " + format);
    }
}
