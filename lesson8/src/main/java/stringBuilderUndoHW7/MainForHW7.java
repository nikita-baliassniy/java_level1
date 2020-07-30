package main.java.stringBuilderUndoHW7;

public class MainForHW7 {

    public static void main(String[] args) {

        StringBuilderUndoHW7 stringBuilderUndoHW7 = new StringBuilderUndoHW7();
        stringBuilderUndoHW7.append("Hello ");
        stringBuilderUndoHW7.append("my ");
        stringBuilderUndoHW7.append("old ");
        stringBuilderUndoHW7.insert(7, " hey ");
        stringBuilderUndoHW7.append("friend ");
        stringBuilderUndoHW7.append("!");
        stringBuilderUndoHW7.reverse();
        System.out.println(stringBuilderUndoHW7.toString());

        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
        System.out.println(stringBuilderUndoHW7.undo().toString());
    }
}
