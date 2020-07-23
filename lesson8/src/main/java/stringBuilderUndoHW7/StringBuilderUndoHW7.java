package main.java.stringBuilderUndoHW7;

import java.util.ArrayList;

// ДЗ 7. StringBuilder с поддержкой операции Undo

public class StringBuilderUndoHW7 {

    private static StringBuilder stringBuilder;
    private static ArrayList<String> history = new ArrayList<>();

    public StringBuilderUndoHW7() {
        stringBuilder = new StringBuilder();
    }

    public StringBuilderUndoHW7(String str) {
        stringBuilder = new StringBuilder(str);
    }

    public StringBuilderUndoHW7(CharSequence seq) {
        stringBuilder = new StringBuilder(seq);
    }

    public StringBuilderUndoHW7 append(Object obj) {
        history.add(stringBuilder.toString());
        stringBuilder.append(String.valueOf(obj));
        return this;
    }

    public StringBuilderUndoHW7 undo() {
        stringBuilder.delete(0, stringBuilder.length());
        if (history.size() > 0) {
            stringBuilder.append(history.get(history.size() - 1));
            history.remove(history.size() - 1);
        }
        return this;
    }

    public StringBuilderUndoHW7 append(String str) {
        history.add(stringBuilder.toString());
        stringBuilder.append(str);
        return this;
    }

    public StringBuilderUndoHW7 append(CharSequence s) {
        history.add(stringBuilder.toString());
        stringBuilder.append(s);
        return this;
    }

    public StringBuilderUndoHW7 append(CharSequence s, int start, int end) {
        history.add(stringBuilder.toString());
        stringBuilder.append(s, start, end);
        return this;
    }

    public StringBuilderUndoHW7 append(char[] str, int offset, int len) {
        history.add(stringBuilder.toString());
        stringBuilder.append(str, offset, len);
        return this;
    }

    public StringBuilderUndoHW7 append(boolean b) {
        history.add(stringBuilder.toString());
        stringBuilder.append(b);
        return this;
    }

    public StringBuilderUndoHW7 append(char c) {
        history.add(stringBuilder.toString());
        stringBuilder.append(c);
        return this;
    }

    public StringBuilderUndoHW7 append(int i) {
        history.add(stringBuilder.toString());
        stringBuilder.append(i);
        return this;
    }

    public StringBuilderUndoHW7 append(long lng) {
        history.add(stringBuilder.toString());
        stringBuilder.append(lng);
        return this;
    }

    public StringBuilderUndoHW7 append(float f) {
        history.add(stringBuilder.toString());
        stringBuilder.append(f);
        return this;
    }

    public StringBuilderUndoHW7 append(double d) {
        history.add(stringBuilder.toString());
        stringBuilder.append(d);
        return this;
    }

    public StringBuilderUndoHW7 delete(int start, int end) {
        history.add(stringBuilder.toString());
        stringBuilder.delete(start, end);
        return this;
    }

    public StringBuilderUndoHW7 deleteCharAt(int index) {
        history.add(stringBuilder.toString());
        stringBuilder.deleteCharAt(index);
        return this;
    }

    public StringBuilderUndoHW7 replace(int start, int end, String str) {
        history.add(stringBuilder.toString());
        stringBuilder.replace(start, end, str);
        return this;
    }

    public StringBuilderUndoHW7 insert(int index, char[] str, int offset, int len) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(index, str, offset, len);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, Object obj) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, obj);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, String str) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, str);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, char[] str) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, str);
        return this;
    }

    public StringBuilderUndoHW7 insert(int dstOffset, CharSequence s) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(dstOffset, s);
        return this;
    }

    public StringBuilderUndoHW7 insert(int dstOffset, CharSequence s, int start, int end) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(dstOffset, s, start, end);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, boolean b) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, b);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, char c) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, c);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, int i) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, i);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, long l) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, l);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, float f) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, f);
        return this;
    }

    public StringBuilderUndoHW7 insert(int offset, double d) {
        history.add(stringBuilder.toString());
        stringBuilder.insert(offset, d);
        return this;
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public StringBuilderUndoHW7 reverse() {
        history.add(stringBuilder.toString());
        stringBuilder.reverse();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }

}
