package com.undoredo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandManagerTest {

    private Canvas canvas;
    private CommandManager commandManager;

    @Before
    public void setUp() {
        canvas = new Canvas();
        commandManager = new CommandManager();
    }

    @Test
    public void testUndoRedo() {
        Command drawCommand = new DrawCommand(canvas, "Square");
        Command editCommand = new EditCommand(canvas, "Add shadow");
        Command formatCommand = new FormatCommand(canvas, "Italic");

        commandManager.executeCommand(drawCommand);
        assertEquals("Square", canvas.getDrawing());

        commandManager.executeCommand(editCommand);
        assertEquals("Add shadow", canvas.getEdit());

        commandManager.executeCommand(formatCommand);
        assertEquals("Italic", canvas.getFormat());

        commandManager.undo();
        assertNull(canvas.getFormat());

        commandManager.undo();
        assertNull(canvas.getEdit());

        commandManager.redo();
        assertEquals("Add shadow", canvas.getEdit());
    }
}
