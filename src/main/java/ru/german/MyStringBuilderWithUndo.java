package ru.german;

import java.util.Stack;

public class MyStringBuilderWithUndo {
    private String text;
    private final Stack<String> history = new Stack<>();

    public MyStringBuilderWithUndo(String text) {
        this.text = text;
    }

    public void append(String text) {
        String s = this.text + text;
        saveState(this.text);
        this.text = s;
    }

    public void delete() {
        saveState(this.text);
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }

    private void saveState(String editor) {
        history.push(editor);
    }

    public void undo() {
        if (!history.isEmpty()) {
            String editor = history.pop();
            this.text = editor;
        }
    }
}
