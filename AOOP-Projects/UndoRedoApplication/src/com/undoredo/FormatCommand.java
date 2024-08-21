package com.undoredo;

public class FormatCommand implements Command {
    private String format;
    private String previousFormat;
    private Canvas canvas;

    public FormatCommand(Canvas canvas, String format) {
        this.canvas = canvas;
        this.format = format;
    }

    @Override
    public void execute() {
        previousFormat = canvas.getFormat();
        canvas.setFormat(format);
    }

    @Override
    public void undo() {
        canvas.setFormat(previousFormat);
    }
}
