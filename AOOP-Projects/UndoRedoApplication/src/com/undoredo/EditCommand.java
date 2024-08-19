package com.undoredo;

public class EditCommand implements Command {
    private String edit;
    private String previousEdit;
    private Canvas canvas;

    public EditCommand(Canvas canvas, String edit) {
        this.canvas = canvas;
        this.edit = edit;
    }

    @Override
    public void execute() {
        previousEdit = canvas.getEdit();
        canvas.setEdit(edit);
    }

    @Override
    public void undo() {
        canvas.setEdit(previousEdit);
    }
}
