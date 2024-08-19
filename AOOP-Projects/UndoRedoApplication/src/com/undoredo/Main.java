package com.undoredo;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        CommandManager commandManager = new CommandManager();

        // Draw something
        Command drawCommand = new DrawCommand(canvas, "Circle");
        commandManager.executeCommand(drawCommand);

        // Edit the drawing
        Command editCommand = new EditCommand(canvas, "Add color");
        commandManager.executeCommand(editCommand);

        // Format the drawing
        Command formatCommand = new FormatCommand(canvas, "Bold");
        commandManager.executeCommand(formatCommand);

        // Undo last action (format)
        commandManager.undo();

        // Undo previous action (edit)
        commandManager.undo();

        // Redo the last undone action (edit)
        commandManager.redo();
    }
}
