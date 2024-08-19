package com.undoredo;

public interface Command {
    void execute();
    void undo();
}
