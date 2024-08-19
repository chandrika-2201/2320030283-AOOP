package com.undoredo;

public class DrawCommand implements Command {
    private String drawing;
    private String previousDrawing;
    private Canvas canvas;

    public DrawCommand(Canvas canvas, String drawing) {
        this.canvas = canvas;
        this.drawing = drawing;
    }

    @Override
    public void execute() {
        previousDrawing = canvas.getDrawing();
        canvas.setDrawing(drawing);
    }

    @Override
    public void undo() {
        canvas.setDrawing(previousDrawing);
    }
}
